package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch
{
    String string,substring;
    Scanner scanner=new Scanner(System.in);
    public void findOccurence()
    {
        System.out.println("Enter the string");
        string=scanner.nextLine().toLowerCase();
        System.out.println("Enter the string whos occurence you want to find");
        substring=scanner.nextLine();
        Pattern pattern=Pattern.compile(substring);
        Matcher matcher=pattern.matcher(string);

        int count=0;
        while(matcher.find())
        {
            count++;
            System.out.print("Found at ");
            System.out.println(matcher.start()+"-"+matcher.end());
        }
    }

    public static void main(String[] args) {
        PatternMatch patternMatch=new PatternMatch();
        patternMatch.findOccurence();
    }
}
