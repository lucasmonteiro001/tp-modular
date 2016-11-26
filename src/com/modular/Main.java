package com.modular;

import pessoas.Assinante;
import pessoas.Pessoa;
import telefonia.CentralComutacao;
import telefonia.CentralTelefonica;
import telefonia.ELinhaTelefonicaStatus;
import telefonia.LinhaTelefonica;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinhaTelefonica linhaTelefonica1 = new LinhaTelefonica("(31)97303-4518");
        LinhaTelefonica linhaTelefonica2 = new LinhaTelefonica("(31)99999-9999");

        Assinante lucas = new Assinante("Lucas","098.612.066-08", linhaTelefonica1);
        Assinante lidia = new Assinante("Lidia","015.612.051-51", linhaTelefonica2);

        CentralTelefonica ctA = new CentralTelefonica();
        ctA.adicionarAssinante(lucas);
        ctA.adicionarAssinante(lidia);

        CentralTelefonica ctB = new CentralTelefonica();
        ctB.adicionarAssinante(lidia);

        CentralComutacao c = new CentralComutacao();
        c.adicionarCentralTelefonica(ctA);


        linhaTelefonica1.setCentralTelefonica(ctA);

        lucas.fazerLigacao("3357-1685");

        System.out.println(ctA.isLinhaEmUso(linhaTelefonica1.getNumero()));
    }
}
