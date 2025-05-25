package dao;

import db.Conexao;
import model.Locacao;

import java.sql.*;

public class LocacaoDAO {

    public void cadastrarLocacao(Locacao l) {
        String sql = "INSERT INTO locacoes (id_locacao, id_moto, id_usuario, data_inicio, data_fim) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, l.getId());
            stmt.setInt(2, l.getIdMoto());
            stmt.setInt(3, l.getIdUsuario());
            stmt.setDate(4, l.getDataInicio());
            stmt.setDate(5, l.getDataFim());

            stmt.executeUpdate();
            System.out.println("Locação registrada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao registrar locação: " + e.getMessage());
        }
    }
}
