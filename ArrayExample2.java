class ArrayExample2
{
	 public static void main(String args[])
	 {
		 int[] n = new int[5];
		 int i,sum=0;
		 for(i=0;i<n.length;i++)
		 {
			 n[i] = (int)(Math.random()*10);
			 System.out.println(n[i]);
		 }
		 for(i=0;i<n.length;i++)
		 {
			 sum += n[i];
		 }
		 System.out.println("Sum is "+ sum);
	 }
}
		 