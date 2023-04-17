/*
Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
*/


class Program20
{
    public static void main(String args[])
    {
        long l = 993939399L;
        String str = Long.toString(l);
        System.out.println("a. long value into String : "+str);

        Long i1 = new Long(l);
        System.out.println("b. long value into Long instance : "+i1);

        String str1=new String("123");
        Long l2 = Long.valueOf(str1);
        //Long l2 = Long.parseLong(str1);
        System.out.println("String instance into Long instance "+l2);

        long a = 434535L;
        String s1 = Long.toBinaryString(a);
        String s2 = Long.toOctalString(a);
        String s3 = Long.toHexString(a);
        System.out.println("d. long value into binary, octal and hexadecimal string : "+s1+" "+s2+" "+s3);

    }
}