package back.negocio;

public interface iFachada{
    public void limpaQuadro();
    public void criaQuadrado ( double l);
    public void criaRetangulo ( double c, double a);
    public void criaCircunferencia ( double r);
    public void criaTriangulo (double b, double a);
    public String mostraAreaObjetos();
    public String mostraPerimetroObjetos();
    public String mostraCorObjetos();
}
