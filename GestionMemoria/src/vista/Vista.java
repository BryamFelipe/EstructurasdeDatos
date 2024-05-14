/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controlador;

/**
 *
 * @author DavidSJ
 */
public class Vista extends javax.swing.JFrame {
    private Controlador controlador;
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTF_Variable = new javax.swing.JTextField();
        JTF_TamanoVariable = new javax.swing.JTextField();
        JB_IngresarVariable = new javax.swing.JButton();
        JB_AgregarAmbitos = new javax.swing.JButton();
        JL_MostrarMensajeVariable = new javax.swing.JLabel();
        JL_MostrarMensajeTamano = new javax.swing.JLabel();
        JB_EliminarAmbito = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_Mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTF_Variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_VariableActionPerformed(evt);
            }
        });

        JTF_TamanoVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_TamanoVariableActionPerformed(evt);
            }
        });

        JB_IngresarVariable.setText("Ingresar Variable");
        JB_IngresarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IngresarVariableActionPerformed(evt);
            }
        });

        JB_AgregarAmbitos.setText("Entrar Al Ambito");
        JB_AgregarAmbitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarAmbitosActionPerformed(evt);
            }
        });

        JL_MostrarMensajeVariable.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        JL_MostrarMensajeVariable.setText("Ingresar Variable:");
        JL_MostrarMensajeVariable.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_MostrarMensajeVariable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JL_MostrarMensajeTamano.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        JL_MostrarMensajeTamano.setText("Ingresar Tamaño De La Variable:");
        JL_MostrarMensajeTamano.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_MostrarMensajeTamano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JB_EliminarAmbito.setText("Limpiar Memoria");
        JB_EliminarAmbito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EliminarAmbitoActionPerformed(evt);
            }
        });

        JL_Mostrar.setColumns(20);
        JL_Mostrar.setRows(5);
        jScrollPane1.setViewportView(JL_Mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_TamanoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_MostrarMensajeVariable)
                                .addGap(18, 18, 18)
                                .addComponent(JTF_Variable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JL_MostrarMensajeTamano))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_AgregarAmbitos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_EliminarAmbito, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_IngresarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_MostrarMensajeVariable)
                    .addComponent(JTF_Variable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_IngresarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(JB_EliminarAmbito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_MostrarMensajeTamano)
                    .addComponent(JB_AgregarAmbitos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(JTF_TamanoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_VariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_VariableActionPerformed

    }//GEN-LAST:event_JTF_VariableActionPerformed

    private void JTF_TamanoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_TamanoVariableActionPerformed

    }//GEN-LAST:event_JTF_TamanoVariableActionPerformed

    private void JB_IngresarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IngresarVariableActionPerformed
        
    }//GEN-LAST:event_JB_IngresarVariableActionPerformed

    private void JB_AgregarAmbitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarAmbitosActionPerformed
        
    }//GEN-LAST:event_JB_AgregarAmbitosActionPerformed

    private void JB_EliminarAmbitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EliminarAmbitoActionPerformed
        
    }//GEN-LAST:event_JB_EliminarAmbitoActionPerformed
    
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_AgregarAmbitos;
    public javax.swing.JButton JB_EliminarAmbito;
    public javax.swing.JButton JB_IngresarVariable;
    public javax.swing.JTextArea JL_Mostrar;
    private javax.swing.JLabel JL_MostrarMensajeTamano;
    private javax.swing.JLabel JL_MostrarMensajeVariable;
    public javax.swing.JTextField JTF_TamanoVariable;
    public javax.swing.JTextField JTF_Variable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
