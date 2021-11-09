package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Write a program to find the remainder when an integer A is divided by an integer B.
       Input
       The first line contains an integer T, the total number of test cases.
       Then T lines follow, each line contains two Integers A and B.
	 */

   /*  Output
       For each test case, find the remainder when A is divided by B, and display it in a new line.

       Constraints
       1 ≤ T ≤ 1000
       1 ≤ A,B ≤ 10000
       Example
       Input
       3
       1 2
       100 200
       40 15

       Output
       1
       100
       10
       */
     Scanner sc = new Scanner(System.in);
     int t,a,b,z;
     t = sc.nextInt();
     for(int i=0;i<t;i++){
     a = sc.nextInt();
     b = sc.nextInt();
     z = a%b;
     System.out.println(z);
}
    }
}
