package Armas;

import Accesorios.Accesorio;
import java.util.ArrayList;


public abstract class Arma{
    private double daño;
    private String nombre;
    private double precision;
    private double velocidadDeRecarga;
    private double ruido;
    private ArrayList <Accesorio> accesorios;

    public Arma(double daño, String nombre, double precision, double velocidadDeRecarga, double ruido, ArrayList accesorios) {
        this.daño = daño;
        this.nombre = nombre;
        this.precision = precision;
        this.velocidadDeRecarga = velocidadDeRecarga;
        this.ruido = ruido;
        this.accesorios = accesorios;
    }
    public double getDaño() {
        return daño;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecision() {
        return precision;
    }
    public double getVelocidadDeRecarga() {
        return velocidadDeRecarga;
    }
    public double getRuido() {
        return ruido;
    }
    public ArrayList<Accesorio> getAccesorios() {
        return this.accesorios;
    }
    public void setDaño(double daño) {
        this.daño = daño;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public void setVelocidadDeRecarga(double velocidadDeRecarga) {
        this.velocidadDeRecarga = velocidadDeRecarga;
    }
    public void setRuido(double ruido) {
        this.ruido = ruido;
    }

    public void setAccesorios(ArrayList<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }

    public abstract String getDescripcion();

}
