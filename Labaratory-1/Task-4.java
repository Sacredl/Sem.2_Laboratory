package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int random1 = a + (int) (Math.random() * b);
        int[] M = new int[random1];
        for(int i=0;i<random1;i++) {
            int random2 = a + (int) (Math.random() * b);
            M[i] = random2;
            System.out.print(M[i] + " ");
        }
        Arrays.sort(M);
        System.out.println();
        for(int i=0;i<random1;i++) {
            System.out.print(M[i] + " ");
        }
    }
}
