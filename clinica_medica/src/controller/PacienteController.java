package controller;

import model.FilaAtendimento;

public class PacienteController {
    private FilaAtendimento filaAtendimento;

    public PacienteController(FilaAtendimento filaAtendimento) {
        this.filaAtendimento = filaAtendimento;
    }

    public int consultarPosicaoFila() {
        return filaAtendimento.tamanhoFila();
    }
}
