package com.SuperCalculator.CalcProgram.driver;

/**
 * Class containing terminal application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length < 2) {
            System.out.println("Insufficient parameters. Please refer below for how to use the command line tool");
            System.exit(1);
        }

        if ("--show-message".equals(args[0])) {
            if (args[1] != null && !args[1].isEmpty()) {
                System.out.println(args[1]);
            } else {
                System.out.println("Empty message :O");
                System.exit(1);
            }
        } else {
            System.out.println("Incorrect parameters. Please refer below for how to use the command line tool");
            System.exit(1);
        }
    }
}
