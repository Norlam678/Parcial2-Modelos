package Armas;

import java.util.ArrayList;

public class Escopeta extends Arma{
    
    public Escopeta(double daño, String nombre, double precision, double velocidadDeRecarga, double ruido, ArrayList accesorios) {
        super(daño, nombre, precision, velocidadDeRecarga, ruido, accesorios);
    }

    @Override
    public String getDescripcion() {
        String mensaje =  "";
        if(this.getAccesorios().isEmpty()){
            mensaje = "Escopeta: " + this.getNombre() + "\n" + "Atrinbutos:\n" +
                    "Daño: " + this.getDaño() + "\n" +
                    "Precisión: " + this.getPrecision() + "\n" +
                    "Velocidad de recarga: " + this.getVelocidadDeRecarga() + "\n" +
                    "Ruido: " + this.getRuido() + "\n" +
                    "Accesorios:\n" +"No tiene accesorios";
        }
        else{
            mensaje = "Escopeta: " + this.getNombre() + "\n" + "Atrinbutos:\n" +
                    "Daño: " + this.getDaño() + "\n" +
                    "Precisión: " + this.getPrecision() + "\n" +
                    "Velocidad de recarga: " + this.getVelocidadDeRecarga() + "\n" +
                    "Ruido: " + this.getRuido() + "\n" +
                    "Accesorios:\n";
            for(int i = 0; i < this.getAccesorios().size(); i++){
                mensaje += this.getAccesorios().get(i).getDescription() + "\n";
            }
        }
        return mensaje;
    }
}
