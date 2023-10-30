package dominio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotas {
    private List<NotaTrabalho> notas;

    public GerenciadorNotas() {
        notas = new ArrayList<>();
    }

    public void adicionarNota(NotaTrabalho nota) {
        notas.add(nota);
    }

    public List<NotaTrabalho> getNotas() {
        return notas;
    }

    public void imprimirNotas() {
        for (NotaTrabalho nota : notas) {
            nota.Imprimir();
        }
    }

    public void adicionarNotas(List<NotaTrabalho> notas2) {
    }
}