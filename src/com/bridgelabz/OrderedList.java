package com.bridgelabz;
import java.util.Scanner;

class NodO{
    NodO next=null;
    Integer data= Integer.MIN_VALUE;
}

class LinkedOrder{
    NodO head = new NodO();
    int size=0;

    public void add(Integer data) {
        NodO node = new NodO();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public boolean searchAndAddOrPop(Integer data) {
        if (size > 0) {
            NodO n = head;
            NodO pre=null;
            while (n.next != null) {
                if(head.data.equals(data)) {
                    head=null;
                    size=0;
                    return true;
                }
                else if (n.data.equals(data)) {
                    pre.next=n.next;
                    size--;
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
public class OrderedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int si = s.nextInt();
        LinkedOrder list = new LinkedOrder();
        for(int i=0;i<si; i++) {
            list.add(s.nextInt());
        }
        System.out.println("Enter Number to Find: ");
        int find = s.nextInt();
        list.searchAndAddOrPop(find);

    }
}
