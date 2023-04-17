/*
Write a program to perform below operations on int type to get: 
a. The number of bits used to represent a integer value 
b. The number of bytes used to represent a integer value 
c. The minimum value a integer 
d. The maximum value a integer
*/

class Program15
{
    public static void main(String args[])
    {
         System.out.println("a. The number of bits used to represent a integer value "+Integer.SIZE);
        System.out.println("a. The number of bytes used to represent a integer value "+Integer.BYTES);
        System.out.println("c. The minimum value a integer "+Integer.MIN_VALUE);
        System.out.println("d. The maximum value a integer "+Integer.MAX_VALUE);
    }
}