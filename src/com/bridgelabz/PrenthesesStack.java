package com.bridgelabz;
import java.util.Scanner;

class NodS<T> {
    NodS<T> next=null;
    T data;
}

class Stack2<T> {
    NodS<T> head;
    int size = 0;

    Stack2() {
        head = new NodS<T>();
    }

    public void put(T data) {
        if (head == null) {
            head.data = data;
        } else {
            NodS<T> n = new NodS<T>();
            n.data = data;
            n.next = head;
            head = n;
        }
        size++;
    }

    public void pop() {
        if (size > 0) {
            head = head.next;
            size--;
        } else
            System.out.println("Empty Stack");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
public class PrenthesesStack {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter Expression: ");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        Stack2<String> bl = new Stack2<>();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '(') {
                bl.put("+");
                count++;
            } else if (st.charAt(i) == ')') {
                bl.pop();
                count--;
            }
        }
        if (count==0) {
            System.out.println("Balanced equation");
        } else {
            System.out.println("Not Balanced equation");

        }
    }
}
