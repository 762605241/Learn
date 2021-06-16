package test;

import java.util.Deque;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str4));

    }
}
