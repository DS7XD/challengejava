import dao.LocacaoDAO;
import model.Locacao;

import java.sql.Date;

public class LocacaoController {
    public static void main(String[] args) {
        LocacaoDAO locacaoDAO = new LocacaoDAO();

        // Cadastrar nova locação
        Locacao nova = new Locacao(1, 1, Date.valueOf("2025-05-10"), Date.valueOf("2025-05-17"));
        locacaoDAO.cadastrarLocacao(nova);

        // Listar locações
        System.out.println("Lista de locações:");
        for (Locacao l : locacaoDAO.listarLocacoes()) {
            System.out.println(l);
        }
    }
}
