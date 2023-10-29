package servico;

import java.util.ArrayList;

import dominio.RendimentoEscolar;
import repositorio.RendimentoEscolarRepositorio;

public class RendimentoEscolarServico extends BaseGenericaServico<RendimentoEscolarRepositorio, RendimentoEscolar> {

    public RendimentoEscolarServico(){
        this.repo = new RendimentoEscolarRepositorio();
    }

    @Override
    public RendimentoEscolar Inserir(RendimentoEscolar tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public RendimentoEscolar Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<RendimentoEscolar> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public RendimentoEscolar Atualizar(RendimentoEscolar tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public RendimentoEscolar Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }    
}
