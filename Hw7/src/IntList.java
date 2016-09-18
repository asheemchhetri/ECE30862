
public class IntList implements MyList {
	public IntList next;
	public int data;
	
	public IntList(IntList n, int data)
	{
		next = n;
		this.data = data;
	}
	public int getData()
	{
		return data;
	}
	public IntList next()
	{
		return next;
	}
	public void printNode()
	{
		System.out.println("IntList Node," + " data is: "+data);
	}
}
