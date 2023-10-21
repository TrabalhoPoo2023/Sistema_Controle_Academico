package repositorio;

import dominio.Aluno;
import fakeDB.AlunoFakeDB;
public class AlunoRepositorio extends BaseGenericaCRUD <AlunoFakeDB, Aluno>{
//Contrutor da classe
    public AlunoRepositorio(){
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getTabela();
    }
//meteodo para adicionar um novo aluno;
    @Override
    public Aluno Create(Aluno instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }
//metodo para exibir um aluno especifico
    @Override
    public Aluno Read(int codigo) {
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo)
                return aluno;
        }
        return null;
    }
//metodo para atualizar dados de um aluno;
    @Override
    public Aluno Update(Aluno instancia) {
        Aluno alvo = this.Read(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setNomeUsuario(instancia.getNomeUsuario());
        alvo.setSenha(instancia.getSenha());
        alvo.setPeriodo(instancia.getPeriodo());
        return alvo;
    }
//metodo para excluir um aluno;
    @Override
    public Aluno Delete(int codigo) {
        Aluno alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
    
}
