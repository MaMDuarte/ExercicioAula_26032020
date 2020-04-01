
public class Principal {

	public static void main(String[] args) {
		casa();
	}

	public static void cima() {

		System.out.print("|");

		for (int i = 0; i < 10; i++) {

			System.out.print("¯");
		}
		
		System.out.print("|");
		System.out.print("\n");

	}

	public static void lados() {

		for (int c = 0; c < 3; c++) {

			System.out.print("|");

			for (int i = 0; i < 10; i++) {

				System.out.print(" ");
			}
			System.out.print("|");

			System.out.print("\n");
		}
	}

	public static void baixo() {

		System.out.print("|");

		for (int i = 0; i < 10; i++) {

			System.out.print("_");
		}

		System.out.print("|");
	}

	public static void paredes() {

		cima();
		lados();
		baixo();
	}

	public static void telhado() {

		for (int i = 0; i <= 5; i++ )
		{
		System.out.print("\n");
		for ( int j = 0; j < 6-i; j++ )
		{
			System.out.print(" ");
		}
		for ( int j = 6-i; j <= 5; j++ )
		{

		System.out.print("/");
		}
		
		for ( int j = 6-i; j <= 5; j++ )
		{

		System.out.print("\\");
		}
		}
		System.out.print("\n");

	}
	
	public static void casa() {
		telhado();
		paredes();
	}
}
