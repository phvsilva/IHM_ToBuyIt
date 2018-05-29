package com.example.steph.to_buy_it;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Shader;

import java.security.PublicKey;

public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;
public UserLocalStore (Context context){
    userLocalDatabase = context.getSharedPreferences(SP_NAME,0);
}

public void StoreUserData(User user){
    SharedPreferences.Editor spEditor = userLocalDatabase.edit();
    spEditor.putString("name",user.name);
    spEditor.putInt("idade",user.idade);
    spEditor.putString("nomeUtlizador",user.nomeUtilizador);
    spEditor.putString("palavraPasse",user.palavraPasse);
    spEditor.commit();
}
public User getLoggedInUser(){
    String name = userLocalDatabase.getString("name","");
    int idade = userLocalDatabase.getInt("idade",-1);
    String nomeUtilizador = userLocalDatabase.getString("nomeUtilizador","");
    String palavraPasse = userLocalDatabase.getString("palavraPase","");

    User storeUser = new User(name,idade,nomeUtilizador,palavraPasse);

    return storeUser;


}
public void setUserLoggedIn(){
    SharedPreferences.Editor spEditor = userLocalDatabase.edit();
    boolean loggedIn = false;
    spEditor.putBoolean("loggedIn", loggedIn);
    spEditor.commit();
}


}
