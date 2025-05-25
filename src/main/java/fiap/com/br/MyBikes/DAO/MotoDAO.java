package dao;

import db.Conexao;
import model.Moto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MotoDAO {

    public List<Moto> listarMotos() {
        List<Moto> lista = new ArrayList<>();
        String sql = "SELECT * FROM motos";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Moto m = new Moto(
                    rs.getInt("id_moto"),
                    rs.getString("modelo"),
                    rs.getString("placa"),
                    rs.getString("cor"),
                    rs.getString("status")
                );
                lista.add(m);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar motos: " + e.getMessage());
        }

        return lista;
    }

    public void cadastrarMoto(Moto m) {
        String sql = "INSERT INTO motos (id_moto, modelo, placa, cor, status) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, m.getId());
            stmt.setString(2, m.getModelo());
            stmt.setString(3, m.getPlaca());
            stmt.setString(4, m.getCor());
            stmt.setString(5, m.getStatus());

            stmt.executeUpdate();
            System.out.println("Moto cadastrada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar moto: " + e.getMessage());
        }
    }
}
