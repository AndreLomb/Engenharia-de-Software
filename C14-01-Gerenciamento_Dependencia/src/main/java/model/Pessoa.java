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

    public boolean isEmpregado(){
        return empregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }
}
