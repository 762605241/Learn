package test;

import java.io.Externalizable;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;

public class Test {
    public static void main(String[] args) {

    }

    private static void test(int[] s) {
        s[0] = 99;
        s = new int[]{9, 9};
    }


}

