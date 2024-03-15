/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luiscastro_lab9p2;

import java.io.File;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author lfern
 */
public class BarraCargar implements Runnable{
    JProgressBar barra;
    boolean vive;
    JTextArea ta;
    String path;

    public BarraCargar(JProgressBar barra) {
        this.barra = barra;
        vive = true;
    }

    public BarraCargar(JProgressBar barra, JTextArea ta, String path) {
        this.barra = barra;
        this.ta = ta;
        this.path = path;
        vive = true;
    }
    
    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        barra.setValue(0);
        while(vive){
            barra.setValue(barra.getValue()+1);
            if(barra.getValue() == 100){
                vive = false;
            }
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        AdmArchivos adm = new AdmArchivos(path, ta);
        try {
            adm.leerArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
