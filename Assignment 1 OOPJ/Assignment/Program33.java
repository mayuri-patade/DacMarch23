/*
Pass integer, float and double value from command line. 
Parse it appropriately and perform arithmetic operations (+,-,*,/) on it.
Here you can you switch case.
*/

class Program33
{
    public static void main (String args[])
    {
        int ch = Integer.parseInt(args[0]);
         switch (ch) 
         {
            case 1:  
                    int a = Integer.parseInt(args[1]);
                    int b = Integer.parseInt(args[2]);
                    int sum  = a + b;
                    int prod = a * b;
                    int quot = a / b;
                    int sub  = a - b;
                    System.out.println(a + " + " + b + " = " + sum);
                    System.out.println(a + " * " + b + " = " + prod);
                    System.out.println(a + " / " + b + " = " + quot);
                    System.out.println(a + " - " + b + " = " + sub);
                     break;
            case 2:  
                    float c = Float.parseFloat(args[1]);
                    float d = Float.parseFloat(args[2]);
                    float sumf  = c + d;
                    float prodf = c * d;
                    float quotf = c / d;
                    float subf  = c - d;
                    System.out.println(c + " + " + d + " = " + sumf);
                    System.out.println(c + " * " + d + " = " + prodf);
                    System.out.println(c + " / " + d + " = " + quotf);
                    System.out.println(c + " - " + d + " = " + subf);
                     break;
            case 3:  
                    double e = Double.parseDouble(args[1]);
                    double f = Double.parseDouble(args[2]);
                    double sumd  = e + f;
                    double prodd = e * f;
                    double quotd = e / f;
                    double subd  = e - f;
                    System.out.println(e + " + " + f + " = " + sumd);
                    System.out.println(e + " * " + f + " = " + prodd);
                    System.out.println(e + " / " + f + " = " + quotd);
                    System.out.println(e + " - " + f + " = " + subd);
                     break;
        }
    }
}