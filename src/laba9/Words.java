package laba9;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Words {

  public static boolean isLetter(char c) {    
    if ( (c >= 97) && (c <= 122) ) return true; // a - z
    if ( (c >= 65) && (c <= 90) )  return true; // A - Z
    return false;
  }
  
  public static char toLower(char c) {
    if ( (c >= 65) && (c <= 90) )  return (char)((char)c+32); // A-Z to a-z
    return c;
  }
  
  public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer("");

    try {
      InputStreamReader isr = new InputStreamReader(new FileInputStream("stand.txt"), Charset.forName("CP1251"));
      BufferedReader br = new BufferedReader(isr);
      String line;
      String NL = System.getProperty("line.separator");
      while ( (line = br.readLine()) != null) {
        sb.append(line + NL);
      }
      br.close();
    } catch (FileNotFoundException ex) {
      System.out.println("Файл не найден");
    } catch (IOException ex) {
      System.out.println("Ошибка ввода-вывода");
    }

    String text = sb.toString();
    Map<String, Integer> words = new TreeMap<String, Integer>();



    int tWords = 0;

    StringBuffer word = new StringBuffer();
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if ( isLetter(c) ) {
        word.append(toLower(c));
      }
      else {
        if ( word.length() != 0 ) {
          tWords++;
          if (words.containsKey(word.toString())) {
            words.put(word.toString(), words.get(word.toString()) + 1);
          }
          else {
             words.put(word.toString(), 1);
          }
        }
        word.delete(0, word.length());
      }
    }



    System.out.println("Всего слов = " + tWords);
    int uWords = words.size();
    System.out.println("Уникальных слов = " + uWords);

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
      for (Map.Entry<String, Integer> entry: words.entrySet()) {
        bw.write(entry.getKey() + " = " + entry.getValue());
        bw.newLine();
      }
      bw.close();
    } catch (IOException ex) {
      System.out.println("Ошибка ввода-вывода");
    }

  }
}
