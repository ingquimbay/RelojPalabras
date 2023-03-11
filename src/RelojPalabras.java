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
				{'m','e','d','i','a','c','u','a','r','t','o'},
				{'u','l','e','n','f','p','u','n','t','o','c'}
		};
		
		System.out.println(LocalTime.now().toString());
		int hora = LocalTime.now().getHour();
		int minutos = LocalTime.now().getMinute(); 
		
		relojPalabras = tiempoPalabras(relojPalabras, hora, minutos);
		imprimirReloj(relojPalabras);

	}
	
	private static char[][] tiempoPalabras(char[][] relojPalabras, int hora, int minutos) {
		relojPalabras = minutosPalabras(relojPalabras, minutos);
		relojPalabras = (hora < 11) ? am(relojPalabras) : pm(relojPalabras);
		if (hora == 0) {
			hora += 12;
		}
		if (hora > 12) {
			hora -= 12;
		}
		switch (hora) {
		case 1 -> relojPalabras = una(relojPalabras);
		case 2 -> relojPalabras = dos(relojPalabras);
		case 3 -> relojPalabras = tres(relojPalabras);
		case 4 -> relojPalabras = cuatro(relojPalabras);
		case 5 -> relojPalabras = cinco(relojPalabras);
		case 6 -> relojPalabras = seis(relojPalabras);
		case 7 -> relojPalabras = siete(relojPalabras);
		case 8 -> relojPalabras = ocho(relojPalabras);
		case 9 -> relojPalabras = nueve(relojPalabras);
		case 10 -> relojPalabras = diez(relojPalabras);
		case 11 -> relojPalabras = once(relojPalabras);
		case 12 -> relojPalabras = doce(relojPalabras);
		default ->
		throw new IllegalArgumentException("Unexpected value: " + hora);
		}
		return relojPalabras;
	}
	
	private static char[][] minutosPalabras(char[][] relojPalabras, int minutos) {
		// TODO Auto-generated method stub
		return relojPalabras;
	}

	private static char[][] una(char[][] relojPalabras) {
		for (int i = 8; i < 11; i++) {
			relojPalabras[0][i] = Character.toUpperCase(relojPalabras[0][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] dos(char[][] relojPalabras) {
		for (int i = 0; i < 3; i++) {
			relojPalabras[1][i] = Character.toUpperCase(relojPalabras[1][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] tres(char[][] relojPalabras) {
		for (int i = 4; i < 8; i++) {
			relojPalabras[1][i] = Character.toUpperCase(relojPalabras[1][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] cuatro(char[][] relojPalabras) {
		for (int i = 0; i < 6; i++) {
			relojPalabras[2][i] = Character.toUpperCase(relojPalabras[2][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] cinco(char[][] relojPalabras) {
		for (int i = 6; i < 11; i++) {
			relojPalabras[2][i] = Character.toUpperCase(relojPalabras[2][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] seis(char[][] relojPalabras) {
		for (int i = 0; i < 4; i++) {
			relojPalabras[3][i] = Character.toUpperCase(relojPalabras[3][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] siete(char[][] relojPalabras) {
		for (int i = 5; i < 11; i++) {
			relojPalabras[3][i] = Character.toUpperCase(relojPalabras[3][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] ocho(char[][] relojPalabras) {
		for (int i = 0; i < 4; i++) {
			relojPalabras[4][i] = Character.toUpperCase(relojPalabras[4][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] nueve(char[][] relojPalabras) {
		for (int i = 4; i < 9; i++) {
			relojPalabras[4][i] = Character.toUpperCase(relojPalabras[4][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] diez(char[][] relojPalabras) {
		for (int i = 2; i < 6; i++) {
			relojPalabras[5][i] = Character.toUpperCase(relojPalabras[5][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] once(char[][] relojPalabras) {
		for (int i = 7; i < 11; i++) {
			relojPalabras[5][i] = Character.toUpperCase(relojPalabras[5][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] doce(char[][] relojPalabras) {
		for (int i = 0; i < 4; i++) {
			relojPalabras[6][i] = Character.toUpperCase(relojPalabras[6][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] media(char[][] relojPalabras) {
		for (int i = 6; i < 11; i++) {
			relojPalabras[9][i] = Character.toUpperCase(relojPalabras[9][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] veinticinco(char[][] relojPalabras) {
		for (int i = 0; i < 11; i++) {
			relojPalabras[9][i] = Character.toUpperCase(relojPalabras[9][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] veinte(char[][] relojPalabras) {
		for (int i = 1; i < 6; i++) {
			relojPalabras[8][i] = Character.toUpperCase(relojPalabras[8][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] cuarto(char[][] relojPalabras) {
		for (int i = 5; i < 11; i++) {
			relojPalabras[10][i] = Character.toUpperCase(relojPalabras[10][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] diezMinutos(char[][] relojPalabras) {
		for (int i = 7; i < 11; i++) {
			relojPalabras[7][i] = Character.toUpperCase(relojPalabras[7][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] cincoMinutos(char[][] relojPalabras) {
		for (int i = 6; i < 11; i++) {
			relojPalabras[8][i] = Character.toUpperCase(relojPalabras[8][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] menos(char[][] relojPalabras) {
		for (int i = 6; i < 11; i++) {
			relojPalabras[6][i] = Character.toUpperCase(relojPalabras[6][i]);
		}
		return relojPalabras;
	}
	
	private static char[][] y(char[][] relojPalabras) {
		relojPalabras[6][5] = Character.toUpperCase(relojPalabras[6][5]);
		return relojPalabras;
	}

	private static char[][] am(char[][] relojPalabras) {
		relojPalabras[1][9] = Character.toUpperCase(relojPalabras[1][9]);
		relojPalabras[1][10] = Character.toUpperCase(relojPalabras[1][10]);
		return relojPalabras;
	}
	
	private static char[][] pm(char[][] relojPalabras) {
		relojPalabras[4][9] = Character.toUpperCase(relojPalabras[4][9]);
		relojPalabras[4][10] = Character.toUpperCase(relojPalabras[4][10]);
		return relojPalabras;
	}
	
	private static char[][] enPunto(char[][] relojPalabras) {
		relojPalabras[10][2] = Character.toUpperCase(relojPalabras[10][2]);
		relojPalabras[10][3] = Character.toUpperCase(relojPalabras[10][3]);
		for (int i = 5; i < 10; i++) {
			relojPalabras[10][i] = Character.toUpperCase(relojPalabras[10][i]);
		}
		return relojPalabras;
	}
	
	private static void imprimirReloj(char[][] relojPalabras) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(relojPalabras[i][j] + " ");
			}
			System.out.println();
		}
		minusculas(relojPalabras);		
	}

	private static void minusculas(char[][] relojPalabras) {
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				relojPalabras[i][j] = Character.toLowerCase(relojPalabras[i][j]);
			}
		}
	}

}
