package model;

import java.sql.Date;

public class Locacao {
    private int id;
    private int idMoto;
    private int idUsuario;
    private Date dataInicio;
    private Date dataFim;

    public Locacao(int id, int idMoto, int idUsuario, Date dataInicio, Date dataFim) {
        this.id = id;
        this.idMoto = idMoto;
        this.idUsuario = idUsuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() { return id; }
    public int getIdMoto() { return idMoto; }
    public int getIdUsuario() { return idUsuario; }
    public Date getDataInicio() { return dataInicio; }
    public Date getDataFim() { return dataFim; }
}
