package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("h:");
    int h = sc.nextInt();
    System.out.println("r:");
    int r = sc.nextInt();
    System.out.println("S:" +3.14 * r * r * h);
}
}
