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
		long l1 = 0;
		long l2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			l1 = ((Long) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			l1 = ((Long) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		return (l1 + l2);
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
		long l1 = 0;
		long l2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			l1 = ((Long) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			l1 = ((Long) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		return (l1 - l2);
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
		long l1 = 0;
		long l2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			l1 = ((Long) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			l1 = ((Long) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		return (l1 * l2);
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
		long l1 = 0;
		long l2 = 0;
		if (op1 instanceof Long && op2 instanceof Long) {
			l1 = ((Long) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Long type");
		} else if (op1 instanceof Integer && op2 instanceof Integer) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Integer type");
		}
		else if (op1 instanceof Integer && op2 instanceof Long) {
			l1 = ((Integer) op1).longValue();
			l2 = ((Long) op2).longValue();
//			System.out.println("Integer / Long type");
		}
		else if (op1 instanceof Long && op2 instanceof Integer) {
			l1 = ((Long) op1).longValue();
			l2 = ((Integer) op2).longValue();
//			System.out.println("Long / Integer type");
		}
		else throw new ClassCastException();
		
		//Division by 0 error
		if(l2 == 0)
		{
			throw new ArithmeticException();
		}
		else	return(l1 / l2);
	}
}
