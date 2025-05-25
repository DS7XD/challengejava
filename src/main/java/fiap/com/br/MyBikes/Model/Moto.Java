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
}
