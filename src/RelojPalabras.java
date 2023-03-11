import java.time.LocalTime;

public class RelojPalabras {

	public static void main(String[] args) {
		
		char[][] relojPalabras = {
				{'e','S','O','N','e','L','A','s','u','n','a'},
				{'d','o','s','i','t','r','e','s','o','a','m'},
				{'c','u','a','t','r','o','c','i','n','c','o'},
				{'s','e','i','s','a','s','i','e','t','e','n'},
				{'o','c','h','o','n','u','e','v','e','p','m'},
				{'l','a','d','i','e','z','s','o','n','c','e'},
				{'d','o','c','e','l','y','m','e','n','o','s'},
				{'o','v','e','i','n','t','e','d','i','e','z'},
				{'v','e','i','n','t','i','c','i','n','c','o'},
				{'m','e','d','i','a','c','u','a','r','t','o'}
		};
		
		System.out.println(LocalTime.now().toString());
		int hora = LocalTime.now().getHour();
		int minutos = LocalTime.now().getMinute(); 
		
		imprimirReloj(relojPalabras);

	}

	private static void imprimirReloj(char[][] relojPalabras) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(relojPalabras[i][j] + " ");
			}
			System.out.println();
		}
		minusculas(relojPalabras);		
	}

	private static void minusculas(char[][] relojPalabras) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 11; j++) {
				relojPalabras[i][j] = Character.toLowerCase(relojPalabras[i][j]);
			}
		}
	}

}
