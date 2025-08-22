package org.example;

class UserValidator
{
    public boolean validateAge(double age)
    {
        if (age >= 30) {
            return true;
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
            return false;
        }
    }


    public static void validateHeight(double height)
    { if(height >= 160)
        {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
         }
    }
}

public class App
{
    public static void main (String... args)
    {
        double age = 40.5;
        double height = 178;
        String name = "Adam";

        UserValidator validator = new UserValidator();
        boolean isOlderThanThirty = validator.validateAge(age);


        if(name != null)
        {
            if(isOlderThanThirty)
            {
                validator.validateHeight(height);
            }

        }
    }
}