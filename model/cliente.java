package model;

import java.util.Scanner;

public class cliente extends usuarioGeral {
    int numPlano;

    public cliente(String nome, String email, int cpf, String endereco, int telefone, String senha, int numPlano) {
        super(nome, email, cpf, endereco, telefone, senha);
        this.numPlano = numPlano;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlano: " + numPlano;
    }

    Scanner ler = new Scanner(System.in);

    public cliente Cadastro() {
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite seu email:");
        String email = ler.nextLine();

        System.out.println("Digite seu cpf:");
        int cpf = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite seu endereço:");
        String endereco = ler.nextLine();

        System.out.println("Digite seu telefone:");
        int telefone = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite sua senha:");
        String senha = ler.nextLine();

        System.out.println("Digite o número do seu plano:");
        int plano = ler.nextInt();

        return new cliente(nome, email, cpf, endereco, telefone, senha, plano);
    }
}

  
