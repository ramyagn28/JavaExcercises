package ex;

import java.util.function.Predicate;

public class LambdaExpressions {
	
	public static void main(String[] args) {
		Predicate<Integer> isOdd = n -> (n % 2 > 0);
		Predicate<Integer> isPrime = n -> (n%2 > 0) && (n%3 > 0);
		Predicate<Integer> isPalindrome = n -> {
			System.out.println(n);
			return new StringBuilder(Integer.toString(n)).reverse().toString().equals(Integer.toString(n));
		};
		Predicate<Integer> primeOrOdd = isOdd.or(isPrime).and(isPalindrome);

		System.out.println(isOdd.test(5));
		System.out.println(isPrime.test(5));
		System.out.println(isPalindrome.test(45664));
		System.out.println(primeOrOdd.test(56));
	}
}
