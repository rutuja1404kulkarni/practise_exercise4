package com.stackroute;

import java.util.Scanner;

public class ReplaceCharacter
{
    String string1="";
    Scanner scanner=new Scanner(System.in);
    public void replaceChar()
    {
        System.out.println("Enter String");
        string1=scanner.nextLine();

        String string2=string1.replaceAll("d","f");
        String finalString=string2.replaceAll("l","t");

        System.out.println("The String After Replacement is "+finalString);
    }

    public static void main(String[] args) {
        ReplaceCharacter replaceCharacter=new ReplaceCharacter();
        replaceCharacter.replaceChar();
    }
}
