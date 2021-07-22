package test;


public class Test {
    public static void main(String[] args) {
        System.out.println(getSubStringIndex("acabc", "ab"));
    }

    public static int getSubStringIndex(String str, String subStr) {
        int strLength = str.length();
        int subStrLength = subStr.length();
        char[] strArray = str.toCharArray();
        char[] subStrArray = subStr.toCharArray();
        boolean isFind = false;
        for (int i = 0; i < strLength; i++) {
            int j = 0;
            if (strArray[i] == subStrArray[j]) {
                int m = i;
                while (m < strLength && j < subStrLength) {
                    if (strArray[m] == subStrArray[j]) {
                        m++;
                        j++;
                        isFind = true;
                    } else {
                        isFind = false;
                        break;
                    }
                }
                if (isFind) {
                    return i;
                }
            }
        }
        return -1;
    }
}








