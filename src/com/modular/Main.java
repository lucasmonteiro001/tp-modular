package com.modular;
import java.util.Scanner;

import static java.lang.System.out;

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

                       // realizar uma ligação
                       case 1:
                           out.println("Qual o número para o qual você deseja ligar?");

                           String numero = reader.next();

                           // TODO chamar o método de ligacao da linha telefonica vinculada ao assinate
                           break;
                       // finalizar ligação atual
                       case 2:
                           // TODO chamar o método de finalizar ligação atual
                           break;
                       default:
                           opcaoInvalida();
                   }

                   break;

               // se for uma central telefonica
               case 2:
                   out.println("Digite o ID da Central Telefônica que deseja controlar:");

                   String idCentral = reader.next();

                   // buscar a central telefonica no sistema

                   // FIXME verificar se a central existe

                   Boolean existeCentralTelefonica = true;

                   if(!existeCentralTelefonica) {
                       out.println("Central Telefônica não encontrada!");
                       break;
                   }

                   out.println("O que deseja fazer?\n" +
                           "(1) Adicionar nova linha telefônica\n" +
                           "(2) Excluir linha telefônica\n" +
                           "(3) Suspender funcionamento de linha telefônica");

                   Integer acaoCentralTelefonica = reader.nextInt();

                   switch (acaoCentralTelefonica) {

                       // se for para adicionar uma nova linha telefonica
                       case 1:

                           out.println("Informe os dados do assinante:\n" +
                                   "Nome:");

                           String nomeAssinante = reader.next();

                           out.println("CPF:");

                           String cpfAssinante = reader.next();

                           out.println("Número da nova linha de telefone:");

                           String numeroNovaLinha = reader.next();

                            out.println("Confirma os dados abaixo ?\n" +
                                    "(1) Sim\n" +
                                    "(2) Não\n");
                           out.println("\tNome: " + nomeAssinante + "\n\tCPF: " + cpfAssinante + "\n\tLinha: " +
                                   numeroNovaLinha);

                           Integer opcaoConfirmaCriacaoNovaLinha = reader.nextInt();

                           switch (opcaoConfirmaCriacaoNovaLinha) {

                               // Se deseja realmente criar a linha com os dados inseridos
                               case 1:
                                   // TODO chamar método da Central Telefonica para adicionar uma nova linha passado
                                   // os dados acima
                                   break;
                               // Se não confirma os dados e deseja cancelar o cadastro
                               case 2:
                                   break;
                               default:
                                   opcaoInvalida();
                                   break;
                           }


                           break;

                       // se for para excluir um linha telefonica
                       case 2:

                           out.println("Deseja realizar a exclusão por CPF ou por número da Linha Telefônica?\n" +
                                   "(1) CPF\n" +
                                   "(2) Número da Linha Telefônica\n");

                           Integer modoExclusaoLinhaTelefonica = reader.nextInt();

                           switch (modoExclusaoLinhaTelefonica) {

                               // realizar a exclusao da Linha Telefonica por CPF
                               case 1:

                                   out.println("Digite o número do CPF para exclusão da linha:");

                                   String cpfParaExcluirLinha = reader.next();

                                   // TODO buscar por assinante com esse cpf
                                   Boolean assinanteExiste = true;

                                   if(!assinanteExiste) {
                                       out.println("Assinante não encontrado");
                                       break;
                                   }

                                   // TODO chamar método para excluir assinante por CPF

                                   break;
                               // realizar a exclusao da Linha Telefonica por CPF
                               case 2:

                                   out.println("Digite o número da Linha Telefônica que será excluída:");

                                   String numeroLinhaParaSerExcluida = reader.next();

                                   // TODO buscar por linha com esse numero
                                   Boolean linhaTelefonicaExiste = true;

                                   if(!linhaTelefonicaExiste) {
                                       out.println("Linha Telefônica não encontrada");
                                       break;
                                   }

                                   // TODO chamar método para excluir linha telefonica por numero (excluir assinante
                                   // tambem)

                                   break;

                               default:
                                   opcaoInvalida();
                                   break;

                           }


                           break;

                       // se for para suspender o funcionamento de uma linha telefonica
                       case 3:

                           break;

                       default:
                           opcaoInvalida();
                           break;
                   }

                   break;

               // se for um sistema de comutacao
               case 3:
                   out.println("Sistema de Comutação");

                   break;

               // se deseja sair do sistema
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
