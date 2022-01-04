package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vnd,usd,rate;
        System.out.println("Enter VND:");
        vnd = sc.nextFloat();
        rate = 23000;
        usd = vnd/rate;
        System.out.printf("%.0f VND equal to %.2f USD",vnd,usd);
    }
}
