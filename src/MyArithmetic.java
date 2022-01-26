
public final strictfp class MyArithmetic {
	public static final double PI = 3.141592653589793;
	public static final double E = 2.7182818284590452;
	  
	
	/**
	 * Return the sum of the given arguments as Double.  
	 * @param <T> type of the arguments
	 * @param args arguments array, can be null
	 * @return the sum 
	 */
	@SafeVarargs
	public static <T extends Number> Double sum (T... args) {
		if (args == null) return null;
		Double result = args[0].doubleValue(); 
		for (int i =1; i<args.length; ++i) result += args[i].doubleValue();
		return result;
	}
	
	/**
	 * Return the difference of the given arguments as Double.  
	 * The order of operations starts from the first argument.
	 * @param <T> type of the arguments
	 * @param args arguments array, can be null
	 * @return the difference 
	 */
	@SafeVarargs
	public static <T extends Number> Double subtr(T... args) {
		if(args == null) return null;
		Double result = args[0].doubleValue();
		for(int i =1; i<args.length; ++i) result -= args[i].doubleValue();
		return result;
	}
	
	/**
	 * Return the multiplication of the given arguments as Double.  
	 * @param <T> type of the arguments
	 * @param args arguments array, can be null
	 * @return the multiplication
	 */
	@SafeVarargs
	public static <T extends Number> Double multipl(T... args) {
		if(args == null) return null;
		Double result = args[0].doubleValue();
		for(int i =1; i<args.length; ++i) result *= args[i].doubleValue();
		return result;
	}
	
	/**
	 * Unsafe version of division method. For internal purposes. Throws ArithmeticException. 
	 * @param num1 dividend
	 * @param num2 divider
	 * @return the division
	 * @throws ArithmeticException if second parameter is zero.
	 */
	private static Double divisionUnsafe(Double num1, Double num2) throws ArithmeticException{
		if (num2 == 0) {
			throw new ArithmeticException();
		}
		return num1 / num2;
	}
	
	
	/**
	 * Return the division of the given arguments as Double.  
	 * The order of operations starts from the first argument.
	 * Handles the call of divisionUnsafe, thereby, handles the ArithmeticException
	 * @param <T> type of the arguments
	 * @param args arguments array, can be null
	 * @return the division
	 */
	@SafeVarargs
	public static <T extends Number> Double division(T... args) {
		if(args == null) return null;
		Double result = args[0].doubleValue();
		for(int i =1; i<args.length; ++i) {
			try {
				result = divisionUnsafe(result, args[i].doubleValue());
			}
			catch (ArithmeticException e) {
				return Double.NaN;
				
				//e.printStackTrace();
				//System.exit(i);
			}	
		}
		return result;
	}
	
}
