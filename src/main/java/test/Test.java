package test;

import java.io.ObjectOutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;

public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
    }

    class finalMethodTest {
        static final  String a = "111";
        private void test() {
            System.out.println("1");
        }
    }
}

