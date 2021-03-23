package com.practice;

import java.util.Scanner;

public class Strings_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I am a String";

        //Question 1:
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));

        //Question 2:
        System.out.println(str.replace(' ','_'));

        //Question 3:
        String s = "Dear name, Thanks a lot!";
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.println(s.replace("name",name));

        //Question 4:
        String str1 = "Hello   I  am Java   ";
        System.out.println(str1.indexOf("  "));
        System.out.println(str1.indexOf("   "));

        //Question 5:
        String letter = "Hi, \nI am Bhakti. \nI am learning Java from CodeWithHarry!";
        System.out.println(letter);
    }
}
