/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luiscastro_lab9p2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author lfern
 */
public class Hora implements Runnable {
    JLabel hora;

    public Hora(JLabel hora) {
        this.hora = hora;
    }
    
    @Override
    public void run() {
        while(true){
            Date h = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
            hora.setText(sd.format(h));
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
