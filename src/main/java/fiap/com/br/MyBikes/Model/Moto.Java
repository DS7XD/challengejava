package model;

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

    public int getId() { return id; }
    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }
    public String getCor() { return cor; }
    public String getStatus() { return status; }

    public void setId(int id) { this.id = id; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setPlaca(String placa) { this.placa = placa; }
    public void setCor(String cor) { this.cor = cor; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Moto [ID: " + id + ", Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor + ", Status: " + status + "]";
    }
}
