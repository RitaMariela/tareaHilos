/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraconhilos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rita
 */
public class carrera extends JFrame {

    JPanel[] paneles;
    JLabel[] label;
    String[] nombre = {"conejo", "tortuga", "jaguar", "ratón"};
    JButton boton;
    int ancho = 700;

    public carrera() {

        setLayout(new GridLayout(0, 1));//para ver en forma de tabla
        paneles = new JPanel[4];//indicar de cuantos queremos que sea
        label = new JLabel[4];

        for (int i = 0; i < 4; i++) {
            paneles[i] = new JPanel();
            add(paneles[i]);//agregar panel al frame
            label[i] = new JLabel(nombre[i]);
            //label[i].setIcon(new ImageIcon(getClass().getResource(nombre[i]+"..png")));
            paneles[i].add(label[i]);//agregar labels a frame           

        }
        boton = new JButton("Comenzar carrera");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                animal conejo = new animal("conejo", 30, ancho - 50, label[0]);

                animal tortuga = new animal("Tortuga", 100, ancho - 50, label[1]);
                animal jaguar = new animal("jaguar", 5, ancho - 50, label[2]);
                animal raton = new animal("ratón", 30, ancho - 50, label[3]);

                conejo.start();
                tortuga.start();
                jaguar.start();
                raton.start();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(boton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que se cierre y no quede en ejecución
        setLocation(200, 250);
        setSize(ancho, 250);
        setVisible(true);
    }

}
