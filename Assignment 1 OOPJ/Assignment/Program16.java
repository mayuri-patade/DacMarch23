/*
Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
*/

class Program16
{
    public static void main(String args[])
    {
        int i = 2;
        String str = Integer.toString(i);
        System.out.println("a. int value into String : "+str);

        Integer i1 = new Integer("2");
        System.out.println("b. int value into Integer instance : "+i1);

        String str1=new String("123");
         Integer l2 = Integer.valueOf(str1);
        //Integer l2 = Integer.parseInteger(str1);
        System.out.println("String instance into Integer instance "+l2);

        int a = 4;
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toOctalString(a);
        String s3 = Integer.toHexString(a);
        System.out.println("d. int value into binary, octal and hexadecimal string : "+s1+" "+s2+" "+s3);

    }
}