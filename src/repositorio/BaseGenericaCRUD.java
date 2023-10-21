package repositorio;

import java.util.ArrayList;

//essa classe é a base para a criação do repositório, ela cria um ArrayList do tipo generico "T"
//com as classes criadas anteriormente em Dominio e FakeDB
//A função principal dela é a manipulação dos dados contidos no FakeDB;
// os metodos create, read, ReadAll e delete serão implementados nas classes filhas

public abstract class BaseGenericaCRUD<TFakeDB, TDominio> {

    protected TFakeDB db;
    protected ArrayList<TDominio> dataset;

    public abstract TDominio Create(TDominio instancia);

    public abstract TDominio Read(int codigo);

    public ArrayList<TDominio> ReadAll() {
        return this.dataset;
    }

    public abstract TDominio Update(TDominio instancia);

    public abstract TDominio Delete(int codigo);
}