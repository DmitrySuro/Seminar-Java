package Seminar4;
// Реализовать стэк с помощью массива. 

import java.lang.reflect.Array;

// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class stack<E> {
    private E[] massive;

    public stack(int i) {
        massive = (E[]) new Object[i];
    }

    public Integer size() {
        int count = 0;
        for (E item : massive) {
            if (item != null) {
                count += 1;
            }
        }
        return count;
    }

    public boolean empty() {
        Boolean flag = true;
        if (massive[0] != null) {
            flag = false;
        }
        return flag;
    }

    public void push(E itemE) {

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == null) {
                massive[i] = itemE;
                return;
            }
        }
    }

    public E peek() {
        return massive[this.size() - 1]; // this - вызываем функиц конкретного обьекта
    }

    public E pop() {
        E elment = massive[this.size() - 1];
        massive[this.size() - 1] = null;
        return elment;
    }
}
