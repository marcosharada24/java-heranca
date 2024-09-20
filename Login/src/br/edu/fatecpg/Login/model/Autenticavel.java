package br.edu.fatecpg.Login.model;


public interface Autenticavel {
    boolean login(String usuario, String senha); 
    void logout(); 
}
