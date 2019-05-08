package com.stackroute;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OccurenceInString
{
    public void findOccurenceOfChar()
    {

        String inputString="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        inputString=scanner.nextLine().toLowerCase().trim();

        HashMap<Character,Integer> charCountMap=new HashMap<Character, Integer>();
        char[] strArray=inputString.toCharArray();
        for (char c: strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c,1);
            }

        }
        System.out.println(charCountMap);

    }

    public static void main(String[] args) {
        OccurenceInString string=new OccurenceInString();
        string.findOccurenceOfChar();
    }
}
