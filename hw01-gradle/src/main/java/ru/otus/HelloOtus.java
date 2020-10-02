package ru.otus;

import com.google.common.math.IntMath;

import java.math.RoundingMode;
import java.util.Scanner;

public class HelloOtus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!\n"  + "Input digit to calculate square root: ");
        System.out.println("Result: " + IntMath.sqrt(sc.nextInt(), RoundingMode.UP));
    }
}
