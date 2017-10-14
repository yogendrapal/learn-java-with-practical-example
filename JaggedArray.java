class JaggedArray
{
	public static void main(String args[])
	{
		//int[][][] n = new int[2][3][2];
		
		int[][] m = new int[2][];
		m[0] = new int[(int)(Math.random()*10)];
		m[1]= new int[(int)(Math.random()*10)];
		System.out.println("Length of m[0] is " + m[0].length);
		System.out.println("Length of m[1] is " + m[1].length);
	}
}
		