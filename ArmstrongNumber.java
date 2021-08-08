package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int temp=number;
		int remainder;
		int  calculated=0;
		while(number >0)
		{
			remainder= number%10;
			number=number/10;
			calculated= calculated +(remainder*remainder*remainder);
			
		}

		if(temp==calculated)
		{
			System.out.println("The Number is Armstrong Number");
		}
		else
			{
			System.out.println("The Number is not Armstrong Number");

	}

}
}

