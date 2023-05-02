package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        System.out.println(cube(3));
    }
    public static long cube(long stepen) {

        return (long) Math.pow(stepen, 3);
    }}