package br.edu.fatecpg.Login.model;


public class SistemaDeSeguranca implements Autenticavel {
    private final String usuarioCorreto = "admin"; // Valor correto do usuário
    private final String senhaCorreta = "1234"; // Valor correto da senha
    private boolean usuarioAutenticado = false;

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            usuarioAutenticado = true;
            return true; // Login bem-sucedido
        }
        return false; // Login falhou
    }

    @Override
    public void logout() {
        usuarioAutenticado = false;
    }

    public boolean isUsuarioAutenticado() {
        return usuarioAutenticado;
    }
}
