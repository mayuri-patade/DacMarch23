/*
Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string(Note: Here you can use doubleToLongBits() method along with methods of Long class).
*/


class Program28
{
    public static void main(String args[])
    {
        double d = 20.33;
        String str = Double.toString(d);
        System.out.println("a. long value into String : "+str);

        Double i1 = new Double(d);
        System.out.println("b. long value into Long instance : "+i1);

        String str1=new String("123");
        //Double d1 = Double.valueOf(str1);
        Double d1 = Double.parseDouble(str1);
        System.out.println("c. String instance into Double instance "+d1);

        Double a = 1.1;
        String s3 = Double.toHexString(a);
        System.out.println("d. Double value hexadecimal string : "+s3);

        

    }
}