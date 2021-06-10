/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.dataClass.CitaData;
import Vacunatorio.dataClass.Conexion;
import Vacunatorio.dataClass.LaboratorioData;
import Vacunatorio.dataClass.PatologiaData;
import Vacunatorio.dataClass.PersonaData;
import Vacunatorio.dataClass.VacunaData;
import Vacunatorio.dataClass.VacunatorioData;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano.echevarne
 */
public class vistaEscritorio extends javax.swing.JFrame {
    private CitaData cd;
    private Conexion con;
    private LaboratorioData ld;
    private PersonaData pd;
    private VacunaData vd;
    private VacunatorioData vtod;
    private PatologiaData pada;
    /**
     * Creates new form escritorio
     */
    public vistaEscritorio() {
        initComponents();
        this.con=null;
        try {
            con = new Conexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"error de driver");
        }
        this.cd=new CitaData(con);
        this.ld=new LaboratorioData(con);
        this.pd=new PersonaData(con);
        this.vd=new VacunaData (con);
        this.vtod=new VacunatorioData(con);
        this.pada=new PatologiaData(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIngresos = new javax.swing.JMenu();
        jMenuItemIngresarPersona = new javax.swing.JMenuItem();
        jMenuPatologia = new javax.swing.JMenuItem();
        jMenuVacuna = new javax.swing.JMenuItem();
        jMenuSistema = new javax.swing.JMenu();
        jMenuProgramarCita = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        jMenuIngresos.setText("ABM");

        jMenuItemIngresarPersona.setText("A.B.M. Persona");
        jMenuItemIngresarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresarPersonaActionPerformed(evt);
            }
        });
        jMenuIngresos.add(jMenuItemIngresarPersona);

        jMenuPatologia.setText("A.B.M. Patologia");
        jMenuPatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPatologiaActionPerformed(evt);
            }
        });
        jMenuIngresos.add(jMenuPatologia);

        jMenuVacuna.setText("A.B.M. Vacuna");
        jMenuVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVacunaActionPerformed(evt);
            }
        });
        jMenuIngresos.add(jMenuVacuna);

        jMenuBar1.add(jMenuIngresos);

        jMenuSistema.setText("Sistema");

        jMenuProgramarCita.setText("Programar cita");
        jMenuProgramarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProgramarCitaActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuProgramarCita);

        jMenuBar1.add(jMenuSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemIngresarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresarPersonaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        vistaIngresarPersona view = new vistaIngresarPersona(pd,pada);
        jEscritorio.add(view);
        view.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemIngresarPersonaActionPerformed

    private void jMenuPatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPatologiaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        vistaPatologiaABM view = new vistaPatologiaABM (pada);
        jEscritorio.add(view);
        view.setVisible(true);        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuPatologiaActionPerformed

    private void jMenuProgramarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProgramarCitaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        vistaProgramarCita view = new vistaProgramarCita (pd,vtod,cd);
        jEscritorio.add(view);
        view.setVisible(true);    
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuProgramarCitaActionPerformed

    private void jMenuVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVacunaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaVacuna view = new VistaVacuna(vd,ld);
        jEscritorio.add(view);
        view.setVisible(true);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuVacunaActionPerformed

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
            java.util.logging.Logger.getLogger(vistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIngresos;
    private javax.swing.JMenuItem jMenuItemIngresarPersona;
    private javax.swing.JMenuItem jMenuPatologia;
    private javax.swing.JMenuItem jMenuProgramarCita;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JMenuItem jMenuVacuna;
    // End of variables declaration//GEN-END:variables
}
