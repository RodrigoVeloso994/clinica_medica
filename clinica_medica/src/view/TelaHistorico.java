package view;

import controller.HistoricoController;
import model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaHistorico extends JFrame {
    private HistoricoController historicoController;

    private JTextArea textAreaHistorico;

    public TelaHistorico(HistoricoController historicoController) {
        this.historicoController = historicoController;

        // Inicialização da interface do usuário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Tela de Histórico");

        // Layout
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JButton btnExibirHistorico = new JButton("Exibir Histórico");
        btnExibirHistorico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String historico = historicoController.obterHistoricoAtendimentos();
                textAreaHistorico.setText(historico);
            }
        });
        panel.add(btnExibirHistorico);

        textAreaHistorico = new JTextArea(10, 20);
        textAreaHistorico.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaHistorico);
        panel.add(scrollPane);
        
        btnExibirHistorico.setBackground(Color.BLACK);
        btnExibirHistorico.setForeground(Color.WHITE);
    }
}
