/*
Write a program to convert state of Long instance into byte, short, int, long, float and double.
*/

class Program21
{
    public static void main(String args[])
    {
    Long value = 12L; 
    Long l = new Long(value); // Long instance
    
    byte b = l.byteValue();
    System.out.println("byte:"+b);

    short sh = l.shortValue();
    System.out.println("short:"+sh);

    int i = l.intValue();
    System.out.println("int:"+i);

    long l1 = l.longValue();
    System.out.println("long:"+l1);

    float f = l.floatValue();
    System.out.println("float"+f);

    double d = l.doubleValue();
    System.out.println("double:"+d);
    }
}