/*
Write a program to find minimum and maximum number as well as to add two double numbers using methods of Double.
*/

class Program30
{
    public static void main(String args[])
    {
        double a = 20.3;
        double b = 23.2;

        double max = Double.max(a,b);
        double min = Double.min(a,b);

        System.out.println("Max="+max+"  "+"Min="+min);

        double Sum = Double.sum(a,b);
        System.out.println("Sum="+Sum);
    }
}