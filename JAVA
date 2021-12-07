# mark
mark
package com.company;

import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        int mark;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mark:");
         mark =in.nextInt();

        if (mark>=90 &&  mark<=100)
            System.out.println("A");
        else if(mark>=80 && mark<=90)
            System.out.println("B");
        else if(mark>=70 && mark<=80)
            System.out.println("C");
        else if(mark>=60 && mark<=70)
            System.out.println("D ");
        else
            System.out.println("pleas enter a valid mark");

    }

}
