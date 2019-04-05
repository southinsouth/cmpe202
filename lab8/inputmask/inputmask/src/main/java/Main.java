/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */


/*
    Sample Program Demonstrating the use of Patterns for an Input Mask
    Uses java.io.Console for Screen output and input.

    ref: https://docs.oracle.com/javase/7/docs/api/java/io/Console.html

*/


import java.io.Console ;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        App app = new App() ;
//        Console c = System.console() ;
        Scanner c = new Scanner(System.in);
        for (;;) {
            System.out.print("\033[H\033[2J") ; // clear the screen
            System.out.flush() ;
            System.out.println( app.display() ) ;
            System.out.print( "Key (Digit or X or Delete) => " ) ;
            String ch = c.nextLine();
            app.key( ch ) ;
        }
    }
}