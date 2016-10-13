public class Matrix extends Thread 
{                                         
    private static long[ ] threadTime = new long[4];
    private static int threadCount = 0;
    private int threadID;
    private int startX, startY, endX, endY;

    public Matrix() 
    { 
       threadID = threadCount++;
    }

    public static long getThreadTime(int t) 
    {
       return threadTime[t];
    }

    void matrixMultiply( ) {
       for (int i = startY; i < endY; i++) 
       {
          for (int j = startX; j < endX; j++) 
          {
             for (int k = 0; k < Main.N; k++) 
             {
                 Main.C[i][j] += Main.A[i][k] * Main.B[k][j];
             }
          }
       }
    }

   void findArrayPortion(int arraySize, int numT) throws FillException {
      switch  (numT) 
      {
         case 1: startX = 0; 
            endX = Main.N;
            startY = 0;
            endY = Main.N;
            break;
         case 2:  
            startX = threadID * Main.N/2;
            endX = startX + Main.N/2;
            startY = 0;
            endY = Main.N;
            break;
         case 4: 
            int xOffset = threadID % 2;
            int yOffset = threadID / 2;
            startX = xOffset * Main.N/2;
            endX = startX + Main.N/2;
            startY = yOffset * Main.N/2;
            endY = startY + Main.N/2;
            break;
         default: throw new FillException(threadID, numT, Main.N);
      }
   }

   public void run( ) {
      try 
      {
         findArrayPortion(Main.N, Main.threadNum);
      } catch (FillException ide) {System.out.println(ide);}

      threadTime[threadID] = System.currentTimeMillis();
      matrixMultiply( );
      threadTime[threadID] = System.currentTimeMillis() - threadTime[threadID];
   }
}
