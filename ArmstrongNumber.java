package algoorithm;
/************
  Armstrong number is the number in any given integer base, which forms the total of the same number,
   when each of its digits is raised to the power of the number of digits in the number.
   
   Example: 1) 153 is armestrong
   			number of digit = 3 
   			1^3 + 5^3 + 2^3 = 153
   			
   			2) 9    Number of digit = 1
   			   9^1 = 9
   			   
   	0, 1, 153, 370, 371 and 407 are an Armstrong number list or all examples of Armstrong numbers. Let us check why?

		 For 0, the operation is 0^1=0
		
		 For 1, the operation is 1^1=1
		
		 For 370 the operation is 3^3 7^3 0^3=370
		
		 For 371 the operation is 3^3 7^3 1^3=371
		
		 For 407 the operation is 4^3 0^3 7^3=407
			
   
 ************/
public class ArmstrongNumber {

	static private void solution(int n) {
		int count = 0;
		int i =0;
		int sum = 0;
	    int initialNumber = 10;
	    System.out.println("The firt "+n +" Armestrong Number");
	    while (count < n) {
	    	int temp  = initialNumber;
	    	while (temp !=0) {
				i++;
				temp = temp/10;
			}
	    	temp  = initialNumber;
			while (temp !=0) {
				int rem = temp%10;
			
				sum = sum +(int) Math.pow(rem, i);
				temp = temp/10;
			}
			
			if (initialNumber == sum) {
				count++;
				System.out.print(sum+" ");
			}
			initialNumber++;
			sum = 0;
			i = 0;
		}

	}
 public static void main(String[] args) {
	solution(5);
}
}
