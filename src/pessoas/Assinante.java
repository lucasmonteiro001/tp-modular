package pessoas;

import telefonia.ELinhaTelefonicaStatus;
import telefonia.LinhaTelefonica;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class Assinante extends Pessoa {

    private LinhaTelefonica linhaTelefonica;


    public Assinante() {
    }

    public Assinante(String nome, String cpf) {
        super(nome, cpf);
    }

    public Assinante(String nome, String cpf, LinhaTelefonica linhaTelefonica) {
        super(nome, cpf);
        this.linhaTelefonica = linhaTelefonica;
    }

    public LinhaTelefonica getLinhaTelefonica() {
        return linhaTelefonica;
    }

    public void setLinhaTelefonica(LinhaTelefonica linhaTelefonica) {
        this.linhaTelefonica = linhaTelefonica;
    }

    public void fazerLigacao(String numero) {

        this.linhaTelefonica.fazerLigacao(numero);

    }

    @Override
    public String toString() {
        return super.toString() + " Assinante{" +
                "linhaTelefonica=" + linhaTelefonica +
                '}';
    }
}
