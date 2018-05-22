package laba5;

import java.util.ArrayList;
import java.util.List;

public class OneLinkedList {
    private OneLinkedNode root = null;

    OneLinkedList(int n)
    {
        for (int i = 0; i < n; i++) {
            addLast(i);
        }
    }

    //Add element to the begining
    public void addFirst(int data) {
        if (root == null) {
            root = new OneLinkedNode(data);
        } else {
            root = new OneLinkedNode(data, root);
        }
    }

    //Add element in the end
    public void addLast(int data) {
        if (root == null) {
            addFirst(data);
        } else {
            OneLinkedNode node = root;
            while (node.next() != null) {
                node = node.next();
            }
            node.setNext(new OneLinkedNode(data));
        }
    }

    //Remove first element
    public void removeFirst() {
        if (root != null) {
            OneLinkedNode node = root.next();
            root.setNext(null);
            root = node;
        }
    }

    //Find element with current data
    public OneLinkedNode find(int data) {
        OneLinkedNode node = root;
        while (node != null && node.getData() != data) {
            node = node.next();
        }
        return node;
    }

    //Get last element
    public int getLast()
    {
        OneLinkedNode node = root;
        while (node.next() != null) {
            node = node.next();
        }
        return node.getData();
    }

    //Get size node list
    public int getSize() {
        int count = 0;
        OneLinkedNode node = root;
        while (node != null) {
            node = node.next();
            count++;
        }
        return count;
    }
    //Remove last element
    public void removeLast()
    {
        OneLinkedNode node=root;
        while(node.getNext().getNext()!=null)
        {
            node = node.next();
        }
        node.setNext(null);
    }

    //Inversion list
    public void invert() {
        int currentPosition = 0;
        while (currentPosition <= getSize()-1)
        {
            OneLinkedNode node = root;
            for (int i = 0; i < currentPosition; i++) node = node.next();
            node.setNext(new OneLinkedNode(node.getData(), node.getNext()));
            node.setData(getLast());
            removeLast();
            currentPosition++;
        }
    }

    //Bubble sort
    public void sort() {
        boolean isSorted;
        int temp;
        int count;
        int size = getSize();
        while (true) {
            count = 0;
            isSorted = true;
            OneLinkedNode node = root;
            while (size - 1 > count) {
                if (node.getData() > node.getNext().getData()) {
                    temp = node.getData();
                    node.setData(node.next().getData());
                    node.next().setData(temp);
                    node = node.next();
                    isSorted = false;
                }
                else
                {
                    node = node.next();
                }
                count++;
            }
            if (isSorted) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        OneLinkedNode node = root;
        List<Integer> list=new ArrayList<>();
        while (node != null)
        {
            list.add(node.getData());
            node=node.getNext();
        }
        return list.toString();
    }
}
