package back.negocio;

public class Fachada implements iFachada{

    QuadroNegro quadroNegro = new QuadroNegro();

    public Fachada() {
        quadroNegro = new QuadroNegro();
    }

    public void limpaQuadro () {
    }

    public void criaQuadrado ( double l) {
        quadroNegro.criaQuadrado(l);
    }

    public void criaRetangulo ( double c, double a) {
        quadroNegro.criaRetangulo(c, a);
    }

    public void criaCircunferencia ( double r) {
        quadroNegro.criaCircunferencia(r);
    }

    public void criaTriangulo ( double b, double a) {
        quadroNegro.criaTriangulo(b,a);
    }

    public String mostraAreaObjetos ( ) {
         String mensagem = quadroNegro.mostraAreaObjetos();
         return mensagem;
    }

    public String mostraPerimetroObjetos ( ) {
        String mensagem = quadroNegro.mostraPerimetroObjetos();
        return mensagem;
    }
    public String mostraCorObjetos ( ) {
        String mensagem = quadroNegro.mostraCorObjetos();
        return mensagem;
    }

}


