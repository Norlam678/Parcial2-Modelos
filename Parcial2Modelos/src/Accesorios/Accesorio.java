/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accesorios;
import Armas.Arma;
/**
 *
 * @author estudiantes
 */
public class Accesorio implements Decorador{
    private String nombre;
    private double daño;
    private double precision;
    private double velocidadDeRecarga;
    private double ruido;
    private Arma arma;
    public Accesorio(String nombre, double daño, double precision, double velocidadDeRecarga, double ruido, Arma arma) {
        this.nombre = nombre;
        this.daño = daño;
        this.precision = precision;
        this.velocidadDeRecarga = velocidadDeRecarga;
        this.ruido = ruido;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDaño() {
        return daño;
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

    @Override
    public String getDescription() {
        arma.getAccesorios().add(this);
        arma.setDaño(daño + arma.getDaño());
        arma.setPrecision(precision + arma.getPrecision());
        arma.setVelocidadDeRecarga(velocidadDeRecarga + arma.getVelocidadDeRecarga());
        arma.setRuido(ruido + arma.getRuido());
        return arma.getDescripcion();
    }
}
