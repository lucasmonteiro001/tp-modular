package com.modular;

import pessoas.Assinante;
import pessoas.Pessoa;
import telefonia.ELinhaTelefonicaStatus;
import telefonia.LinhaTelefonica;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinhaTelefonica linhaTelefonica = new LinhaTelefonica("(31)97303-4518");

        Assinante assinante = new Assinante("Lucas","098.612.066-08", linhaTelefonica);


        System.out.println(assinante);
    }
}
