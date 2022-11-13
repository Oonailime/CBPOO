package com.mycompany.cbpoo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CBPOO {

    List<Pessoa> pessoas = new ArrayList<>();

    public void layoutMenuPessoa() {
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|               Menu de Opções              |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 06 - Submeter Artigo                      |");
        System.out.println("| 11 - Listar Artigos Aceitos               |");
        System.out.println("| 12 - Listar Artigos Negados               |");
        System.out.println("| 13 - Ver Dados Do Artigo                  |");
        System.out.println("| 14 - Listar Participantes                 |");
        System.out.println("| 15 - Sair                                 |");
        System.out.println("+-------------------------------------------+");
    }

    public void layoutMenu() {
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|              Menu de Opções               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 01 - Login                                |");
        System.out.println("| 02 - Inscrever-se                         |");
        System.out.println("| 14 - Imprimir inscritos                   |");
        System.out.println("| 15 - Sair                                 |");
        System.out.println("+-------------------------------------------+");
    }

    public void inscreverParticipante() {
        Scanner leitor = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("CPF: ");
        p.setCpf(leitor.nextLine());

        System.out.print("Nome: ");
        p.setNome(leitor.nextLine());

        System.out.print("Dia, mês e ano de nascimento: ");

        p.setDatanasc(leitor.nextLine());

        System.out.print("Titulo Academico: ");

        p.setTituloacademico(leitor.nextLine());

        System.out.print("Instituição: ");

        p.setInstituicao(leitor.nextLine());

        System.out.print("Senha: ");

        p.setSenha(leitor.nextLine());

        p.setInscricao(false);

        pessoas.add(p);

    }

    public void imprimirPessoa() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("\nNome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Data de nascimento: " + pessoa.getDatanasc());
            System.out.println("Instituição: " + pessoa.getInstituicao());
            System.out.println("Título acadêmico: " + pessoa.getTituloacademico());
            System.out.println("\n");
        }
    }

    public Pessoa login(String CPF) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = leitor.nextLine();

        for (Pessoa p : pessoas) {

            String cpf = p.getCpf();
            String s = p.getSenha();
            short opcao = 99;

            if (cpf.equals(CPF)) {

                if (s.equals(senha)) {
                    System.out.println("Login efetuado...");

                    System.out.println("\n");
                    System.out.println("+-------------------------------------------+");
                    System.out.println("|              Qual tipo de conta?          |");
                    System.out.println("+-------------------------------------------+");
                    System.out.println("| 01 - Inscrito                             |");
                    System.out.println("| 02 - Autor                                |");
                    System.out.println("| 03 - Revisor                              |");
                    System.out.println("|                                           |");
                    System.out.println("+-------------------------------------------+");

                    System.out.print("Opção escolhida: ");
                    opcao = leitor.nextShort();

                    switch (opcao) {
                        case 1:
                            p.setInscricao(true);
                            layoutMenuPessoa();
                        case 2:
                            p.setAutor(true);
                        case 3:
                            p.setRevisor(true);
                    }

                    return p;
                } else {
                    System.out.println("Senha digitada incorretamente.");

                    return null;
                }
            }
        }

        System.out.println("CPF não cadastrado ou erro de digitação");

        return null;

    }

    public static void main(String[] args) {

        CBPOO usuario = new CBPOO();
        Scanner leitor = new Scanner(System.in);
        short opcao = 16;
        Pessoa menu = new Pessoa();

        do {
            if (menu.isInscricao()) {
                usuario.layoutMenuPessoa();
            } else {
                usuario.layoutMenu();
            }

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch (opcao) {
                case 1:

                    System.out.print("Digite seu CPF: ");
                    leitor.nextLine();
                    String CPF = leitor.nextLine();

                    menu = usuario.login(CPF);

                    break;
                case 2:
                    usuario.inscreverParticipante();
                case 14:
                    usuario.imprimirPessoa();
                    break;
                case 4:

                case 16:
                    usuario.layoutMenu();
                    break;
                default:
                    if (menu.isInscricao()) {
                        usuario.layoutMenuPessoa();
                    } else {
                        usuario.layoutMenu();
                    }

            }
        } while (opcao != 15);

    }
}
