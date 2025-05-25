import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioController {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario novoUsuario = new Usuario(1, "Ana Souza", "ana@email.com");
        usuarioDAO.cadastrarUsuario(novoUsuario);

        System.out.println("Lista de usuários:");
        for (Usuario u : usuarioDAO.listarUsuarios()) {
            System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome() + " | Email: " + u.getEmail());
        }
    }
}
