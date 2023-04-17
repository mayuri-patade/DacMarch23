/*Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/

class Program8
{
    public static void main(String args[])
    {
        
        byte b = 1;
        String str = Byte.toString(b);
        System.out.println("byte value into String "+str);

        Byte b1 = new Byte("127");
        System.out.println("byte value into Byte instance "+b1);

        String ss=new String("123");
        Byte s2 = Byte.valueOf(ss);
        //Byte s2 = Byte.parseByte(ss);
        System.out.println("String instance into Byte instance "+s2);



    }
}