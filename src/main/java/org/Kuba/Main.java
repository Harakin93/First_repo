package org.Kuba;

public class Main {
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