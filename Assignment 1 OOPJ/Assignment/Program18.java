/*
Write a program to find minimum and maximum number as well as to add two integer numbers using methods of Integer.
*/

class Program18
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;

        int max = Integer.max(a,b);
        int min = Integer.min(a,b);

        System.out.println("Max="+max+"  "+"Min="+min);

        int Sum = Integer.sum(a,b);
        System.out.println("Sum="+Sum);
    }
}