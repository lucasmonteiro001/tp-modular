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
                    "(3) Sistema de Comutação\n" +
                    "(4) Sair");

            Integer modo = reader.nextInt();

           switch (modo) {
               // se for assinante
               case 1:

                   out.println("Digite seu CPF:");
                   String cpf = reader.next();

                   // buscar usuario no sistema

                   // FIXME verificar se o usuario está cadastrado em  alguma central telefonica
                   Boolean usuarioExistente = true;

                   if(!usuarioExistente) {

                       out.println("Assinante não encontrado!");
                       break;
                   }

                   out.println("O que deseja fazer?\n" +
                           "(1) Realizar uma ligação\n" +
                           "(2) Desligar da ligação atual");

                   Integer acao = reader.nextInt();

                   switch (acao) {

                       case 1:
                           break;
                       case 2:
                           break;
                       default:
                           opcaoInvalida();
                   }

                   break;
               case 2:
                   out.println("Central Telefônica");
                   break;
               case 3:
                   out.println("Sistema de Comutação");
                   break;
               case 4:
                   System.exit(0);
                   break;
               default:
                   opcaoInvalida();
                   break;

           }

           out.println("\n\nObrigado por utilizar nosso sistema!\n\n");

        }
    }

    public static void opcaoInvalida() {

        out.println("Opção inválida!");
    }
}
