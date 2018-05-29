package com.example.steph.to_buy_it;

public class User {
    String name, nomeUtilizador, palavraPasse;
    int idade;

    public User (String name, int idade, String nomeUtilizador,String palavraPasse){
        this.name = name;
        this.idade = idade;
        this.nomeUtilizador = nomeUtilizador ;
        this.palavraPasse = palavraPasse;

    }

    public User(String nomeUtilizador, String palavraPasse){
        this.nomeUtilizador = nomeUtilizador ;
        this.palavraPasse = palavraPasse;
        this.name = "" ;
        this.idade = -1;
    }
}
