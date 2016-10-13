public class Main 
{
	   public static int[ ][ ] A;
	   public static int[ ][ ] B;
	   public static int[ ][ ] C;

	   public static int N;
	   public static int threadNum;
	   private static Thread[ ] threads;

	   Main( ) { }

	   public static void fill( ) throws FillException 
	   {
	      if (N % 2 != 0) throw new FillException(-1, threadNum, N);
	      C = new int[N][N];
	      A = new int[N][N];
	      B = new int[N][N];
	      for (int i = 0; i < N; i++) 
	      { 
	         for (int j = 0; j < N; j++) 
	         { 
	            C[i][j]  = 0;
	            A[i][j]  = 1;
	            B[i][j]  = 1;
	         }
	      }
	   }
	   //Print an array.
	   public static void printArray(int startX, int endX, int startY, int endY, int[ ][ ] ary, String s) 
	   { 
	      int step;
	      if (N > 16) step = N / 16;
	      else step = 1;
	      
	      System.out.println(s);
	      System.out.println( );
	      for (int i = startY; i < endY; i=i+step) 
	      {
	         for (int j = startX; j < endX; j=j+step) 
	         {
	            System.out.print(ary[i][j]+" ");
	         }
	         System.out.println( );
	      }
	      System.out.println( );
	      System.out.println( );
	   }
	      

	   public static void main( String[] args ) 
	   {           
	      if (args.length != 2) 
	      {
	         System.out.println("Please enter: thread number and arraysize");
	         System.exit(-1);
	      }

	      threadNum = Integer.valueOf(args[0]);
	      N = Integer.valueOf(args[1]);

	     boolean done = false;
	     while (!done) 
	     {
	        try {
	           fill( );
	           done = true;
	        } catch (FillException e) 
	        {
	           System.out.println(e); 
	           System.out.println("Setting N to "+(N+1)+" instead of "+N);
	           N = N + 1;
	        }
	     }

	     threads = new Thread[threadNum];
	     for (int i = 0; i < threadNum; i++) 
	     {
	         threads[i] = new Matrix( );
	         threads[i].start( );
	     }

	     long elapsed = -1;
	     try 
	     { 
	         for (int t = 0; t < threadNum; t++) 
	         {
	             threads[t].join( );
	             if (Matrix.getThreadTime(t) > elapsed) 
	             {
	                elapsed = Matrix.getThreadTime(t);
	             }
	         }
	      } catch (java.lang.InterruptedException e) {System.out.println(e);}

	      printArray(0, N, 0, N, C, "Final value of C");
	      System.out.println( );
	      System.out.println("Time taken = "+elapsed);
	   }
}
