package sampleprogram;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		int Sum = 0;

		while (number % 10 > 0) {
			int remainder;

			remainder = number % 10;
			System.out.println("The value of remainder is :" + remainder);

			Sum = Sum + remainder;
			System.out.println("The value of Sum is :" + Sum);

			int quotient = number / 10;
			System.out.println("The value of quotient is :" + quotient);

			number = quotient;

		}
		System.out.println("Final Sum is:" + Sum);
	}

}
