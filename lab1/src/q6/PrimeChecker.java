package q6;

public class PrimeChecker {
	public static boolean PrimeNumberChecker (int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i ++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
