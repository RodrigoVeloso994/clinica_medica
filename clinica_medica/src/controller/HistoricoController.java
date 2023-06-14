package controller;

import model.FilaAtendimento;
import model.Paciente;

public class HistoricoController {
    private FilaAtendimento filaHistorico;

    public HistoricoController(FilaAtendimento filaHistorico) {
        this.filaHistorico = filaHistorico;
    }

    public String obterHistoricoAtendimentos() {
        return filaHistorico.toString();
    }

    public void adicionarAtendimentoHistorico(Paciente paciente) {
        filaHistorico.adicionarPaciente(paciente);
    }
}