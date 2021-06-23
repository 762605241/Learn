package test;

import java.io.ObjectOutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(4);
        hashMap.put(null, 1);
        hashMap.put(null, 2);
        System.out.println(hashMap.get(null));
    }

    class finalMethodTest {
        static final  String a = "111";
        private void test() {
            System.out.println("1");
        }
    }
}

