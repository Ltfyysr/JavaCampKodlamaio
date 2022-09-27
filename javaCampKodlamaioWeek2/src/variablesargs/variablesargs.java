package variablesargs;

public class variablesargs {

	public static void main(String[] args) {
		int toplam = toplama(2, 3, 4);
		System.out.println(toplam);

	}

	public static int toplama(int... sayilar) {
		int toplam = 0;

		for (int sayi : sayilar) {
			toplam += sayi;

		}

		return toplam;

	
	}
}
