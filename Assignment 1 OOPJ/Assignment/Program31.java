class Program31
{
    public static void main(String args[])
    {
        String str = new String("abc");
        int num=Integer.parseInt(str);
        System.out.println("Num "+num);
    }
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at Program31.main(Program31.java:6)
*/
