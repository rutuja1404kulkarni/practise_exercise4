package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeInAlphabeticalOrder {
    String string;
//    int n;
//    String temp;
    Scanner scanner=new Scanner(System.in);
    public void arrange()
    {

//        System.out.println("Enter number of words in paragraph");
//        n=scanner.nextInt();
        System.out.println("Enter a String");
//        string=new String[n];
//        for(int i=0;i<n;i++)
//        {
//            string[i]=scanner.nextLine();
//        }
        string=scanner.nextLine().toLowerCase();
        char ArrayOfString[]=string.toCharArray();

//        for (int i=0;i<n;i++)
//        {
//            for (int j=i+1; j< n; j++)
//            {
//                if(string[i].compareTo(string[j])>0)
//                {
//                    temp=string[i];
//                    string[i]=string[j];
//                    string[j]=temp;
//                }
//            }
//
//        }
        Arrays.sort(ArrayOfString);
        System.out.println("Strings in Sorted Order"+Arrays.toString(ArrayOfString));

//        for (int i=0;i<n-1;i++)
//        {
//            System.out.println(string[i]);
//        }
//        System.out.println(string[n-1]);
    }

    public static void main(String[] args) {
        ArrangeInAlphabeticalOrder arrange=new ArrangeInAlphabeticalOrder();
        arrange.arrange();
    }
}
