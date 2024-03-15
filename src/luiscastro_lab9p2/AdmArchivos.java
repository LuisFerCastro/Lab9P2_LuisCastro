/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luiscastro_lab9p2;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author lfern
 */
public class AdmArchivos {
    File archivo;
    JTextArea text;

    public AdmArchivos(String path, JTextArea t) {
        archivo = new File(path);
        text = t;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public JTextArea getText() {
        return text;
    }

    public void setText(JTextArea text) {
        this.text = text;
    }
    
    public void escribirArchivo(){
        String texto = text.getText();
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.flush();
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void leerArchivo(){
        Scanner sc = null;
        if(archivo.exists()){
            try {
                sc = new Scanner(archivo);
                String line = "";
                while(sc.hasNext()){
                    line += sc.next() +" ";
                    text.setText(line);
                }
                /*sc = new Scanner(archivo);
                while (sc.hasNext()) {
                String next = sc.next();
                text.append(next);
                }*/
                try {
                    sc.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
