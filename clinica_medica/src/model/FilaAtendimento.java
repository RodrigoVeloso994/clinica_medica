package model;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {
    private Queue<Paciente> fila;

    public FilaAtendimento() {
        fila = new LinkedList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente);
    }

    public Paciente chamarProximoPaciente() {
        return fila.poll();
    }

    public int tamanhoFila() {
        return fila.size();
    }

    public boolean filaVazia() {
        return fila.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Paciente paciente : fila) {
            sb.append(paciente.toString()).append("\n");
        }
        return sb.toString();
    }
}
