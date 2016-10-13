public class FillException extends Exception
{
    private int threadNumber;
    private int totalThread;
    private int size;

    public FillException(int threadId, int threadNumber, int N) 
    {
       threadNumber = threadId;
       totalThread = threadNumber;
       size = N;
   }

   public String toString( ) {
      String s = new String("thread ID: "+threadNumber+", # threads: "+totalThread);
      s = s + "N: "+size;
      return s;
   }
}
