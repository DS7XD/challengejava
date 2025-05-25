public class Usuario {
    private int id;
    private String nome;
    private String email;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String toString() {
        return "Usuário [ID: " + id + ", Nome: " + nome + ", Email: " + email + "]";
    }
}
