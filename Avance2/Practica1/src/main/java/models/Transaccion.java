package models;

import java.sql.Date;

public class Transaccion {
    private int idTransaccion;
    private String persona;
    private String tipoTransaccion;
    private Date fecha;
    private String descripción;

    public Transaccion(){

    }

    public Transaccion(int idTransaccion, String persona, String tipoTransaccion, Date fecha, String descripción) {
        this.idTransaccion = idTransaccion;
        this.persona = persona;
        this.tipoTransaccion = tipoTransaccion;
        this.fecha = fecha;
        this.descripción = descripción;
    }
    
    public int getIdTransaccion() {
        return idTransaccion;
    }
    
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getpersona() {
        return persona;
    }

    public void setpersona(String persona) {
        this.persona = persona;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
}
