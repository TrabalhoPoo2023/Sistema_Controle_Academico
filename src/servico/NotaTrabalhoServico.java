package servico;

import java.util.ArrayList;

import dominio.NotaTrabalho;
import repositorio.NotaTrabalhoRepositorio;

public class NotaTrabalhoServico extends BaseGenericaServico<NotaTrabalhoRepositorio, NotaTrabalho> {

    public NotaTrabalhoServico(){
        this.repo = new NotaTrabalhoRepositorio();
    }

    @Override
    public NotaTrabalho Inserir(NotaTrabalho tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public NotaTrabalho Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<NotaTrabalho> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public NotaTrabalho Atualizar(NotaTrabalho tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public NotaTrabalho Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }    
}

