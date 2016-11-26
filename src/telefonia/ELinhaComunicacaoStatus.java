package telefonia;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public enum ELinhaComunicacaoStatus {

    OCUPADO("Ocupado"),
    DISPONIVEL("Disponível");

    private String status;

    ELinhaComunicacaoStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ELinhaComunicacaoStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
