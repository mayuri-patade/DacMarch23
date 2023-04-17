/*
Write a program to find minimum and maximum number as well as to add two float numbers using methods of Float.
*/

class Program26
{
    public static void main(String args[])
    {
        float a = 20.3f;
        float b = 23.2f;

        float max = Float.max(a,b);
        float min = Float.min(a,b);

        System.out.println("Max="+max+"  "+"Min="+min);

        float Sum = Float.sum(a,b);
        System.out.println("Sum="+Sum);
    }
}