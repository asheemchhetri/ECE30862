public class Main {
	public static void main(String args[])
	{
		Integer num1 = new Integer(5);
		Integer num2 = new Integer(6);
		Long num3 = new Long(30);
		Long num4 = new Long(40);
		Double num5 = new Double(3.2);
		Double num6 = new Double(3.2);
		Long num8 = new Long(0);
		
		//These statement should behave properly.
		System.out.println(IntegerArithmetic.add(num1, num2));
		System.out.println(IntegerArithmetic.add(num3, num4));
		System.out.println(IntegerArithmetic.subtract(num1, num2));
		System.out.println(IntegerArithmetic.subtract(num3, num4));
		System.out.println(IntegerArithmetic.multiply(num1, num3));
		System.out.println(IntegerArithmetic.multiply(num3, num2));
		System.out.println(IntegerArithmetic.divide(num2, num1));
		System.out.println(IntegerArithmetic.divide(IntegerArithmetic.multiply(num3, num4),IntegerArithmetic.multiply(num1, num2)));
		
		//Providing wrong instance to check the code.
		//1. add try - catch block
		try{
			System.out.println(IntegerArithmetic.add(num2, num5));
		}
		catch (ClassCastException e){
			System.out.println("We only accept Long or Integer type for this program!");
		}
		//2. add try - catch block
		try{
			System.out.println(IntegerArithmetic.add(num5, num6));
		}
		catch (ClassCastException e){
			System.out.println("We only accept Long or Integer type for this program!");
		}
		//3. divide try - catch block
		try{
			System.out.println(IntegerArithmetic.divide(num1, num6));
		}
		catch (ClassCastException e)
		{
			System.out.println("We only accept Long or Integer type for this program!");
		}
		//4. divide try - catch block
		try{
			System.out.println(IntegerArithmetic.divide(num4, num8));
		}
		catch(ClassCastException e)
		{
			System.out.println("We only accept Long or Integer type for this program!");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero will cause HAVOC on our world! NOOOOOOOO!");
		}
		//5. divide try - catch block
		try{
			System.out.println(IntegerArithmetic.divide(num1, num8));
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero will cause HAVOC on our world! NOOOOOOOO!");
		}
	}
	
}
