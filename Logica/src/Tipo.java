import java.util.ArrayList;

//Vao ficar os imports
//Anotations
/**
 * Cometarios sobre a classe Deve escrever de forma clara
 */
public class Tipo {
//	Criar variaveis globais
	static String cidade = "Senges";
	Integer idade = 43;
	Double altura = 1.83;

//	Funcoes e Metodos
//	Função Main executa a classe
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String texto = "Juliano";
//		Tipos primitivos
		int numero = 50;
		double decimal = 50;
		boolean verdadeiro = true;
		char caracter = 'a';
		short curto = 32767;
		byte b = 127;
		long longo = 1l;
		long id = 1L;
		final long SERIAL_VERSION = 2L;
		float numero_letra = 2f;
//		Referencias e Wrappers
		String colecaoCaracteres = "Joao";

//		Colecao de dados
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);

//		Wrappers
		Integer pooInteiro = 1;
		Double pooDouble = 2.0;
		Boolean falso = false;
		Byte pooByte = 127;
		Short pooShort = 1;
		Long pooLong = 2L;
		Character pooChar = 'c';

//		Mostrar
		System.out.println(texto);
		System.out.println(cidade);

	}

	public Double getAltura() {
		return this.altura;
	}

}
