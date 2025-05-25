package service;

import model.Moto;
import java.util.ArrayList;
import java.util.List;

public class MotoService {
    private List<Moto> motos = new ArrayList<>();

    public void cadastrarMoto(Moto moto) {
        motos.add(moto);
        System.out.println("Moto cadastrada com sucesso!");
    }

    public List<Moto> listarMotos() {
        return motos;
    }
}
