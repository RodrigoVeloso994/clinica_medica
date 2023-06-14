package view;

import controller.AtendenteController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAtendente extends JFrame {
    private AtendenteController atendenteController;

    private JTextField textFieldNome;
    private JTextField textFieldIdade;

    public TelaAtendente(AtendenteController atendenteController) {
        this.atendenteController = atendenteController;

        // Inicialização da interface do usuário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Tela de Atendente");

        // Layout
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel labelNome = new JLabel("Nome:");
        panel.add(labelNome);

        textFieldNome = new JTextField(20);
        panel.add(textFieldNome);

        JLabel labelIdade = new JLabel("Idade:");
        panel.add(labelIdade);

        textFieldIdade = new JTextField(3);
        panel.add(textFieldIdade);

        JButton btnAdicionarPaciente = new JButton("Adicionar Paciente");
        btnAdicionarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                int idade = Integer.parseInt(textFieldIdade.getText());
                atendenteController.adicionarPaciente(nome, idade);
                textFieldNome.setText("");
                textFieldIdade.setText("");
            }
        });
        btnAdicionarPaciente.setBackground(Color.BLACK);
        btnAdicionarPaciente.setForeground(Color.WHITE);
        panel.add(btnAdicionarPaciente);
    }
}
