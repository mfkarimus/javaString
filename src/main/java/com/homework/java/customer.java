package com.homework.java;

import java.util.Scanner;

public class customer {
    public static void main(String[] args) {

        //int pw=12345;

        Scanner obj=new Scanner(System.in);

       // System.out.println("Enter your password");
        //int password =obj.nextInt();
        //System.out.println(password);



        System.out.println("what kind of coffee do you like? for small press S,for medium press M,for large press L");

        String size= obj.nextLine();

       // int size=obj.nextInt();

       // if(password==pw) {
           // System.out.println("you enter correct password");
        //}

         if (size.equalsIgnoreCase("s"))
        {
            System.out.println("i like hot coffee");
            System.out.println("you select small coffee");
            System.out.println("how many coffee do you want");
            int count=obj.nextInt();
            int price=3;
            int totalbill=count*price;
            System.out.println("total bill= "+totalbill);

        }

        else if (size.equalsIgnoreCase("m"))
        {
            System.out.println("i like hot coffee");
            System.out.println("you select medium coffee");
            System.out.println("how many coffee do you want");
            int count=obj.nextInt();
            int price=4;
            int totalbill=count*price;
            System.out.println("total bill= "+totalbill);

        }

        else if (size.equalsIgnoreCase("l"))
        {
            System.out.println("i like hot coffee");
            System.out.println("you select large coffee");
            System.out.println("how many coffee do you want");
            int count=obj.nextInt();
            int price=5;
            int totalbill=count*price;
            System.out.println("total bill= "+totalbill);

        }

        else{
            System.out.println("you press wrong, press should be s,m,l");
        }
        System.out.println("thanks for visit dunkin website");
    }
}
