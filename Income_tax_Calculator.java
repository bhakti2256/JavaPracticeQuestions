package com.company;

import java.util.Scanner;

public class Income_tax_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-->Enter the Income (in Lac per Year) :");
        double income = sc.nextFloat();
        double tax = 0;

  /*     Income Slab	Tax
        2.5L – 5.0L  	5%
        5.0L – 10.0L 	20%
         Above 10.0L	30%
  */
        if(income >= 2.5 && income <= 5.0)
            tax = (income-2.5)*0.05;
        else if(income >= 5.0 && income <= 10.0)
            tax = (income-5.0)*0.2 + (5.0-2.5)*0.05;
        else if(income >= 10.0 )
            tax = (income-10)*0.3 +(10.0-5.0)*0.2+(5.0-2.5)*0.05;


        System.out.println("-->Payable tax is "+ tax);
    }
}
