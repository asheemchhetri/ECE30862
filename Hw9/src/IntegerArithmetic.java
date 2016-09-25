public class IntegerArithmetic {
	/*
	 * add(object, object): static type, means we cannot make an instance of this class.
	 * This method takes in 2 objects as parameter, and based on their instance performs
	 * addition in only Long type.
	 * Instance allowed:
	 * Integer
	 * Long
	 * All other instances must throw an exception, which is caught in main.java
	 */
	public static Long add(Object op1, Object op2) {
		long I1 = 0;
		long I2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			I1 = ((Long) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			I1 = ((Long) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		return (I1 + I2);
	}
	
	/*
	 * subtract(object, object): static type, means we cannot make an instance of this class.
	 * This method takes in 2 objects as parameter, and based on their instance performs
	 * subtraction in only Long type.
	 * Instance allowed:
	 * Integer
	 * Long
	 * All other instances must throw an exception, which is caught in main.java
	 * Note:
	 * minuend: op1
	 * subtrahend: op2
	 */
	public static Long subtract(Object op1, Object op2) {
		long I1 = 0;
		long I2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			I1 = ((Long) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			I1 = ((Long) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		return (I1 - I2);
	}

	/*
	 * multiply(object, object): static type, means we cannot make an instance of this class.
	 * This method takes in 2 objects as parameter, and based on their instance performs
	 * multiplication in only Long type.
	 * Instance allowed:
	 * Integer
	 * Long
	 * All other instances must throw an exception, which is caught in main.java
	 */
	public static Long multiply(Object op1, Object op2) {
		long I1 = 0;
		long I2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			I1 = ((Long) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			I1 = ((Long) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		return (I1 * I2);
	}
	
	/*
	 * divide(object, object): static type, means we cannot make an instance of this class.
	 * This method takes in 2 objects as parameter, and based on their instance performs
	 * division in only Long type.
	 * Instance allowed:
	 * Integer
	 * Long
	 * All other instances must throw an exception, which is caught in main.java
	 * Also, division by 0 exception is thrown by this method, which is caught in
	 * main.java.
	 */
	public static Long divide(Object op1, Object op2){
		long I1 = 0;
		long I2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			I1 = ((Long) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			I1 = ((Integer) op1).longValue();
			I2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			I1 = ((Long) op1).longValue();
			I2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		
		//Division by 0 error
		if(I2 == 0)
		{
			throw new ArithmeticException();
		}
		else	return(I1 / I2);
	}
}
