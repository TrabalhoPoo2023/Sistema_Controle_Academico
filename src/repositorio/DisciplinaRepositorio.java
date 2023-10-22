package repositorio;
import dominio.Disciplina;
import fakeDB.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseGenericaCRUD <DisciplinaFakeDB,Disciplina>{
//Contrutor da classe
    public DisciplinaRepositorio(){
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.getTabela();
    }
//meteodo para adicionar um novo professor;
    @Override
    public Disciplina Create(Disciplina instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }
//metodo para exibir um professor
    @Override
    public Disciplina Read(int codigo) {
        for (Disciplina disciplina : this.dataset) {
            if (disciplina.getCodigo() == codigo)
                return disciplina;
        }
        return null;
    }
//metodo para atualizar dados de um professor;
    @Override
    public Disciplina Update(Disciplina instancia) {
        Disciplina alvo = this.Read(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setEmenta(instancia.getEmenta());
        return alvo;
    }
//metodo para excluir um professor;
    @Override
    public Disciplina Delete(int codigo) {
        Disciplina alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
