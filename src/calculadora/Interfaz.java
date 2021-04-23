/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;
import calculadora.Calculos;

/**
 *
 * @author alexi
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }
    
    Calculos cal = new Calculos();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnSuma = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BtnPotencia = new javax.swing.JButton();
        BtnRaiz = new javax.swing.JButton();
        BtnAleatorio = new javax.swing.JButton();
        BtnSumatoriaEntre2Numeros = new javax.swing.JButton();
        BtnFibonacci = new javax.swing.JButton();
        BtnSerie = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TxtResultados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(43, 60, 79));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSuma.setBackground(new java.awt.Color(50, 102, 81));
        BtnSuma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnSuma.setText("Suma de 2 reales");
        BtnSuma.setName(""); // NOI18N
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 170, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 400));

        BtnPotencia.setBackground(new java.awt.Color(50, 102, 81));
        BtnPotencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnPotencia.setText("Potencia Número Real");
        BtnPotencia.setName(""); // NOI18N
        BtnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 170, 30));

        BtnRaiz.setBackground(new java.awt.Color(50, 102, 81));
        BtnRaiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnRaiz.setText("Raiz Cuadrada");
        BtnRaiz.setName(""); // NOI18N
        BtnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRaizActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, 30));

        BtnAleatorio.setBackground(new java.awt.Color(50, 102, 81));
        BtnAleatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAleatorio.setText("Aleatorio entre 2 Números");
        BtnAleatorio.setName(""); // NOI18N
        BtnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAleatorioActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 210, 30));

        BtnSumatoriaEntre2Numeros.setBackground(new java.awt.Color(50, 102, 81));
        BtnSumatoriaEntre2Numeros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnSumatoriaEntre2Numeros.setText("Sumatoria real entre 2 números");
        BtnSumatoriaEntre2Numeros.setName(""); // NOI18N
        BtnSumatoriaEntre2Numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumatoriaEntre2NumerosActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSumatoriaEntre2Numeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 230, 30));

        BtnFibonacci.setBackground(new java.awt.Color(50, 102, 81));
        BtnFibonacci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnFibonacci.setText("Fibonacci entre 2 números");
        BtnFibonacci.setName(""); // NOI18N
        BtnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFibonacci, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 210, 30));

        BtnSerie.setBackground(new java.awt.Color(50, 102, 81));
        BtnSerie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnSerie.setText("Serie Hasta número n");
        BtnSerie.setName(""); // NOI18N
        jPanel1.add(BtnSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 620, 230));

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        TxtResultados.setEditable(false);
        TxtResultados.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 48)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 615, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor real"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese otro valor real"));
        int res = cal.sumar(num1, num2);
        TxtResultados.setText(""+res);
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRaizActionPerformed
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor real"));
        double res = cal.raiz(num1);
        TxtResultados.setText(""+res);
    }//GEN-LAST:event_BtnRaizActionPerformed

    private void BtnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPotenciaActionPerformed
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese potencia"));
        double res = cal.potencia(num1,num2);
        TxtResultados.setText(""+res);
    }//GEN-LAST:event_BtnPotenciaActionPerformed

    private void BtnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAleatorioActionPerformed
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese otro valor"));
        double res = cal.aleatorio(num1,num2);
        TxtResultados.setText(""+res);
    }//GEN-LAST:event_BtnAleatorioActionPerformed

    private void BtnSumatoriaEntre2NumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumatoriaEntre2NumerosActionPerformed
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor inicial"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor tope de la sumatoria"));
        int res = cal.sumatoria(num1,num2);
        TxtResultados.setText(""+res);
    }//GEN-LAST:event_BtnSumatoriaEntre2NumerosActionPerformed

    private void BtnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciActionPerformed
        int n;     
        do {
             n = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el " + 
                "índice del término de Fibonacci [>= 0]: "));
            if(n < 0) {
                JOptionPane.showMessageDialog( null, n + " es un " + 
                    "índice inválido" ) ;
            }
        } while(n < 0);
        
        int res = cal.fibonacci(n);
        TxtResultados.setText(""+res);
    }//GEN-LAST:event_BtnFibonacciActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAleatorio;
    private javax.swing.JButton BtnFibonacci;
    private javax.swing.JButton BtnPotencia;
    private javax.swing.JButton BtnRaiz;
    private javax.swing.JButton BtnSerie;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnSumatoriaEntre2Numeros;
    private javax.swing.JTextField TxtResultados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
