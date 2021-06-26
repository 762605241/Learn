package test;

import java.io.ObjectOutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;

public class Test {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>(4);
//        hashMap.put(null, 1);
//        hashMap.put(null, 2);
//        System.out.println(hashMap.get(null));
        System.out.println(tableSizeFor(12));
    }

    class finalMethodTest {
        static final  String a = "111";
        private void test() {
            System.out.println("1");
        }
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= (1 << 30)) ? (1 << 30) : n + 1;
    }
}

