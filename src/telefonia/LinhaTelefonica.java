package telefonia;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class LinhaTelefonica {

    private String numero; // Numero de telefone
    private ELinhaTelefonicaStatus status = ELinhaTelefonicaStatus.EM_USO.DISPONIVEL;

    public LinhaTelefonica() {
    }

    public LinhaTelefonica(String numero) {
        this.numero = numero;
    }

    public LinhaTelefonica(String numero, ELinhaTelefonicaStatus status) {
        this.numero = numero;
        this.status = status;
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

    @Override
    public String toString() {
        return "LinhaTelefonica{" +
                "numero='" + numero + '\'' +
                ", status=" + status +
                '}';
    }
}
