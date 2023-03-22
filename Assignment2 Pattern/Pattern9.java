class Pattern9{
public static void main(String args[]){
int alpha=64;
for(int i=1;i<=5;i++)
	{
		for(int j=5-i;j>=1;j--)
		{
		System.out.print(" ");
	    }
		for(int k=1;k<=i;k++)
		{
		System.out.print((char)(alpha+k)+ " ");//space
		}
        System.out.println("");
    }
}
}

/*
output
    A
   A B
  A B C
 A B C D
A B C D E
*/