/*
Write a program to convert state of Short instance into byte, short, int, long, float and double.
*/

class Program14
{
    public static void main(String args[])
    {
    short value = 12;
    Short s = new Short(value); // Short instance
    
    byte by = s.byteValue();
    System.out.println("byte:"+by);

    short sh = s.shortValue();
    System.out.println("short:"+sh);

    int i = s.intValue();
    System.out.println("int:"+i);

    long l = s.longValue();
    System.out.println("long:"+l);

    float f = s.floatValue();
    System.out.println("float"+f);

    double d = s.doubleValue();
    System.out.println("double:"+d);
    }
}