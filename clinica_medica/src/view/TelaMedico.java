package view;

import controller.MedicoController;
import model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMedico extends JFrame {
    private MedicoController medicoController;

    public TelaMedico(MedicoController medicoController) {
        this.medicoController = medicoController;

        // Inicialização da interface do usuário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Tela de Médico");

        // Layout
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JButton btnChamarProximo = new JButton("Chamar Próximo Paciente");
        btnChamarProximo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paciente paciente = medicoController.chamarProximoPaciente();
                if (paciente != null) {
                    exibirDadosPaciente(paciente);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há pacientes na fila de atendimento.");
                }
            }
        });
        panel.add(btnChamarProximo);

        btnChamarProximo.setBackground(Color.BLACK);
        btnChamarProximo.setForeground(Color.WHITE);
    }

    private void exibirDadosPaciente(Paciente paciente) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(paciente.getNome()).append("\n");
        sb.append("Idade: ").append(paciente.getIdade()).append("\n");
        // Adicione outros atributos que desejar

        JOptionPane.showMessageDialog(null, sb.toString(), "Dados do Paciente", JOptionPane.INFORMATION_MESSAGE);
    }
}
