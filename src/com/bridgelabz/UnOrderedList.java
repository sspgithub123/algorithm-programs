package com.bridgelabz;
import java.util.Scanner;

class NodL{
    NodL next=null;
    String data=null;
}

class Linked{
    NodL head = new NodL();
    int size=0;

    public void add(String data) {
        NodL node = new NodL();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public boolean searchAndAddOrPop(String data) {
        if (size > 0) {
            NodL n = head;
            NodL pre=null;
            while (n.next != null) {
                if(head.data.equals(data)) {
                    head=null;
                    return true;
                }
                else if (n.data.equals(data)) {
                    pre.next=n.next;
                    return true;

                }
                pre=n;
                n = n.next;
            }
            add(data);
            return false;

        } else {
            add(data);
            return false;
        }

    }
}
public class UnOrderedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String [] st = s.nextLine().split(" ");
        Linked list = new Linked();
        for(int i =0; i<st.length; i++) {
            list.add(st[i]);
        }
        System.out.println("Enter word to search: ");
        String word = s.next();
        if(list.searchAndAddOrPop(word)) {
            System.out.println("removed!");
        }else {

            System.out.println("not Found \n Added!");
        }

    }
}
