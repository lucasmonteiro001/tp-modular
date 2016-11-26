package telefonia;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class CentralComutacao {

    List<CentralTelefonica> centraisTelefonicas = new LinkedList<CentralTelefonica>();
    List<LinhaComunicacao> linhasComunicacao = new LinkedList<LinhaComunicacao>();

    public CentralComutacao() {
    }

    public CentralComutacao(List<CentralTelefonica> centraisTelefonicas, List<LinhaComunicacao> linhasComunicacao) {
        this.centraisTelefonicas = centraisTelefonicas;
        this.linhasComunicacao = linhasComunicacao;
    }

    public Boolean adicionarCentralTelefonica (CentralTelefonica c) {

        try {
            this.centraisTelefonicas.add(c);
            return true;
        } catch (Error e) {
            System.out.println(e);
            return false;
        }

    }

    public Boolean adicionarLinhaComunicacao (LinhaComunicacao c) {

        try {
            this.linhasComunicacao.add(c);
            return true;
        } catch (Error e) {
            System.out.println(e);
            return false;
        }

    }

    public List<CentralTelefonica> getCentraisTelefonicas() {
        return centraisTelefonicas;
    }

    public void setCentraisTelefonicas(List<CentralTelefonica> centraisTelefonicas) {
        this.centraisTelefonicas = centraisTelefonicas;
    }

    public List<LinhaComunicacao> getLinhasComunicacao() {
        return linhasComunicacao;
    }

    public void setLinhasComunicacao(List<LinhaComunicacao> linhasComunicacao) {
        this.linhasComunicacao = linhasComunicacao;
    }

    @Override
    public String toString() {
        return "CentralComutacao{" +
                "centraisTelefonicas=" + centraisTelefonicas +
                ", linhasComunicacao=" + linhasComunicacao +
                '}';
    }
}
