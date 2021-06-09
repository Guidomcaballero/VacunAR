/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Vacunatorio.clases.*;
import Vacunatorio.dataClass.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guido Caballero
 */

public class VistaVacuna extends javax.swing.JInternalFrame {
    private LaboratorioData labData;
    private VacunaData vacData;
    private DefaultTableModel dtm;
    
    /**
     * Creates new form ViewVacuna
     */
    public VistaVacuna(VacunaData vd,LaboratorioData ld) {
        initComponents();
        cargaTablaCombo(vd,ld);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVac = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        comboLab = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);

        tableVac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro de Serie", "Laboratorio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableVac);
        if (tableVac.getColumnModel().getColumnCount() > 0) {
            tableVac.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Añadir, modificar o buscar vacunas.");

        jLabel2.setText("Número de serie");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        comboLab.setEnabled(false);

        jLabel3.setText("Seleccione el laboratorio.");

        checkEstado.setText("Disponible");
        checkEstado.setEnabled(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboLab, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkEstado))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(textNro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar))))
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(checkEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnLimpiar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int ns = 0,aux=0;
        Vacuna v = new Vacuna();
        try{
            ns = Integer.parseInt(textNro.getText());
        }catch(NumberFormatException ex){
            aux =1;
            JOptionPane.showMessageDialog(this,"El campo Numero de Serie solo permite numeros enteros");
        }
        if(aux==0){
            v = vacData.buscarVacuna(ns);
            if(v.getNroSerie()!= ns){
                JOptionPane.showMessageDialog(this,"El numero de serie se encuentra disponible para una nueva vacuna, por favor rellene los campos");
                textNro.setEditable(false);
                btnBuscar.setEnabled(false);
                checkEstado.setEnabled(true);
                comboLab.setEnabled(true);
                btnAceptar.setEnabled(true);
                btnLimpiar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "El numero de serie se encontró dentro de la base de datos, si desea puede modificar los datos presionando el boton Modificar.");
                v = vacData.buscarVacuna(ns);
                textNro.setEditable(false);
                btnBuscar.setEnabled(false);
                btnModificar.setEnabled(true);
                btnLimpiar.setEnabled(true);
                if(v.isEstado())
                    checkEstado.setSelected(true);
                comboLab.setSelectedItem(v.getLaboratorio());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        btnAceptar.setEnabled(true);
        comboLab.setEnabled(true);
        checkEstado.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int ns = 0;        
        Vacuna v = new Vacuna();
        ns = Integer.parseInt(textNro.getText());
        v = vacData.buscarVacuna(ns);
        if(checkEstado.isSelected())
            v.setEstado(true);
        else
            v.setEstado(false);
        Object l = comboLab.getSelectedItem();
        if(l instanceof Laboratorio && v.getNroSerie()!= ns){
            v.setNroSerie(ns);
            v.setLaboratorio((Laboratorio)l);
            vacData.ingresarVacuna(v);
            btnLimpiarActionPerformed(evt);
        }else{
            if(v.getNroSerie()== ns){
                v.setLaboratorio((Laboratorio)l);
                vacData.actualizarVacuna(v);
                btnLimpiarActionPerformed(evt);
            }else
                JOptionPane.showMessageDialog(this,"Debe seleccionar un laboratorio.");
        }
        this.cargaTablaCombo(vacData, labData);
    }//GEN-LAST:event_btnAceptarActionPerformed
//CONSULTAR SI EL ESTADO DE LA VACUNA DEPENDE ADEMAS DEL ESTADO DEL LABORATORIO
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        textNro.setEditable(true);
        btnBuscar.setEnabled(true);
        textNro.setText("");
        btnModificar.setEnabled(false);
        comboLab.setSelectedIndex(0);
        comboLab.setEnabled(false);
        checkEstado.setSelected(false);  
        checkEstado.setEnabled(false);
        btnAceptar.setEnabled(false);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cargaTablaCombo(VacunaData vd, LaboratorioData ld){
        this.vacData = vd;
        this.labData = ld;
        dtm = (DefaultTableModel) tableVac.getModel();
        dtm.setRowCount(0);
        for (Vacuna v : vd.obtenerVacunas()){
            if(v.isEstado()){
                String []row = new String[4];
                row[0] = v.getNroSerie()+"";
                row[1] = v.getLaboratorio().getNombre();
                row[2]= "Disponible";
                dtm.addRow(row);
                tableVac.setModel(dtm);
            }else{
                String []row = new String[4];
                row[0] = v.getNroSerie()+"";
                row[1] = v.getLaboratorio().getNombre();
                row[2]= "No disponible";
                dtm.addRow(row);
                tableVac.setModel(dtm);
            }
        } 
        Iterator<Laboratorio> itLab = ld.obtenerLaboratorios().iterator();
        comboLab.addItem(null);
        while(itLab.hasNext()){
            Laboratorio lab=itLab.next();
            //if(lab.isEstado())
                comboLab.addItem(lab);
        }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JComboBox<Laboratorio> comboLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVac;
    private javax.swing.JTextField textNro;
    // End of variables declaration//GEN-END:variables
}
