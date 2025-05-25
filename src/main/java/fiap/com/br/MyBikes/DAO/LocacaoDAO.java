package dao;

import db.Conexao;
import model.Locacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LocacaoDAO {

    public void cadastrarLocacao(Locacao locacao) {
        String sql = "INSERT INTO locacoes (id_locacao, id_moto, data_inicio, data_fim) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, locacao.getIdLocacao());
            stmt.setInt(2, locacao.getIdMoto());
            stmt.setDate(3, locacao.getDataInicio());
            stmt.setDate(4, locacao.getDataFim());

            stmt.executeUpdate();
            System.out.println("Locação cadastrada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar locação: " + e.getMessage());
        }
    }

    public List<Locacao> listarLocacoes() {
        List<Locacao> locacoes = new ArrayList<>();
        String sql = "SELECT * FROM locacoes";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Locacao locacao = new Locacao(
                    rs.getInt("id_locacao"),
                    rs.getInt("id_moto"),
                    rs.getDate("data_inicio"),
                    rs.getDate("data_fim")
                );
                locacoes.add(locacao);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar locações: " + e.getMessage());
        }

        return locacoes;
    }
}
