/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraconhilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Rita
 */
public class animal extends Thread {

    String nombre;
    int velocidad;
    int llegada;
    JLabel label;

    public animal(String nombre, int velocidad, int llegada, JLabel label) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.llegada = llegada;
        this.label = label;

    }

    @Override
    public void run() {
        for (int i = 0; i < llegada; i++) {
            System.out.println(nombre + " avanza");
            label.setLocation(i, 0);
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(nombre + " ha llegado a la meta");

        yield();//para alternar los hilos
    }

}
