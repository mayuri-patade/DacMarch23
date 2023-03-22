class Pattern13{
	public static void main(String args[])
	
	{
		int alpha=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j>=1;j--)
		{
			System.out.print(" ");
	    }
			for(int k=1;k<=i;k++)
		{
			System.out.print((char)(alpha+i)+ " ");
		}
		System.out.println();
		}
	}
}
/*
output
    A
   B B
  C C C
 D D D D
E E E E E
*/