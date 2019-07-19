/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javafx.scene.control.Label;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Opciones opciones =new Opciones();
        opciones.setVisible(true);
       /*FrameClicks clicks=new FrameClicks();
       clicks.setVisible(true);
       clicks.setBackground(Color.ORANGE);
       //clicks.m1();
      // clicks.
      // clicks.contarClicksPerdio();*/
    }
 
   /* public static void m1(){
        
        int velocidad=1;
        Timer timer;
        TimerTask tarea;
        int velmil=velocidad*600;
        
        
        FrameClicks clicks=new FrameClicks();
        clicks.setVisible(true);
        
        tarea =new TimerTask() {
            @Override
            public void run() {
                Icon icono;
                switch(contador){
                    case 0:
                        contador=1;
                        icono=new ImageIcon(getClass().getResource("img2.jpg"));
                        clicks.jButton1.setIcon(icono);
                     // clicks.contarClicks();
                      //clicks.deshabilitar();
                        break;
                    
                    case 1:contador=0;
                        icono=new ImageIcon(getClass().getResource("img.jpg"));
                        clicks.jButton1.setIcon(icono);
                        
                    clicks.jButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showInputDialog(null,"PERDIO ÑRO");
                                
                            }
                            
                        });
                     //   clicks.habilitar();
                      //  clicks.habilitar();
                        break;
                }
                    
            }
            
        };
        timer =new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
       
       System.out.println(timer.hashCode());
   }*/
    
}
