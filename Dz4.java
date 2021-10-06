package com.company;

public class Dz4 {
    // Задание 2, вариант 1
    public static int [][] a = {{0,0,0,0,5,0,0}, {0,0,0,4,5,0,0}, {0,0,3,4,5,0},{0,2,3,4,5,0},{1,2,3,4,5}};
    public static void main(String[] args) {
        System.out.print(arrToString());

    }
    public static String arrToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                if (a[i][j]!=0) {
                    String s=Integer.toString(a[i][j]);
                    String padded = String.format("%2s", s);
                    result.append(padded);
                }
                else result.append(" ");
            result.append("\n");
        }
        return result.toString();
    }
}
