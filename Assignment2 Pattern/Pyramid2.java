class Pyramid2{
public static void main(String args[]){
for(int i=1;i<=9;i++)
	{
		for(int j=9-i;j>=1;j--)
		{
		System.out.print(" ");
	    }
		for(int k=1;k<=i;k++)
		{
		System.out.print(k+ " ");//space
		}
        System.out.println("");
    }
}
}

/*
output
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
*/