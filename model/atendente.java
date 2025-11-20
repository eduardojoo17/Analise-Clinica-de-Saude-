package model;


public class atendente extends usuarioGeral{
    int matricula;

    public atendente(String nome, String email, int cpf, String endereco, int telefone, String senha, int matricula) {
        super(nome, email, cpf, endereco, telefone, senha);
        this.matricula = matricula;
    }


    
    

    
}