package dominio;
public abstract class BaseIdentificador implements IImpressao{
    
    protected int codigo;

    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }
    

    public BaseIdentificador() {
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void Imprimir(){
        
    }
}
