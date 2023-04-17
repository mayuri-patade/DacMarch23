/*
Accept character from command line and perform below operations. Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into upper case and print it well as its code point. If it is in uppercase
Core Java Assignment 1
Designed by Sandeep Kulange
then convert it into lower case and print it well as its code point.
*/

class Program11
{
    public static void main(String args[])
    {
        char c = args[0].charAt(0);

        if(Character.isDigit(c))
        {
            System.out.println(c);
            System.out.println(Character.codePointAt(args[0],0));
        }
        else
        {
            if(Character.isLowerCase(c))
            {
                System.out.println(Character.toUpperCase(c));
                System.out.println(Character.codePointAt(args[0],0));
            }
            else
            {
                System.out.println(Character.toLowerCase(c));
                System.out.println(Character.codePointAt(args[0],0));
            }
        }
    }
}