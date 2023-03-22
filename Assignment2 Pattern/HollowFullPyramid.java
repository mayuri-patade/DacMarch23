class HollowFullPyramid{
public static void main(String args[])
{
	for(int i=1;i<=6;i++)
	{
		for(int j=i;j<=6;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i*2;k++)
		{
			if(k==1||k==i*2-1||(i==6&&k%2==1))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
 }
}

/*
output
      *
     * *
    *   *
   *     *
  *       *
 * * * * * *

*/