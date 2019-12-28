package com.icode.interview.algorithm;

public class ABC {
    public static void main(String[] args) {
        char[] str = { 'A', 'B', 'C' };

        combination(str);

    }

    private static void combination(char[] str) {
        // TODO Auto-generated method stub
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (i != j)
                    for (int k = 0; k < str.length; k++) {
                        if (i != k && j != k)
                            System.out.printf("%c%c%c\n", str[i], str[j], str[k]);
                    }
            }
        }
    }
}
