/*
Write a program to convert state of Integer instance into byte, short, int, long, float and double.
*/

class Program17
{
    public static void main(String args[])
    {
    Integer value = 12;
    Integer i = new Integer(value); // Integer instance
    
    byte b = i.byteValue();
    System.out.println("byte:"+b);

    short sh = i.shortValue();
    System.out.println("short:"+sh);

    int i1 = i.intValue();
    System.out.println("int:"+i1);

    long l = i.longValue();
    System.out.println("long:"+l);

    float f = i.floatValue();
    System.out.println("float"+f);

    double d = i.doubleValue();
    System.out.println("double:"+d);
    }
}