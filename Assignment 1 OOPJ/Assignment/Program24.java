/*
Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
*/


class Program24
{
    public static void main(String args[])
    {
        float f = 25.2f;
        String str = Float.toString(f);
        System.out.println("a. float value into String : "+str);

        Float f1 = new Float(f);
        System.out.println("b. float value into float instance : "+f1);

        String str1=new String("123");
        Float f2 = Float.valueOf(str1);
        //Float f2 = Float.parseFloat(str1);
        System.out.println("String instance into Float instance "+f2);

        float a = 1.1f;
        String s = Float.toHexString(a);
        System.out.println("d. float value hexadecimal string : "+s);

    }
}