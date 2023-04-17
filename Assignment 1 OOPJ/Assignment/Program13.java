/*
Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
*/
class Program13
{
    public static void main(String args[])
    {
        short s = 2;
        String str = Short.toString(s);
        System.out.println("a. short value into String : "+str);

        Short s1 = new Short("2");
        System.out.println("b. short value into short instance : "+s1);

        
        String ss = new String("123");
        Short s2 = Short.valueOf(ss);
        //Short s2 = Short.parseShort(ss);
        System.out.println("b. String instance into short instance : "+s2);
    }
}