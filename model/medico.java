package model;

public class medico extends usuarioGeral{
    int crm;

    public medico(String nome, String email, int cpf, String endereco, int telefone, String senha, int crm) {
        super(nome, email, cpf, endereco, telefone, senha);
        this.crm = crm;
    }

   
}