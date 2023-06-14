package view;

import controller.PacienteController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPaciente extends JFrame {
    private PacienteController pacienteController;

    private JLabel labelPosicao;

    public TelaPaciente(PacienteController pacienteController) {
        this.pacienteController = pacienteController;

        // Inicialização da interface do usuário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Tela de Paciente");

        // Layout
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JButton btnConsultarPosicao = new JButton("Consultar Posição na Fila");
        btnConsultarPosicao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicao = pacienteController.consultarPosicaoFila();
                labelPosicao.setText("Sua posição na fila é: " + posicao);
            }
        });
        panel.add(btnConsultarPosicao);

        labelPosicao = new JLabel();
        panel.add(labelPosicao);
        
        btnConsultarPosicao.setBackground(Color.BLACK);
        btnConsultarPosicao.setForeground(Color.WHITE);
    }
}
