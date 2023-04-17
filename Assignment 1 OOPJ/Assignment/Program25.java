/*
Write a program to convert state of Float instance into byte, short, int, long, float and double.
*/

class Program25
{
    public static void main(String args[])
    {
    Float value = 2.2f; 
    Float f = new Float(value); // Float instance
    
    byte b = f.byteValue();
    System.out.println("byte:"+b);

    short sh = f.shortValue();
    System.out.println("short:"+sh);

    int i = f.intValue();
    System.out.println("int:"+i);

    long l = f.longValue();
    System.out.println("long:"+l);

    float f1 = f.floatValue();
    System.out.println("float"+f1);

    double d = f.doubleValue();
    System.out.println("double:"+d);
    }
}