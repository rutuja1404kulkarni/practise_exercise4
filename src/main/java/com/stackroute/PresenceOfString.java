package com.stackroute;

import java.util.Scanner;

public class PresenceOfString
{
    String string;
    Scanner scanner=new Scanner(System.in);

    public void searchString()
    {
        System.out.println("Enter a string");
        string=scanner.nextLine();
        System.out.println("Enter a string you want to search");
        String s=scanner.nextLine();
        if(string.contains(s))
        {
            System.out.println("String is present");
        }
        else
            System.out.println("String is not present");
    }

    public static void main(String[] args) {


        PresenceOfString presence = new PresenceOfString();
        presence.searchString();

    }
}
