package programa;



import java.util.ArrayList;
import java.util.List;

public class Questao1 {

	public static void main(String[] args) {
		 
		// O método criarEscada recebe o tamanho da escada e da base dela
		criarEscada(6);

	}

	// método criarEscada
	public static void criarEscada(int entrada) {
		// inicia uma nova lista para armazenar a string *
		List<String> aulturaEscada = new ArrayList<>();

		// repeti até i < entrada e soma 1 em cada loop
		for (int i = 0; i < entrada; i++) {
			int aux = -1;
			// add a lista
			aulturaEscada.add(" ".repeat(entrada - i - aux) + "*".repeat(i + 1));
		}
		// passa as strings dentro da variável criarEscada para entrad e imprime
		for (String entrad : aulturaEscada) {
			// imprime
			System.out.println(entrad);

		}
	}
}

