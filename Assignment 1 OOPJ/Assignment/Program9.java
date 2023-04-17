/*Write a program to convert state of Byte instance into byte, short, int. long, float and double. */
class Program9
{
    public static void main(String args[])
    {
    byte value = 125;
    Byte b = new Byte(value); // Byte instance
    
    byte by = b.byteValue();
    System.out.println("byte:"+by);

    short s = b.shortValue();
    System.out.println("short:"+s);

    int i = b.intValue();
    System.out.println("int:"+i);

    long l = b.longValue();
    System.out.println("long:"+l);

    float f = b.floatValue();
    System.out.println("float"+f);

    double d = b.doubleValue();
    System.out.println("double:"+d);
    }
}
