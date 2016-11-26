package telefonia;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class LinhaTelefonica {

    private String numero; // Numero de telefone
    private ELinhaTelefonicaStatus status = ELinhaTelefonicaStatus.EM_USO.DISPONIVEL;
    private CentralTelefonica centralTelefonica;

    public LinhaTelefonica() {
    }

    public LinhaTelefonica(String numero) {
        this.numero = numero;
    }

    public LinhaTelefonica(String numero, ELinhaTelefonicaStatus status, CentralTelefonica centralTelefonica) {
        this.numero = numero;
        this.status = status;
        this.centralTelefonica = centralTelefonica;
    }

    public Boolean isLinhaEmUso() {

        return this.status.equals(ELinhaTelefonicaStatus.EM_USO);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ELinhaTelefonicaStatus getStatus() {
        return status;
    }

    public void setStatus(ELinhaTelefonicaStatus status) {
        this.status = status;
    }

    public CentralTelefonica getCentralTelefonica() {
        return centralTelefonica;
    }

    public void setCentralTelefonica(CentralTelefonica centralTelefonica) {
        this.centralTelefonica = centralTelefonica;
    }

    public void fazerLigacao(String numero) {

        if(this.centralTelefonica == null) {
            throw new Error("A LINHA TELEFONICA NECESSITA ESTAR LIGADA A ALGUMA CENTRAL TELEFONICA!");
        }

        this.centralTelefonica.fazerLigacao(numero);
    }

    @Override
    public String toString() {
        return "LinhaTelefonica{" +
                "numero='" + numero + '\'' +
                ", status=" + status +
                '}';
    }
}
