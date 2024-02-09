package q3;

public class Triclass {

	public static String classify (int x, int y, int z) {
		
		if (x + y < z || x + z < y || y + z < x)
			if (x + z < y)
				if (y + z < x)
					return "Invalid";
		if (x == y && y == z) {
			return "Equliateral";
		} else if ((x == y && y != z && x != z) || (y == z && z != x && x != y) || (z == x && x != y && y != z)){
			return "Isosceles";
		} else if (x != y && y != z && x != z) {
			return "Scalene";
		} else {
			return "Invalid";
		}
	}
}
