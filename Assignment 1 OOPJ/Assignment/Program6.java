/*Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/

class Program6
{
    public static void main(String args[])
    {
        System.out.println("Operations on Boolean type to convert :");

        //Process of converting value of variable of primitive type into non primitive type is called as boxing.
        boolean b = true;
        //String str = (String)b; //error: incompatible types: boolean cannot be converted to String
        String str = Boolean.toString(b); //ALLOWED
        System.out.println("a. boolean value into String : "+str);

        Boolean b1 = new Boolean(b);
        System.out.println("b. boolean value into Boolean instance : "+b1);

        //Process of converting value of variable of non primitive type into primitive type is called as unboxing.
        String str1 = new String(b);
        //boolean b3 = (boolean)str1; //error: incompatible types: String cannot be converted to boolean
        boolean b3 = Boolean.parseBoolean(str1);
        System.out.println("c. String value into boolean value : "+b3);
    
        boolean b4 = true;
        String str2 = String.valueOf(b4); 
        System.out.println("d. String value into Boolean instance : "+str2);

    }
}