package com.bridgelabz;

//import sun.security.util.Length;

import java.util.Scanner;
class A{
    public  void Length()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Values");
        Integer x1= input.nextInt();
        Integer x2= input.nextInt();
        Integer y1= input.nextInt();
        Integer y2= input.nextInt();

        Integer a1= input.nextInt();
        Integer a2= input.nextInt();
        Integer b1= input.nextInt();
        Integer b2= input.nextInt();

        Double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double lengthTwo = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));


        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}
public class LineProgram  {
    public static void main(String[] args)
    {
        A lengthOne=new A();
        A lengthTwo=new A();
        A a1 =new A();
        a1.Length();

        if(lengthOne.equals(lengthTwo)){
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        boolean diffInLength = lengthOne.equals(lengthTwo);
        if (diffInLength == true) {
            System.out.println("Equal of line length");
        } else if (diffInLength = false) {
            System.out.println("Line1 is greater in length than lengthOne ");
        } else System.out.println("Line1 is smaller in length than lengthTwo ");
    }
}