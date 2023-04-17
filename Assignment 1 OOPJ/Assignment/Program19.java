/*
Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value 
b. The number of bytes used to represent a long value 
c. The minimum value a long 
d. The maximum value a long
*/

class Program19
{
    public static void main(String args[])
    {
         System.out.println("a. The number of bits used to represent a long value "+Long.SIZE);
        System.out.println("a. The number of bytes used to represent a long value "+Long.BYTES);
        System.out.println("c. The minimum value a long "+Long.MIN_VALUE);
        System.out.println("d. The maximum value a long "+Long.MAX_VALUE);
    }
}