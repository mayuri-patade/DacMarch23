class Pattern8{
public static void main(String args[]){
for(int i=1;i<=5;i++)
	{
		for(int j=5-i;j>=1;j--)
		{
		System.out.print(" ");
	    }
		for(int k=5-i+1;k<=5;k++)
		{
		System.out.print(k+ " ");//space
		}
        System.out.println("");
    }
}
}

/*
output
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/