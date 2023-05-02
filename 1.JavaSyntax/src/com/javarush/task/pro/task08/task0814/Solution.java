package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {

        int i = number | (1 << flagPos);
        return i;
    }

    public static int resetFlag(int number, int flagPos) {
        int i = number & ~(1 << flagPos);
        return i;
    }

    public static boolean checkFlag(int number, int flagPos) {
        boolean b = (number & (1 << flagPos)) == (1 << flagPos);
        return b;
    }
}
