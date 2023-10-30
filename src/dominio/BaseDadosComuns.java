package dominio;

public abstract class BaseDadosComuns extends BaseIdentificador  {
    
    protected String nome;

    public BaseDadosComuns(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
