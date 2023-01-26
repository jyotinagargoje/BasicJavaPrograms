package basicPackage;

public class PrintStars {

	public static void main(String[] args) {
		printDownStars();
		printUpStars();
	}

	public static void printDownStars() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printUpStars() {
		for (int i = 5; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
