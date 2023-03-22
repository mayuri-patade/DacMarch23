class Pyramid3{
public static void main(String args[]){
for(int i=1;i<=9;i++)
	{
		for(int j=9-i;j>=1;j--)
		{
		System.out.print(" ");
	    }
		for(int k=1;k<=i;k++)
		{
		System.out.print( "* ");//space
		}
        System.out.println("");
    }
}
}

/*
output
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *
*/