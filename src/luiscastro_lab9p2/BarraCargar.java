/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luiscastro_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author lfern
 */
public class BarraCargar implements Runnable{
    JProgressBar barra;
    boolean vive;

    public BarraCargar(JProgressBar barra) {
        this.barra = barra;
        vive = true;
    }
    
    @Override
    public void run() {
        while(vive){
            barra.setValue(barra.getValue()+1);
            if(barra.getValue() == 100000000){
                vive = false;
            }
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
    
}
