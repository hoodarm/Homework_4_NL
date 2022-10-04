package com.company;

public class Main {

    public static void main(String[] args) {
        Part1();
        System.out.println();
        Part2();
    }

    static void Part1()
    {
        for (int i = 6; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void Part2()
    {
        for(int i = 1; i<=6; i++)
        {
            for (int j = 1; j<=i;j++)
                System.out.print("*");
            for (int j = i; j<=5; j++)
                System.out.print("-");
            System.out.println();
        }
    }
}
