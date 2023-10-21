package fakeDB;

import dominio.Aluno;

import java.time.LocalDate;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{
@Override
    protected void CarregarDados() {

        this.tabela.add(new Aluno(1, "Mateus", LocalDate.of(1994, 6, 5), "mateus123", "senha123", 20201001));
        this.tabela.add(new Aluno(2, "Lucas", LocalDate.of(1993, 6, 5), "lucas123", "senha456", 20201002));
        this.tabela.add(new Aluno(3, "Pedro", LocalDate.of(1994, 7, 5), "pedro123", "senha789", 20201003));
        this.tabela.add(new Aluno(4, "Tiago", LocalDate.of(1994, 3, 5), "tiago123", "senha101", 20201004));
        this.tabela.add(new Aluno(5, "João", LocalDate.of(1995, 2, 25), "joao123", "senha1234", 20201005));
    }
    public AlunoFakeDB(){
        super();
    }
}


    /*public List<Aluno> listarAlunos() {
        return alunos;
    }

    public static Aluno buscarAlunoPorCodigo(int codigo) {
        for (Aluno aluno : alunos) {
            if (aluno.getCodigo() == codigo) {
                return aluno;
            }
        }
        return null;
    }

    public void adicionarAluno(Aluno aluno) {
        this.tabela.add(aluno);
    }

    public void atualizarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigo() == aluno.getCodigo()) {
                alunos.set(i, aluno);
                break;
            }
        }
    }

    public void removerAluno(int codigo) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            if (aluno.getCodigo() == codigo) {
                alunoParaRemover = aluno;
                break;
            }
        }
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
        }
    }*/
