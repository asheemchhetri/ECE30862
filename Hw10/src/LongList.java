
public class LongList implements MyList{
	public LongList next;
	public long data;
	
	public LongList(LongList n, long data)
	{
		next = n;
		this.data = data;
	}
	public long getData()
	{
		return data;
	}
	public LongList next()
	{
		return next;
	}
	public void printNode()
	{
		System.out.println("LongList Node," + " data is: "+data);
	}
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	} 
}
