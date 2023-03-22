class Pattern2{
	public static void main(String args[])
	
	{
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
		}
	}
} 
/*
A
A B
A B C
A B C D
A B C D E
*/

/*
=======================================Method 2
class Pattern2
{
public static void main(String args[])
{
	int alpha =65;
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((char)(alpha+j)+" ");
		}
		System.out.println();
	}
}
}
/*
A
A B
A B C
A B C D
A B C D E
*/