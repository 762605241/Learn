package test;

import java.util.Deque;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        breakFlag1:
        for (int i = 0; i < 33; i++) {
            for (int j = 0; j < 55; j++) {
                a++;
                continue breakFlag1;
            }
            b++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
