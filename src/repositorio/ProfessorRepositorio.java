package repositorio;
import dominio.Professor;
import fakeDB.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseGenericaCRUD<ProfessorFakeDB, Professor> {
    
    public ProfessorRepositorio(){
    this.db = new ProfessorFakeDB();
    this.dataset = this.db.getTabela();
    } 
 //meteodo para adicionar um novo professor;
    @Override
    public Professor Create(Professor instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }
//metodo para exibir um professor especifico
    @Override
    public Professor Read(int codigo) {
        for (Professor professor : this.dataset) {
            if (professor.getCodigo() == codigo)
                return professor;
        }
        return null;
    }
//metodo para atualizar dados de um professor;
    @Override
    public Professor Update(Professor instancia) {
        Professor alvo = this.Read(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setNomeUsuario(instancia.getNomeUsuario());
        alvo.setSenha(instancia.getSenha());
        alvo.setCargo(instancia.getCargo());
        return alvo;
    }
//metodo para excluir um professor;
    @Override
    public Professor Delete(int codigo) {
        Professor alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
