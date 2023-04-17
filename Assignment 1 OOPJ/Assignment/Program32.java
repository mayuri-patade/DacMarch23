/*
Write a program to accept and print full name as an argument from command line.
*/
import java.util.Scanner;
class Program32 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String name1 =args[ 0 ];
    String name2 =args[ 1 ];
    System.out.println("Full name entered as : "+name1+" "+name2);
  }  
}