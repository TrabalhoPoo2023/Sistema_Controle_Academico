package dominio;

public class Disciplina extends BaseDadosComuns {
    
    private String ementa;

    
    public Disciplina(int codigo, String nome, String ementa) {
        super(codigo, nome);
        this.ementa = ementa;
    }


    public String getNome() {
        return nome;
    }
    public String getEmenta() {
        return ementa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }  

    @Override
    public void Imprimir(){
        System.out.println("*************************");
        System.out.println("cod: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Ementa: "+this.ementa);
    } 
}
