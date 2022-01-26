
public class Main {

	public static void main(String[] args) {
		System.out.println(MyArithmetic.<Integer>sum(1,2));
		System.out.println(MyArithmetic.<Integer>subtr(1,2));
		System.out.println(MyArithmetic.<Integer>multipl(1, 2, 0, 2));
		System.out.println(MyArithmetic.<Double>division(1.0, 2.0, 0.5));
		System.out.println(MyArithmetic.division(1,0)); //returns NaN
		
	}

}
