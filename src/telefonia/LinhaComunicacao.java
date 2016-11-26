package telefonia;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class LinhaComunicacao {

    CentralTelefonica centralTelefonica1;
    CentralTelefonica centralTelefonica2;
    ELinhaComunicacaoStatus status = ELinhaComunicacaoStatus.DISPONIVEL;

    public LinhaComunicacao() {
    }

    public LinhaComunicacao(CentralTelefonica centralTelefonica1, CentralTelefonica centralTelefonica2) {
        this.centralTelefonica1 = centralTelefonica1;
        this.centralTelefonica2 = centralTelefonica2;
    }

    public LinhaComunicacao(CentralTelefonica centralTelefonica1, CentralTelefonica centralTelefonica2, ELinhaComunicacaoStatus status) {
        this.centralTelefonica1 = centralTelefonica1;
        this.centralTelefonica2 = centralTelefonica2;
        this.status = status;
    }

    public CentralTelefonica getCentralTelefonica1() {
        return centralTelefonica1;
    }

    public void setCentralTelefonica1(CentralTelefonica centralTelefonica1) {
        this.centralTelefonica1 = centralTelefonica1;
    }

    public CentralTelefonica getCentralTelefonica2() {
        return centralTelefonica2;
    }

    public void setCentralTelefonica2(CentralTelefonica centralTelefonica2) {
        this.centralTelefonica2 = centralTelefonica2;
    }

    public ELinhaComunicacaoStatus getStatus() {
        return status;
    }

    public void setStatus(ELinhaComunicacaoStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LinhaComunicacao{" +
                "centralTelefonica1=" + centralTelefonica1 +
                ", centralTelefonica2=" + centralTelefonica2 +
                ", status=" + status +
                '}';
    }
}
