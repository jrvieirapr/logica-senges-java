
public class Operacoes {
	private Double base, altura, resultado;

	public String nome;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacoes op = new Operacoes();
		Operacoes op2 = new Operacoes();
		op.passarParametros(2.0, 5.0);
		op2.passarParametros(3.0, 7.0);
		op.mostrarDados();
		op2.mostrarDados();

	}

	public void passarParametros(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public void mostrarDados() {
		System.out.println("Base: " + this.base);
		System.out.println("Altura: " + this.altura);
	}

}
