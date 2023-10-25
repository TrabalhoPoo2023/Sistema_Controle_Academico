package repositorio;

import dominio.RendimentoEscolar;
import fakeDB.RendimentoEscolarFakeDB;

public class RendimentoEscolarRepositorio extends BaseGenericaCRUD <RendimentoEscolarFakeDB, RendimentoEscolar>{
//Contrutor da classe
    public RendimentoEscolarRepositorio(){
        this.db = new RendimentoEscolarFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        for (RendimentoEscolar aluno : this.dataset) {
            if (aluno.getCodigo() == codigo)
                return aluno;
        }
        return null;
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        RendimentoEscolar alvo = this.Read(instancia.getCodigo());
        alvo.setAluno(instancia.getAluno());
        alvo.setTurma(instancia.getTurma());
        alvo.setNota1(instancia.getNota1());
        alvo.setNota2(instancia.getNota2());
        alvo.setTrabalhos(instancia.getTrabalhos());
        alvo.setMediaTrabalhos(instancia.getMediaTrabalhos());
        alvo.setMediaGeral(instancia.getMediaGeral());
        return alvo;
    }
//metodo para excluir um aluno;
    @Override
    public RendimentoEscolar Delete(int codigo) {
        RendimentoEscolar alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
