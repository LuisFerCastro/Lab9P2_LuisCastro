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
public class Fecha implements Runnable{
    JLabel fecha;

    public Fecha(JLabel fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void run() {
        while(true){
            Date f = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String date = df.format(f);
            fecha.setText(date);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
