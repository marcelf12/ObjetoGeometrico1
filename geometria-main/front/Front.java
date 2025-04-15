package front;
import back.negocio.Fachada;
import back.negocio.QuadroNegro;

public class Front {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Fachada fachada = new Fachada();
        fachada.criaQuadrado(10.6);
        fachada.criaRetangulo(50.5,20.4);
        fachada.criaTriangulo(6.7,5.5);
        fachada.criaCircunferencia(10);
        System.out.println(fachada.mostraAreaObjetos());
        String mensagem = fachada.mostraPerimetroObjetos();
        System.out.println(mensagem);



    }
    }

