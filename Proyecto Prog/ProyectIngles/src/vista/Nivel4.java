/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Bryam
 */
public class Nivel4 extends javax.swing.JFrame {

    String[]preguntas = {
        "¿Como se dice manzana?",
        "¿Como se dice balon?",
        "¿Como se dice niño?",
        "¿Como se dice agua?",
        "¿Como se dice cielo?",
    };
    
    String[][]opciones = {
        {"Apple", "Pineapple", "Strawberry", "Orange"},
        {"Balloon", "Ball", "Globe", "Sphere"},
        {"She", "Children", "Kid", "Guy"},
        {"Sea", "Rain", "Cold", "Water"},
        {"Sky", "Heaven", "Puta", "Water"},
    };
    
    char[]respuestas = {
        'A',
        'B',
        'C',
        'D',
        'A',
    };
    
    char adivina;
    char respuesta;
    int index;
    int correctas = 0;
    int total_Preguntas = preguntas.length;
    int resultado;
    int segundos = 12;
    
    Timer timer = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            segundos--;
            JL_seg.setText(String.valueOf(segundos));
            if(segundos <=0){
                verRespuesta();
            }
        }
    });
    public Nivel4() {
        initComponents();
        siguientePregunta();
    }

    private void verRespuesta(){
        timer.stop();
        JB_opc1.setEnabled(false);
        JB_opc2.setEnabled(false);
        JB_opc3.setEnabled(false);
        JB_opc4.setEnabled(false);
        
        if(respuestas[index]!= 'A'){
            JB_opc1.setBackground(Color.RED);
        }
        if(respuestas[index]!= 'B'){
            JB_opc2.setBackground(Color.RED);
        }
        if(respuestas[index]!= 'C'){
            JB_opc3.setBackground(Color.RED);
        }
        if(respuestas[index]!= 'D'){
            JB_opc4.setForeground(Color.RED);
        }
        
        Timer pause = new Timer(2000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JB_opc1.setBackground(Color.WHITE);
                JB_opc2.setBackground(Color.WHITE);
                JB_opc3.setBackground(Color.WHITE);
                JB_opc4.setBackground(Color.WHITE);
                
                respuesta = ' ';
                segundos = 12;
                JL_seg.setText(String.valueOf(segundos));
                JB_opc1.setEnabled(true);
                JB_opc2.setEnabled(true);
                JB_opc3.setEnabled(true);
                JB_opc4.setEnabled(true);
                index++;
                siguientePregunta();
            }
        });
        
        pause.setRepeats(false);
        pause.start();
    }
    
    public void resultadoFinal(){
        
        JB_opc1.setEnabled(false);
        JB_opc2.setEnabled(false);
        JB_opc3.setEnabled(false);
        JB_opc4.setEnabled(false);
        
        resultado = (int)((correctas / (double)total_Preguntas)*100);
        JL_imagen.setText("");
        JB_opc1.setText("");
        JB_opc2.setText("");
        JB_opc3.setText("");
        JB_opc4.setText("");
        
        JL_buenas.setText("Correctas\n"+"("+ correctas + "/" + total_Preguntas + ")");
        JL_porc.setText("Porcentaje\n" + resultado + "%");
        JL_seg.setVisible(false);
    }
    
    private void siguientePregunta(){
        if(index >= total_Preguntas){
            resultadoFinal();
        }else{
            JL_imagen.setText(preguntas[index]);
            JB_opc1.setText(opciones[index][0]);
            JB_opc2.setText(opciones[index][1]);
            JB_opc3.setText(opciones[index][2]);
            JB_opc4.setText(opciones[index][3]);
            timer.start();
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JB_opc4 = new javax.swing.JButton();
        JB_opc3 = new javax.swing.JButton();
        JB_opc2 = new javax.swing.JButton();
        JB_opc1 = new javax.swing.JButton();
        JL_seg = new javax.swing.JLabel();
        JL_buenas = new javax.swing.JLabel();
        JL_porc = new javax.swing.JLabel();
        JL_imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_opc4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JB_opc4.setText("Opcion 4");
        JB_opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_opc4ActionPerformed(evt);
            }
        });
        jPanel1.add(JB_opc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 560, -1));

        JB_opc3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JB_opc3.setText("Opcion 3");
        JB_opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_opc3ActionPerformed(evt);
            }
        });
        jPanel1.add(JB_opc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 560, -1));

        JB_opc2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JB_opc2.setText("Opcion 2");
        JB_opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_opc2ActionPerformed(evt);
            }
        });
        jPanel1.add(JB_opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 560, -1));

        JB_opc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JB_opc1.setText("Opcion 1");
        JB_opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_opc1ActionPerformed(evt);
            }
        });
        jPanel1.add(JB_opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 560, -1));

        JL_seg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL_seg.setText("Segundos");
        jPanel1.add(JL_seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 90, 30));

        JL_buenas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL_buenas.setText("Buenas");
        jPanel1.add(JL_buenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        JL_porc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL_porc.setText("Porcentaje");
        jPanel1.add(JL_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        JL_imagen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_imagen.setText("Imagen de Pregunta");
        jPanel1.add(JL_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 560, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo nivel 3.jpeg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_opc4ActionPerformed
        JB_opc1.setEnabled(false);
        JB_opc2.setEnabled(false);
        JB_opc3.setEnabled(false);
        JB_opc4.setEnabled(false);

        if(evt.getSource() == JB_opc4){
            respuesta = 'D';
            if(respuesta == respuestas[index]){
                correctas++;
            }
        }
        verRespuesta();
    }//GEN-LAST:event_JB_opc4ActionPerformed

    private void JB_opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_opc3ActionPerformed
        JB_opc1.setEnabled(false);
        JB_opc2.setEnabled(false);
        JB_opc3.setEnabled(false);
        JB_opc4.setEnabled(false);

        if(evt.getSource() == JB_opc3){
            respuesta = 'C';
            if(respuesta == respuestas[index]){
                correctas++;
            }
        }
        verRespuesta();
    }//GEN-LAST:event_JB_opc3ActionPerformed

    private void JB_opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_opc2ActionPerformed
        JB_opc1.setEnabled(false);
        JB_opc2.setEnabled(false);
        JB_opc3.setEnabled(false);
        JB_opc4.setEnabled(false);

        if(evt.getSource() == JB_opc2){
            respuesta = 'B';
            if(respuesta == respuestas[index]){
                correctas++;
            }
        }
        verRespuesta();
    }//GEN-LAST:event_JB_opc2ActionPerformed

    private void JB_opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_opc1ActionPerformed
        JB_opc1.setEnabled(false);
        JB_opc2.setEnabled(false);
        JB_opc3.setEnabled(false);
        JB_opc4.setEnabled(false);

        if(evt.getSource() == JB_opc1){
            respuesta = 'A';
            if(respuesta == respuestas[index]){
                correctas++;
            }
        }
        verRespuesta();
    }//GEN-LAST:event_JB_opc1ActionPerformed

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
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_opc1;
    public javax.swing.JButton JB_opc2;
    public javax.swing.JButton JB_opc3;
    public javax.swing.JButton JB_opc4;
    public javax.swing.JLabel JL_buenas;
    public javax.swing.JLabel JL_imagen;
    public javax.swing.JLabel JL_porc;
    public javax.swing.JLabel JL_seg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
