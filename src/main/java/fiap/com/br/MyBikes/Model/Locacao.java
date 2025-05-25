package model;

import java.sql.Date;

public class Locacao {
    private int idLocacao;
    private int idMoto;
    private Date dataInicio;
    private Date dataFim;

    public Locacao(int idLocacao, int idMoto, Date dataInicio, Date dataFim) {
        this.idLocacao = idLocacao;
        this.idMoto = idMoto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public int getIdMoto() {
        return idMoto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public void setIdMoto(int idMoto) {
        this.idMoto = idMoto;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Locacao [ID: " + idLocacao + ", Moto ID: " + idMoto +
               ", Início: " + dataInicio + ", Fim: " + dataFim + "]";
    }
}
