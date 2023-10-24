package repositorio;

import dominio.RendimentoEscolar;
import fakeDB.RendimentoEscolarFakeDB;
public class RendimentoEscolarRepositorio extends BaseGenericaCRUD <RendimentoEscolarFakeDB, RendimentoEscolar>{
//Contrutor da classe
    public RendimentoEscolarRepositorio(){
        this.db = new RendimentoEscolarFakeDB();
        this.dataset = this.db.getTabela();
    }
//meteodo para adicionar um novo aluno;
    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getAluno.codigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;

    }
//metodo para exibir um aluno especifico
    @Override
    public RendimentoEscolar Read(Aluno aluno) {
        for (RendimentoEscolar rendimentoEscolar : this.dataset) {
            if (rendimentoEscolar.getAluno() == Aluno)
                return rendimentoEscolar;
        }
        return null;
    }
//metodo para atualizar dados de um aluno;
    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        RendimentoEscolar alvo = this.Read(instancia.getAluno());
        alvo.setNome(instancia.getNome());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setNomeUsuario(instancia.getNomeUsuario());
        alvo.setSenha(instancia.getSenha());
        alvo.setPeriodo(instancia.getPeriodo());
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
