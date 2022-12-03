package Seminar4;

import stack;

public class stack1 {
    public static void main(String[] args) {
        stack<Integer> massive = new stack<>(10);
        System.out.println(massive.size());
        massive.push(1);
        massive.push(2);
        massive.push(3);
        massive.push(4);
        massive.push(4);
        System.out.println(massive.size());
        System.out.println(massive);
    }

}
