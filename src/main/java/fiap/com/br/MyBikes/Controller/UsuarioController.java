import model.Usuario;
import service.UsuarioService;

public class UsuarioController {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();

        Usuario u1 = new Usuario(1, "Guilherme Lima", "guilherme@example.com");
        Usuario u2 = new Usuario(2, "Felipe Yamaguchi", "felipe@example.com");

        usuarioService.cadastrarUsuario(u1);
        usuarioService.cadastrarUsuario(u2);

        for (Usuario u : usuarioService.listarUsuarios()) {
            System.out.println(u);
        }
    }
}
