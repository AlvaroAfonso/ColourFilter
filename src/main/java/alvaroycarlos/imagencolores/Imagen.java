/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvaroycarlos.imagencolores;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
/**
 *
 * @author alvaroafonsolopez
 */
public class Imagen extends javax.swing.JFrame {

    /**
     * Creates new form Imagen
     */
    public Imagen() {
        initComponents();
        this.setTitle("Filtro de colores");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    boolean rojo = true;
    boolean verde = true;
    boolean azul = true;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        todosColores = new javax.swing.JCheckBox();
        verdeColor = new javax.swing.JCheckBox();
        rojoColor = new javax.swing.JCheckBox();
        azulColor = new javax.swing.JCheckBox();
        topLeft = new javax.swing.JRadioButton();
        lienzo1 = new alvaroycarlos.imagencolores.Lienzo();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bottomLeft = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        bottomRight = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        topRight = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        todosColores.setSelected(true);
        todosColores.setText("Todos los colores");
        todosColores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                todosColoresItemStateChanged(evt);
            }
        });

        verdeColor.setSelected(true);
        verdeColor.setText("Verde");
        verdeColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                verdeColorItemStateChanged(evt);
            }
        });

        rojoColor.setSelected(true);
        rojoColor.setText("Rojo");
        rojoColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rojoColorItemStateChanged(evt);
            }
        });

        azulColor.setSelected(true);
        azulColor.setText("Azul");
        azulColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                azulColorItemStateChanged(evt);
            }
        });

        buttonGroup1.add(topLeft);
        topLeft.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                topLeftItemStateChanged(evt);
            }
        });
        topLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftActionPerformed(evt);
            }
        });

        lienzo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jLabel2.setText("Izquierda arriba");

        jLabel1.setText("Izquierda abajo");

        buttonGroup1.add(bottomLeft);
        bottomLeft.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bottomLeftItemStateChanged(evt);
            }
        });

        jLabel3.setText("Derecha abajo");

        buttonGroup1.add(bottomRight);
        bottomRight.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bottomRightItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Filtros");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Logotipo");

        jLabel4.setText("Derecha arriba");

        buttonGroup1.add(topRight);
        topRight.setSelected(true);
        topRight.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                topRightItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bottomLeft)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(topLeft)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(topRight, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bottomRight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)))))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(verdeColor)
                                    .addComponent(todosColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(azulColor)
                                    .addComponent(rojoColor)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(topLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rojoColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(todosColores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottomLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottomRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verdeColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(azulColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topLeftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topLeftActionPerformed

    private void todosColoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_todosColoresItemStateChanged
        if(todosColores.isSelected() == true){
            rojoColor.setSelected(true);
            azulColor.setSelected(true);
            verdeColor.setSelected(true);
            
        }
        colores();
    }//GEN-LAST:event_todosColoresItemStateChanged

    private void rojoColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rojoColorItemStateChanged
        if(rojoColor.isSelected() == true){
            rojo = true;
            //System.out.println(rojo);
            
        }else{
            rojo = false;
            if(isPossible()){
                todosColores.setSelected(false);
            }else{
                rojo = true;
                rojoColor.setSelected(true);
            }
            
            //System.out.println(rojo);
        }
        colores();
    }//GEN-LAST:event_rojoColorItemStateChanged

    private void verdeColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_verdeColorItemStateChanged
        if(verdeColor.isSelected() == true){
            verde = true;
            //System.out.println(verde);
            
        }else{
            verde = false;
            if(isPossible()){
                todosColores.setSelected(false);
            }else{
                verde = true;
                verdeColor.setSelected(true);
            }
            
            //System.out.println(verde);
        }
        colores();
    }//GEN-LAST:event_verdeColorItemStateChanged

    private void azulColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_azulColorItemStateChanged
        if(azulColor.isSelected() == true){
            azul = true;
            //System.out.println(azul);
            
        }else{
            azul = false;
            if(isPossible()){
                todosColores.setSelected(false);
            }else{
                azul = true;
                azulColor.setSelected(true);
            }
            
            //System.out.println(azul);
        }
        colores();
    }//GEN-LAST:event_azulColorItemStateChanged

    private boolean isPossible(){
        if(azulColor.isSelected() == false && verdeColor.isSelected() == false && rojoColor.isSelected() == false) 
            return false;
        
        return true;
    }
    
    private void topLeftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_topLeftItemStateChanged
        if(topLeft.isSelected() == true){
             lienzo1.posicionLogo(1);
         }
    }//GEN-LAST:event_topLeftItemStateChanged

    private void topRightItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_topRightItemStateChanged
        if(topRight.isSelected() == true){
             lienzo1.posicionLogo(2);
         }
    }//GEN-LAST:event_topRightItemStateChanged

    private void bottomLeftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bottomLeftItemStateChanged
        if(bottomLeft.isSelected() == true){
             lienzo1.posicionLogo(3);
        } 
    }//GEN-LAST:event_bottomLeftItemStateChanged

    private void bottomRightItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bottomRightItemStateChanged
        if(bottomRight.isSelected() == true){
             lienzo1.posicionLogo(4);
         }
    }//GEN-LAST:event_bottomRightItemStateChanged

    private void colores(){
        lienzo1.almacenaColor(rojo,verde,azul);
    }
    
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
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox azulColor;
    private javax.swing.JRadioButton bottomLeft;
    private javax.swing.JRadioButton bottomRight;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private alvaroycarlos.imagencolores.Lienzo lienzo1;
    private javax.swing.JCheckBox rojoColor;
    private javax.swing.JCheckBox todosColores;
    private javax.swing.JRadioButton topLeft;
    private javax.swing.JRadioButton topRight;
    private javax.swing.JCheckBox verdeColor;
    // End of variables declaration//GEN-END:variables
}
