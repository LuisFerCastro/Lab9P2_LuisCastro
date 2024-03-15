/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luiscastro_lab9p2;

import java.awt.TextArea;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author lfern
 */
public class AdmArchivos {
    File archivo;
    TextArea text;

    public AdmArchivos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public TextArea getText() {
        return text;
    }

    public void setText(TextArea text) {
        this.text = text;
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        if(archivo.exists()){
            try {
                fw = new FileWriter(archivo);
                
            } catch (Exception e) {
            }
        }
        
    }
}
