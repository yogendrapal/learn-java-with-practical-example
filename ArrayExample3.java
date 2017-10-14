class ArrayExample3
{
	 public static void main(String[] args)
	 {
		 int[][] n = new int[2][2];
		 int i,j;
		 for(i=0;i<n.length;i++)
		 {
			 for(j=0;j<n[i].length;j++)
			 {
				 n[i][j]=(int)(Math.random()*10);
			 }			 
		 }
		 for(i=0;i<n.length;i++)
		 {
			 for(j=0;j<n[i].length;j++)
			 {
				 System.out.print(n[i][j]+ "     ");
			 }			 
			 System.out.println();
		 }
	 }
}