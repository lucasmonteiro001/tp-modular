package telefonia;

import pessoas.Assinante;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lidiaferreira on 11/26/16.
 */
public class CentralTelefonica {

    private String id;
    private List<Assinante> assinantes = new LinkedList<Assinante>();
    private CentralComutacao centralComutacao;

    public CentralTelefonica(String id) {
        this.id = id;
    }

    public CentralTelefonica(String id, List<Assinante> assinantes, CentralComutacao centralComutacao) {
        this.id = id;
        this.assinantes = assinantes;
        this.centralComutacao = centralComutacao;
    }

    /**
     * Insere um novo assinante na lista de assinates da central telefonica
     * @param a
     * @return
     */
    public Boolean adicionarAssinante(Assinante a) {

        try {
            this.assinantes.add(a);
            return true;
        } catch (Error e) {
            System.out.println(e);
            return false;
        }

    }

    public Assinante removerAssinantePorCpf(String cpf) {

        try {
            // TODO buscar o assinante pelo ID e remove-lo
        } catch (Error e) {
            System.out.println(e);
            return null;
        }

        return null;

    }

    public Assinante removerAssinantePorNumeroLinha(String numeroLinhaTelefonica) {

        try {
            // TODO buscar o assinante pelo numero da linha telefonica e remove-lo
        } catch (Error e) {
            System.out.println(e);
            return null;
        }

        return null;

    }

    public void suspenderLinhaTelefonica (String numeroLinhaTelefonica) {

        // TODO buscar todas as linha telefonicas e remover a que possuir o numero igual a numeroLinhaTelefonica
    }


    /**
     * Obtem a linha passada como parametro pelo numero ou retorna null
     * @param numero
     * @return
     */
    public LinhaTelefonica getLinhaTelefonica(String numero) {

        // percorre todos os assinantes em busca da linha telefonica
        for(Assinante assinante : this.assinantes) {

            LinhaTelefonica linha = assinante.getLinhaTelefonica();

            // se o numero da linha telefonica for o mesmo passado como parametro
            if(linha.getNumero().equals(numero)) {

                // retorna a linha
                return linha;
            }

        }

        return null;
    }

    public Boolean isLinhaEmUso(String numero) {

        LinhaTelefonica linha = getLinhaTelefonica(numero);

        // se nao achou a linha, exibe erro
        if(linha == null) {
            throw new Error("LINHA TELEFONICA NAO ENCONTRADA");
        }

        return linha.isLinhaEmUso();
    }

    public void fazerLigacao(String numero) {

        if(this.centralComutacao == null) {
            throw new Error("CENTRAL TELEFONICA NAO CONECTADA A NENHUMA CENTRAL DE COMUTACAO!");
        }


    }

    public List<Assinante> getAssinantes() {
        return assinantes;
    }

    public void setAssinantes(List<Assinante> assinantes) {
        this.assinantes = assinantes;
    }

    public CentralComutacao getCentralComutacao() {
        return centralComutacao;
    }

    public void setCentralComutacao(CentralComutacao centralComutacao) {
        this.centralComutacao = centralComutacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CentralTelefonica{" +
                "assinantes=" + assinantes +
                '}';
    }

}
