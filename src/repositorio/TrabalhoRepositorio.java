package repositorio;

import dominio.Trabalho;
import fakeDB.TrabalhoFakeDB;


public class TrabalhoRepositorio extends BaseGenericaCRUD <TrabalhoFakeDB, Trabalho>{
//Contrutor da classe
    public TrabalhoRepositorio(){
        this.db = new TrabalhoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Trabalho Create(Trabalho instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }

    @Override
    public Trabalho Read(int codigo) {
        for (Trabalho trabalho : this.dataset) {
            if (trabalho.getCodigo() == codigo)
                return trabalho;
        }
        return null;
    }

    @Override
    public Trabalho Update(Trabalho instancia) {
        Trabalho alvo = this.Read(instancia.getCodigo());
        alvo.setDescricao(instancia.getDescricao());
        alvo.setDisciplina(instancia.getDisciplina());
       
        return alvo;
    }

    @Override
    public Trabalho Delete(int codigo) {
        Trabalho alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
