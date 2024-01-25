package q3;
import java.util.*;
public class RE {
	
	public static boolean checkPhoneNumber(String s) {
		return s.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
