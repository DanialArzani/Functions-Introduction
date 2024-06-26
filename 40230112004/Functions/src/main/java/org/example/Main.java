package org.example;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static String normalizer(String name)
    {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public static String fullName(String firstName, String lastName)
    {
        String resultFirstName =normalizer(firstName);
        String resultLastName = normalizer(lastName);

        return (resultFirstName + " " + resultLastName);

    }
    public static String phoneNumber(String number)
    {

        if(number.length() == 10 && number.charAt(0)=='9')
        {
            return ("0"+number);
        }
        else
        {
            System.out.println("wrong entry. try again");
            phoneNumber(scanner.nextLine());
        }
        return null;

    }
    public static String userId(String Id)
    {
        if (Id.length()>4 && Id.length()<13)
        {
            return Id;
        }
        else
        {
             System.out.println("wrong entry. try again");
             userId(scanner.nextLine());
        }
        return null;

    }

    public static String[] getInterests (String interests) {

        String[] interestsList = new String[10];
       for( int interestsListIndex = 0; interestsListIndex < 10; interestsListIndex++)
        {
            if (interests.equals("done"))
            {
                break;
            }
            interestsList[interestsListIndex] = interests;
            interests = scanner.nextLine();
        }
        return interestsList;






    }
    public static void userFullInformation (String fullName , String phoneNumber, String userId , String [] interests)
    {
        System.out.println("Hello! My name is "+fullName+". My Id is "+userId+"Here are my interests: ");
        for(int i = 0 ; i< interests.length ; i++)
        {
            System.out.println(i + "."+ interests[i]);
        }
        System.out.println("You can reach me via my phone number : " + phoneNumber);
    }

    public static void main(String[] args)
    {
        System.out.print("Please enter your name: ");
        String fullNameHolder  = fullName(scanner.nextLine(),scanner.nextLine());
        System.out.print("Please enter your phone number: ");
        String phoneNumberHolder = phoneNumber(scanner.nextLine());
        System.out.print("Please enter your user Id: ");
        String userIdHolder = userId(scanner.nextLine());
        System.out.println("Please share your interests: ");
        String [] interestsHolder  = getInterests(scanner.nextLine());
        userFullInformation(fullNameHolder,phoneNumberHolder,userIdHolder,interestsHolder);



    }
}