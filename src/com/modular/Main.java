package com.modular;
import static java.lang.System.out;

import pessoas.Assinante;
import pessoas.Pessoa;
import telefonia.CentralComutacao;
import telefonia.CentralTelefonica;
import telefonia.ELinhaTelefonicaStatus;
import telefonia.LinhaTelefonica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        while(true) {

            Scanner reader = new Scanner(System.in);  // Reading from System.in

            out.println("Entrar como:\n" +
                    "(1) Assinante\n" +
                    "(2) Central Telefônica\n" +
                    "(3) Sistema de Comutação");

            Integer modo = reader.nextInt();

           switch (modo) {
               // se for assinante
               case 1:

                   out.println("Digite seu CPF:");
                   String cpf = reader.next();

                   // buscar usuario no sistema

                   // FIXME verificar se o usuario está cadastrado em  alguma central telefonica
                   Boolean usuarioExistente = true;

                   out.print(cpf);

                   break;
               case 2:
                   out.println("Central Telefônica");
                   break;
               case 3:
                   out.println("Sistema de Comutação");
                   break;

           }

           out.println("\n\nObrigado por utilizar nosso sistema!\n\n");

        }
    }
}
