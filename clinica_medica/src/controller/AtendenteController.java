package controller;

import model.FilaAtendimento;
import model.Paciente;

import javax.swing.JOptionPane;

public class AtendenteController {
    private FilaAtendimento filaAtendimento;

    public AtendenteController(FilaAtendimento filaAtendimento) {
        this.filaAtendimento = filaAtendimento;
    }

    public void adicionarPaciente(String nome, int idade) {
        Paciente paciente = new Paciente(nome, idade);
        filaAtendimento.adicionarPaciente(paciente);

        String mensagem = "Paciente adicionado com sucesso!\nNúmero da senha: " + filaAtendimento.tamanhoFila();
        JOptionPane.showMessageDialog(null, mensagem, "Número da Senha", JOptionPane.INFORMATION_MESSAGE);
    }

    public int tamanhoFilaAtendimento() {
        return filaAtendimento.tamanhoFila();
    }
}
