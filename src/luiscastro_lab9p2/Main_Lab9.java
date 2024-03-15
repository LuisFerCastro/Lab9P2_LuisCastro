/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package luiscastro_lab9p2;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lfern
 */
public class Main_Lab9 extends javax.swing.JFrame {

    /**
     * Creates new form Main_Lab9
     */
    public Main_Lab9() {
        initComponents();
        Hora h = new Hora(hora);
        Fecha f = new Fecha(fecha);
        BarraCargar bc = new BarraCargar(pb_1);
        Thread pbC = new Thread(bc);
        Thread horaT = new Thread(h);
        Thread fechaT = new Thread(f);
        
        horaT.start();
        fechaT.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_in1 = new javax.swing.JPanel();
        pn_in2 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        btn_subir = new javax.swing.JButton();
        lb_archivo = new javax.swing.JLabel();
        pb_1 = new javax.swing.JProgressBar();
        lb_archivoTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_archivo = new javax.swing.JTextArea();
        lb_tituloHora = new javax.swing.JLabel();
        lb_bienvenido = new javax.swing.JLabel();
        lb_tituloFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_in1.setBackground(new java.awt.Color(255, 255, 255));
        pn_in1.setForeground(new java.awt.Color(0, 0, 0));
        pn_in1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pn_in2.setBackground(new java.awt.Color(255, 153, 153));

        lb_titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Boroa Cloud");

        btn_subir.setText("Subir Archivo");
        btn_subir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_subirMouseClicked(evt);
            }
        });

        lb_archivo.setForeground(new java.awt.Color(0, 0, 0));
        lb_archivo.setText("Subiendo Archivo.....");

        lb_archivoTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_archivoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lb_archivoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_archivoTitulo.setText("Archivo");

        ta_archivo.setColumns(20);
        ta_archivo.setRows(5);
        jScrollPane1.setViewportView(ta_archivo);

        javax.swing.GroupLayout pn_in2Layout = new javax.swing.GroupLayout(pn_in2);
        pn_in2.setLayout(pn_in2Layout);
        pn_in2Layout.setHorizontalGroup(
            pn_in2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_in2Layout.createSequentialGroup()
                .addGroup(pn_in2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_in2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_in2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lb_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_in2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pn_in2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_subir, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_in2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lb_archivoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pn_in2Layout.setVerticalGroup(
            pn_in2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_in2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_titulo)
                .addGap(28, 28, 28)
                .addComponent(btn_subir)
                .addGap(18, 18, 18)
                .addComponent(lb_archivo)
                .addGap(18, 18, 18)
                .addComponent(pb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_archivoTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lb_tituloHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_tituloHora.setForeground(new java.awt.Color(0, 0, 0));
        lb_tituloHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tituloHora.setText("Hora Actual:");

        lb_bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_bienvenido.setForeground(new java.awt.Color(0, 0, 0));
        lb_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bienvenido.setText("Bienvenido!");

        lb_tituloFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_tituloFecha.setForeground(new java.awt.Color(0, 0, 0));
        lb_tituloFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tituloFecha.setText("Fecha de Hoy:");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));

        hora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pn_in1Layout = new javax.swing.GroupLayout(pn_in1);
        pn_in1.setLayout(pn_in1Layout);
        pn_in1Layout.setHorizontalGroup(
            pn_in1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_in1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pn_in1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_in1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pn_in1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_tituloHora, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_tituloFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pn_in2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn_in1Layout.setVerticalGroup(
            pn_in1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_in2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_in1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lb_bienvenido)
                .addGap(38, 38, 38)
                .addComponent(lb_tituloFecha)
                .addGap(28, 28, 28)
                .addComponent(fecha)
                .addGap(39, 39, 39)
                .addComponent(lb_tituloHora)
                .addGap(33, 33, 33)
                .addComponent(hora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_in1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_in1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_subirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subirMouseClicked
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            
        }
    }//GEN-LAST:event_btn_subirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Lab9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Lab9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Lab9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Lab9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Lab9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_subir;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_archivo;
    private javax.swing.JLabel lb_archivoTitulo;
    private javax.swing.JLabel lb_bienvenido;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_tituloFecha;
    private javax.swing.JLabel lb_tituloHora;
    private javax.swing.JProgressBar pb_1;
    private javax.swing.JPanel pn_in1;
    private javax.swing.JPanel pn_in2;
    private javax.swing.JTextArea ta_archivo;
    // End of variables declaration//GEN-END:variables
}
