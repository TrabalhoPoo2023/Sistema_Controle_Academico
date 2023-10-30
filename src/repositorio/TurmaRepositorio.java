package repositorio;

import dominio.Turma;
import fakeDB.TurmaFakeDB;


public class TurmaRepositorio extends BaseGenericaCRUD <TurmaFakeDB, Turma>{
//Contrutor da classe
    public TurmaRepositorio(){
        this.db = new TurmaFakeDB();
        this.dataset = this.db.getTabela();
    }
//meteodo para adicionar um nova turma;
    @Override
    public Turma Create(Turma instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }
//metodo para exibir um turma especifico
    @Override
    public Turma Read(int codigo) {
        for (Turma turma : this.dataset) {
            if (turma.getCodigo() == codigo)
                return turma;
        }
        return null;
    }
//metodo para atualizar dados de um turma;
    @Override
    public Turma Update(Turma instancia) {
        Turma alvo = this.Read(instancia.getCodigo());
        alvo.setCapacidadeTurma(instancia.getCapacidadeTurma());
        alvo.setDisciplina(instancia.getDisciplina());
        alvo.setProfessor(instancia.getProfessor());
        alvo.setAlunos(instancia.getAlunos());
        return alvo;
    }
//metodo para excluir um turma;
    @Override
    public Turma Delete(int codigo) {
        Turma alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
