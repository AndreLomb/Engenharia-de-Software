package model;

public class Pessoa {
    public String nome;
    public int idade;
    public boolean empregado;

    public Pessoa(String nome, int idade, boolean empregado) {
        this.idade = idade;
        this.nome = nome;
        this.empregado = empregado;
    }

    public void isEmpregado(String nome, boolean Empregado){
        if(Empregado)
            System.out.println(nome + " está empregado");
        else System.out.println(nome + " está desempregado!");
    }
}
