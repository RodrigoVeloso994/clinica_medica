package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBemVindo extends JFrame {
    private TelaAtendente telaAtendente;

    public TelaBemVindo(TelaAtendente telaAtendente) {
        this.telaAtendente = telaAtendente;

        // Inicialização da interface do usuário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Tela de Boas-Vindas");

        // Layout
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel labelBemVindo = new JLabel("Bem-Vindo!");
        labelBemVindo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(labelBemVindo);

        JButton btnIrParaAtendente = new JButton("Ir para a Tela de Atendente");
        btnIrParaAtendente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaAtendente.setVisible(true);
                dispose();  // Fecha a tela de boas-vindas
            }
        });
        btnIrParaAtendente .setBackground(Color.BLACK);
        btnIrParaAtendente .setForeground(Color.WHITE);
        panel.add(btnIrParaAtendente);
    }
}
