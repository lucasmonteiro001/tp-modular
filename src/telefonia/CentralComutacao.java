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

    public void removerCentralTelefonica (String idCentralTelefonica) {

        List<CentralTelefonica> l = new LinkedList<CentralTelefonica>();

        for(CentralTelefonica c : this.centraisTelefonicas) {

            // se a central telefonica for dirente da passada como parametro, adiciona para
            // a nova lista de centrais
            if(!c.getId().equals(idCentralTelefonica)) {
                l.add(c);
            }
        }

        this.centraisTelefonicas = l;

    }

    public void removerLinhaComunicacao (CentralTelefonica a, CentralTelefonica b) {

        List<LinhaComunicacao> l = new LinkedList<LinhaComunicacao>();

        for(LinhaComunicacao c : this.linhasComunicacao) {

            // se a linha de comunicacao entre as centrais for encontrada, nao adiciona na nova lista
            // de comunicacao

            // caso onde a != central 1 e a != central 2
            if(!c.getCentralTelefonica1().getId().equals(a.getId()) && !c.getCentralTelefonica2().getId().equals(a
                    .getId())) {

                l.add(c);
            }
            // caso onde b != central 1 e b != central 2
            else if(!c.getCentralTelefonica1().getId().equals(b.getId()) && !c.getCentralTelefonica2().getId().equals(b
                    .getId())) {

                l.add(c);
            }
            // TODO edge cases
        }

        this.linhasComunicacao = l;
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
