/*
Write a program to perform below operations on Double type to get: 
a. The number of bits used to represent a double value 
b. The number of bytes used to represent a double value 
c. The minimum value a double 
d. The maximum value a double
*/

class Program27
{
    public static void main(String args[])
    {
        System.out.println("a. The number of bits used to represent a double value "+Double.SIZE);
        System.out.println("a. The number of bytes used to represent a double value "+Double.BYTES);
        System.out.println("c. The minimum value a double "+Double.MIN_VALUE);
        System.out.println("d. The maximum value a double "+Double.MAX_VALUE);
    }
}