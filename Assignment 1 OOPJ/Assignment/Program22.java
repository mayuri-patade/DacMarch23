/*
Write a program to find minimum and maximum number as well as to add two long numbers using methods of Long.
*/

class Program22
{
    public static void main(String args[])
    {
        long a = 102232L;
        long b = 204536L;

        long max = Long.max(a,b);
        long min = Long.min(a,b);

        System.out.println("Max="+max+"  "+"Min="+min);

        long Sum = Long.sum(a,b);
        System.out.println("Sum="+Sum);
    }
}