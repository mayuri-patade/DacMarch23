class Pattern10{
public static void main(String args[]){
int alpha=64;
for(int i=1;i<=5;i++)
	{
		for(int j=5-i;j>=1;j--)
		{
		System.out.print(" ");
	    }
		for(int k=5-i+1;k<=5;k++)
		{
		System.out.print((char)(alpha+k)+ " ");//space
		}
        System.out.println("");
    }
}
}

/*
output
    E
   D E
  C D E
 B C D E
A B C D E

*/