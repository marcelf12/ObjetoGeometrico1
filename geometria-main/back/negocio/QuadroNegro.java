package back.negocio;
import back.dado.*;

public class QuadroNegro {
	
	private Quadrado quadrado;
	private Retangulo retangulo;
	private Circunferencia circunferencia;
	private Triangulo triangulo;
 
	public void limpaQuadro() {
 
	}

	public void criaQuadrado ( double l) {
 		quadrado = new Quadrado(l);
 	}

	public void criaRetangulo ( double c, double a) {
 		retangulo = new Retangulo(c, a);
 	}

	public void criaCircunferencia ( double r) {
		circunferencia = new Circunferencia(r);
 	}

	public void criaTriangulo ( double b, double a) {
 		triangulo = new Triangulo(b, a);
	}
	
	public String mostraAreaObjetos () {

		 String mensagem = new String("");
		 mensagem = mensagem +
		 	("Quadrado.  Área: " + quadrado.getArea() + "\n");
		 mensagem = mensagem +
		 	("Retângulo. Área: " + retangulo.getArea() + "\n");
		 mensagem = mensagem +
		 	("Triângulo. Área: " + triangulo.getArea() + "\n");
		 mensagem = mensagem +
		 ("Circunferência. Área: " + circunferencia.getArea() + "\n");

		 return mensagem;
	}
	
	public String mostraPerimetroObjetos ( ) {

		String mensagem = new String("");
		mensagem = mensagem +
				("Quadrado.  Perímetro: " + quadrado.getPerimetro() + "\n");
		mensagem = mensagem +
		  ("Retângulo. Perímetro: " + retangulo.getPerimetro() + "\n");
		mensagem = mensagem +
		  ("Triângulo. Perímetro: " + triangulo.getPerimetro() + "\n");
		mensagem = mensagem +
		  ("Circunferência. Perímetro: " + circunferencia.getPerimetro() + "\n");

		return mensagem;
	}
	public String mostraCorObjetos ( ) {

		String mensagem = new String("");

		mensagem = mensagem +
		 ("Quadrado.  Cor: " + quadrado.getCor() + "\n");
		mensagem = mensagem +
		 ("Retângulo. Cor: " + retangulo.getCor()) + "\n";
		mensagem = mensagem +
				("Triângulo. Cor: " + triangulo.getCor()) + "\n";
		mensagem = mensagem +
		 ("Circunferência. Cor: " + circunferencia.getCor() + "\n");

		return mensagem;
	}
}