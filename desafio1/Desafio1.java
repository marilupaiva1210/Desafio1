package Desafio1;

import java.util.Scanner;

public class Desafio1 {
    static Scanner input = new Scanner(System.in);
    static String[] nomes = new String[20];
    static String[] numeros = new String[20];
    static int posicao = 0;

    public static void Menu() {

        System.out.println(" - MENU PRINCIPAL -");
        System.out.println("1 - Cadastrar contatos");
        System.out.println("2 - Excluir contatos");
        System.out.println("3 - Listar contatos");
        System.out.println("4 - Limpar contatos");
        System.out.println("99 - Sair");

    }
    public static void Cadastro(String nome, String numero) {

        nomes[posicao] = nome;
        numeros[posicao] = numero;

    }
    public static void excluirContato(String nome) {

        for (int i = 0; i < nomes.length; i++) {
            if (nome.equals(nomes[i])) {
                nomes[i] = null;
                numeros[i] = null;
            }
        }
    }
    public static void listarContato() {

        System.out.println("- Lista de contatos -");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {

                String contato = "Nome: " + nomes[i] +
                                 " Número: " + numeros[i];

                System.out.println(contato);

            }
        }
    }
    public static void limparContatos() {

        for (int i = 0; i < nomes.length; i++) {

            nomes[i] = null;
            numeros[i] = null;

        }
    }
    public static void main(String[] args) {

        String nome, numero;
        String opcao;

        do {
            Menu();

            opcao = input.nextLine();

            switch (opcao) {

                case "1":

                    System.out.println("Informe o nome:");
                    nome = input.nextLine();

                    System.out.println("Informe o número:");
                    numero = input.nextLine();

                    Cadastro(nome, numero);
                    posicao++;

                    break;

                case "2":
                    System.out.println("Qual contato deseja excluir?");
                    nome = input.nextLine();

                    excluirContato(nome);

                    System.out.println("Seu contato foi excluído.");

                    break;

                case "3":

                    listarContato();

                    break;

                case "4":

                    limparContatos();

                    System.out.println("Sua lista foi limpa.");

                    break;

                case "99":

                    System.out.println("Programa finalizado!");

                    break;

                default:

                    System.out.println("Opção inválida! Tente novamente:");

            }
        } while (!opcao.equals("99"));

        input.close();

    }
}
