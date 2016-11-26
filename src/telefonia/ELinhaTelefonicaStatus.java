package telefonia;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public enum ELinhaTelefonicaStatus {


    EM_USO("Em uso"),
    DISPONIVEL("Disponível");

    public String status;

    ELinhaTelefonicaStatus(String status) {

        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ELinhaTelefonicaStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
