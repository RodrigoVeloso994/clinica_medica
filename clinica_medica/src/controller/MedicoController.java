package controller;

import model.FilaAtendimento;
import model.Paciente;

public class MedicoController {
    private FilaAtendimento filaAtendimento;
    private FilaAtendimento filaAtendimentoEspecial;
    private int contadorAtendimentosNormais;

    public MedicoController(FilaAtendimento filaAtendimento, FilaAtendimento filaAtendimentoEspecial) {
        this.filaAtendimento = filaAtendimento;
        this.filaAtendimentoEspecial = filaAtendimentoEspecial;
        this.contadorAtendimentosNormais = 0;
    }

    public Paciente chamarProximoPaciente() {
        Paciente paciente;

        if (contadorAtendimentosNormais < 3 && !filaAtendimentoEspecial.filaVazia()) {
            paciente = filaAtendimentoEspecial.chamarProximoPaciente();
        } else {
            paciente = filaAtendimento.chamarProximoPaciente();
            contadorAtendimentosNormais++;
            if (contadorAtendimentosNormais == 3) {
                contadorAtendimentosNormais = 0;
            }
        }

        return paciente;
    }
}
