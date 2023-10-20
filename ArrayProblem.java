/*This code solve the problem which it the difference between the sum of elements
   with the sum of each digit of elements in the array
   
   Example : [ 4, 23, 6, 3, 9, 7]
   		sum of each element = 4+23+6+3+9+7 = 52
   		sum of each digit in the array = 1+2+3+6+3+9+7 = 34
   		difference = |52-34| = 18
*/
package algoorithm;

public class ArrayProblem {

	public static int solution(int[] k) {
		int num_sum = 0;
		int digit_sum = 0;
		for (int i : k) {
			num_sum += i;
			if (i > 9) {
				int n = i;
				while (n != 0) {
					int rem = n % 10;
					digit_sum += rem;
					n = n / 10;
				}

			} else {
				digit_sum += i;
			}
		}
		System.out.println("Sum of array elements : " + num_sum + "\n" + "Sum of all digit i the array : " + digit_sum);
		return Math.abs(num_sum - digit_sum);
	}

	public static void main(String[] args) {
		int[] k = { 4, 23, 6, 3, 9, 7 };
		System.out.println("\n The differnce is : " + solution(k));
	}
}
