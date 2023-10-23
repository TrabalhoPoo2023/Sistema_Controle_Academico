package fakeDB;

import java.util.ArrayList;
import dominio.Trabalho;
import dominio.Disciplina;

public class TrabalhoFakeDB extends BaseGenericaFakeDB<Trabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Trabalho>();
        this.tabela.add(new Trabalho(1, "Trabalho 1", new Disciplina(1, "Matemática", null)));
        this.tabela.add(new Trabalho(2, "Trabalho 2", new Disciplina(2, "História", null)));
        this.tabela.add(new Trabalho(3, "Trabalho 3", new Disciplina(3, "Física", null)));
    }

    public TrabalhoFakeDB(){
        super();
    }
}
