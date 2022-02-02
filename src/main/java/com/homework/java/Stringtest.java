package com.homework.java;

import java.util.Locale;


public class Stringtest {

    public static void main(String[] args) {
        String fname="MohaMmad"; //best
        String mname="Fazlul";
        String lname="Karim";

        String up=fname.toUpperCase();
        System.out.println(up);

        String lo=up.toLowerCase();
        System.out.println(lo);


        String f="mohammad";
                int a=10;
                int b=20;
               //if(a==b)
        if(fname.equalsIgnoreCase(f)) //for ignore case
        {
            System.out.println("name should be equal");
        }


        if(fname.equals(f)) // for fname is equal or not
            {
                System.out.println("name is equal");
            }

        else{
                System.out.println("name is not equal");
            }



       String name=new String("Mohammad Fazlul Karim 2"); //This is not best

        String fullname=fname+" "+mname+" "+lname;
        //String fullname=fname+mname+lname;
        //String conname=fname.concat(mname).concat(lname); //This is not best

        System.out.println("fname="+fname);
        System.out.println("mname="+mname);
        System.out.println("lname="+lname);
        System.out.println("f="+f);

        System.out.println("name="+name); //for line number 38
        //System.out.println("fullname="+conname);//for line number 42

        //System.out.println("My fullname= "+fname+" "+mname+" "+lname); //for line number 41
        System.out.println("My fullname= "+fullname); //for line number 40


    }

}
