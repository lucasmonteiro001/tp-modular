package telefonia;

import pessoas.Assinante;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class CentralTelefonica {

    private List<Assinante> assinantes = new LinkedList<Assinante>();

    public CentralTelefonica() {
    }

    public CentralTelefonica(List<Assinante> assinantes) {
        this.assinantes = assinantes;
    }

    public List<Assinante> getAssinantes() {
        return assinantes;
    }

    public void setAssinantes(List<Assinante> assinantes) {
        this.assinantes = assinantes;
    }

    /**
     * Insere um novo assinante na lista de assinates da central telefonica
     * @param a
     * @return
     */
    public Boolean inserirAssinante(Assinante a) {

        try {
            this.assinantes.add(a);
            return true;
        } catch (Error e) {
            System.out.println(e);
            return false;
        }

    }
}
