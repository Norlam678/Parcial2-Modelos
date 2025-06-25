/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba;

import Accesorios.Accesorio;
import Armas.Arma;
import Armas.Escopeta;
import Armas.Pistola;
import Armas.Rifle;

public class Parcial2Modelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arma pistola = new Pistola(50, "Pistola 9mm", 0.8, 2.0, 1.5);
        Arma rifle = new Rifle(80, "Rifle de Asalto", 0.9, 1.5, 2.0);
        Arma escopeta = new Escopeta(100, "Escopeta de Caza", 0.7, 3.0, 3.5);

        System.out.println(pistola.getDescripcion());
        System.out.println(rifle.getDescripcion());
        System.out.println(escopeta.getDescripcion());

        // Adding accessories to the weapons
        Accesorio silenciador = new Accesorio("Silenciador", 0, 0, 0, -1, pistola);
        Accesorio mira = new Accesorio("Mira Telescópica", 0, 0.2, 0, 0, rifle);
        Accesorio cartucho = new Accesorio("Cartucho de Alta Capacidad", 20, 0, -1, 0, escopeta);
        System.out.println(silenciador.getDescription());
        System.out.println(mira.getDescription());
        System.out.println(cartucho.getDescription());
        
    }
}
