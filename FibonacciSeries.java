package week1.day1;

public class FibonacciSeries 
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series) 
		 				int firstnum=0;
		int secnum=1;
 		System.out.println("Fibonacci Series");

		 		System.out.println(firstnum);
		 		System.out.println(secnum);
				
				 	for(int i=1;i<8;i++)
				 	{
				 		int sum;
				 		sum=firstnum+secnum;
				 		firstnum=secnum;
				 		secnum=sum;
				 		System.out.println(sum);
				 	}
		
		 		}

}
