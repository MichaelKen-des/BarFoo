package com.epam;

import org.apache.log4j.Logger;

public class App
{

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {
        logger.info("I'm info");

        for (int i = 1; i <= 100; i++)
        {
            for (int j=i; j<=i;j++)
            {
                if (j % 15 == 0)
                {
                    System.out.println("FizzBuzz");
                    break;
                }
                if (j % 3 == 0) System.out.println("Fizz");
                if (j % 5 == 0) System.out.println("Buzz");
            }
        }
    }
}