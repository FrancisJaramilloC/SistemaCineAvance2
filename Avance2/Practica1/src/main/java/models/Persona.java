package models;

public class Persona {
    private Integer idpersona;
    private String nombres;
    private String dni;
    private String pertenencia;

    public Persona() {
    }

    public Persona(Integer idpersona, String nombres, String dni, String pertenencia) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.dni = dni;
        this.pertenencia = pertenencia;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }   

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(String pertenencia) {
        this.pertenencia = pertenencia;
    }


}
