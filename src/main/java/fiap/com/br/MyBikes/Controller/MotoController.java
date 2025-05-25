import model.Moto;
import service.MotoService;

public class MotoController {
    public static void main(String[] args) {
        MotoService motoService = new MotoService();

        Moto m1 = new Moto(1, "Mottu Pop", "ABC1234", "Preta", "Disponível");
        Moto m2 = new Moto(2, "Mottu E", "XYZ5678", "Branca", "Locada");

        motoService.cadastrarMoto(m1);
        motoService.cadastrarMoto(m2);

        for (Moto m : motoService.listarMotos()) {
            System.out.println(m);
        }
    }
}
