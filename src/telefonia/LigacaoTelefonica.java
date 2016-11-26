package telefonia;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class LigacaoTelefonica {

    private LinhaTelefonica linhaA;
    private CentralTelefonica centralA;
    private LinhaTelefonica linhaB;
    private CentralTelefonica centralB;

    public LigacaoTelefonica() {
    }

    public LigacaoTelefonica(LinhaTelefonica linhaA, CentralTelefonica centralA, LinhaTelefonica linhaB, CentralTelefonica centralB) {
        this.linhaA = linhaA;
        this.centralA = centralA;
        this.linhaB = linhaB;
        this.centralB = centralB;
    }

    public LinhaTelefonica getLinhaA() {
        return linhaA;
    }

    public void setLinhaA(LinhaTelefonica linhaA) {
        this.linhaA = linhaA;
    }

    public CentralTelefonica getCentralA() {
        return centralA;
    }

    public void setCentralA(CentralTelefonica centralA) {
        this.centralA = centralA;
    }

    public LinhaTelefonica getLinhaB() {
        return linhaB;
    }

    public void setLinhaB(LinhaTelefonica linhaB) {
        this.linhaB = linhaB;
    }

    public CentralTelefonica getCentralB() {
        return centralB;
    }

    public void setCentralB(CentralTelefonica centralB) {
        this.centralB = centralB;
    }

    @Override
    public String toString() {
        return "LigacaoTelefonica{" +
                "linhaA=" + linhaA +
                ", centralA=" + centralA +
                ", linhaB=" + linhaB +
                ", centralB=" + centralB +
                '}';
    }
}
