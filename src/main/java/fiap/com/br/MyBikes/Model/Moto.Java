public class Moto {
    private int id;
    private String modelo;
    private String placa;
    private String cor;
    private String status;

    public Moto(int id, String modelo, String placa, String cor, String status) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.status = status;
    }

    public String toString() {
        return "Moto [ID: " + id + ", Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor + ", Status: " + status + "]";
    }
}
