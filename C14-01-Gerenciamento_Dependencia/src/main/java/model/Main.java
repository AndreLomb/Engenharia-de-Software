package model;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("André", 20, true);
        Gson gson = new Gson();

        if (pessoa.isEmpregado())
            System.out.println(pessoa.getNome() + " está empregado");
        else
            System.out.println(pessoa.getNome() + " está desempregado!");

        String json = gson.toJson(pessoa);
        System.out.println(json);
    }
}
