package com.java.algorithms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter your FirstName : ");
        String name=sc.next();
        System.out.println("Enter SecondName : ");
        String lastName=sc.next();
        System.out.println("enter your mobile number : ");
        String number=sc.next();
        System.out.println("enter date : ");
        String date=sc.next();

        if(isValidName(name)){
            System.out.println("valid firstName");
        }else
            System.out.println("firstName not valid");

        if(isValidName(lastName))
            System.out.println("valid last name");
        else
            System.out.println("last name not valid");


        if(isValidMobileNumber(number)){
            System.out.println("mobile number is valid");
        }
        else
            System.out.println("not valid mobile number");
        if(isValidDate(date))
            System.out.println("date is valid");
        else
            System.out.println("date is not valid");

        System.out.println("Hello "+name+", We have your full\n" +
                "name as "+name+" "+lastName+" in our system. your contact number is "+number+"\n" +
                "Please,let us know in case of any clarification Thank you BridgeLabz "+date+"\n" );

    }

    public static boolean isValidMobileNumber(String number) {
        //(0/91): number starts with (0/91)
        //[7-9]: starting of the number may contain a digit between 0 to 9
        //[0-9]: then contains digits 0 to 9
        //the matcher() method creates a matcher that will match the given input against this pattern

       Pattern mobilePattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = mobilePattern.matcher(number);
        return (match.find() && match.group().equals(number));

    }
    public static boolean isValidDate(String date){
        //day/month/year eg : 23/11/2016
        Pattern datePattern = Pattern.compile("^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$");
        Matcher match=datePattern.matcher((date));
        return (match.find() && match.group().equals((date)));
    }


    // validate first name
    public static boolean isValidName( String firstName ) {
        return firstName.matches( "[A-Z][a-z]*" );
    }
    // validate last name
    public static boolean isValidLastName( String lastName ) {
        return lastName.matches( "[A-Z]+([ '-][a-zA-Z]+)*" );
    }

    }

