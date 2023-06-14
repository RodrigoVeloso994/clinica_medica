import controller.AtendenteController;
import controller.MedicoController;
import controller.PacienteController;
import controller.HistoricoController;
import model.FilaAtendimento;
import view.TelaAtendente;
import view.TelaBemVindo;
import view.TelaMedico;
import view.TelaPaciente;
import view.TelaHistorico;

public class Main {
    public static void main(String[] args) {
        FilaAtendimento filaAtendimento = new FilaAtendimento();
        FilaAtendimento filaAtendimentoEspecial = new FilaAtendimento();
        FilaAtendimento filaHistorico = new FilaAtendimento();

        AtendenteController atendenteController = new AtendenteController(filaAtendimento);
        MedicoController medicoController = new MedicoController(filaAtendimento, filaAtendimentoEspecial);
        PacienteController pacienteController = new PacienteController(filaAtendimento);
        HistoricoController historicoController = new HistoricoController(filaHistorico);

        TelaAtendente telaAtendente = new TelaAtendente(atendenteController);
        TelaMedico telaMedico = new TelaMedico(medicoController);
        TelaPaciente telaPaciente = new TelaPaciente(pacienteController);
        TelaHistorico telaHistorico = new TelaHistorico(historicoController);
        TelaBemVindo telaBemVindo = new TelaBemVindo(telaAtendente);
        
        
     
        // Exibir tela do médico
        telaMedico.setVisible(true);

        // Exibir tela do paciente
        telaPaciente.setVisible(true);

        // Exibir tela do histórico
        telaHistorico.setVisible(true);

        // Exibir tela do atendente
        telaAtendente.setVisible(true);
        
        telaBemVindo.setVisible(true);
    }
}
