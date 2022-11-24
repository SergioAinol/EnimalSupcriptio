package com.example.enimalsupcriptio.Modelos;

public class Animal {
    private Integer id;
    private Integer numero;
    private String tipo;
    private Integer arete;
    private Integer pariciones;
    private String fechaTipoSexo;
    private String hijoHija;
    private Integer anioNacimiento;
    private String raza;
    private String observaciones;

    public Animal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getArete() {
        return arete;
    }

    public void setArete(Integer arete) {
        this.arete = arete;
    }

    public Integer getPariciones() {
        return pariciones;
    }

    public void setPariciones(Integer pariciones) {
        this.pariciones = pariciones;
    }

    public String getFechaTipoSexo() {
        return fechaTipoSexo;
    }

    public void setFechaTipoSexo(String fechaTipoSexo) {
        this.fechaTipoSexo = fechaTipoSexo;
    }

    public String getHijoHija() {
        return hijoHija;
    }

    public void setHijoHija(String hijoHija) {
        this.hijoHija = hijoHija;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
