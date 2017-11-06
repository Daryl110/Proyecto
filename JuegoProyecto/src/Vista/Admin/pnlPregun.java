/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Admin;

import Controlador.CtlPregunta;
import Controlador.CtlTema;
import Controlador.Main;
import Modelo.Pregunta;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Daryl Ospina
 */
public class pnlPregun extends javax.swing.JPanel {

    private CtlTema controladorTema;
    private CtlPregunta controladorPregunta;
    private final JDialog padre;
    private int tipoPreg;
    private Pregunta preg;
    private final pnlPregUsus abuelo;

    /**
     * Creates new form pnlPregun
     */
    public pnlPregun(JDialog padre,JPanel abuelo) {
        initComponents();
        controladorPregunta = new CtlPregunta();
        controladorTema = new CtlTema();
        cbTema.setModel(controladorTema.listarCB());
        cbTipoPreg.setModel(controladorPregunta.listarTipoPregunta());
        this.padre = padre;
        lblTema.setVisible(false);
        cbTema.setVisible(false);
        pnlPrengunta.setVisible(false);
        lblEnunciado.setVisible(false);
        txtEnunciado.setVisible(false);
        opcionesVisibles(false);
        tipoPreg = cbTipoPreg.getSelectedIndex();
        padre.setSize(430, 140);
        this.abuelo = (pnlPregUsus)abuelo;
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
        pnlCB = new javax.swing.JPanel();
        lblTP = new javax.swing.JLabel();
        cbTipoPreg = new javax.swing.JComboBox<>();
        lblTema = new javax.swing.JLabel();
        cbTema = new javax.swing.JComboBox<>();
        pnlPrengunta = new javax.swing.JPanel();
        lblEnunciado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEnunciado = new javax.swing.JTextArea();
        pnlA = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        rbtnA = new javax.swing.JRadioButton();
        chA = new javax.swing.JCheckBox();
        lblA = new javax.swing.JLabel();
        pnlB = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtB = new javax.swing.JTextArea();
        rbtnB = new javax.swing.JRadioButton();
        chB = new javax.swing.JCheckBox();
        lblB = new javax.swing.JLabel();
        pnlC = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtC = new javax.swing.JTextArea();
        rbtnC = new javax.swing.JRadioButton();
        chC = new javax.swing.JCheckBox();
        lblC = new javax.swing.JLabel();
        pnlD = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtD = new javax.swing.JTextArea();
        rbtnD = new javax.swing.JRadioButton();
        chD = new javax.swing.JCheckBox();
        lblD = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 134, 150));

        pnlCB.setBackground(new java.awt.Color(0, 0, 29));
        pnlCB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblTP.setForeground(new java.awt.Color(255, 255, 255));
        lblTP.setText("TIPO DE PREGUNTA:");

        cbTipoPreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoPregActionPerformed(evt);
            }
        });

        lblTema.setForeground(new java.awt.Color(255, 255, 255));
        lblTema.setText("TEMA:");

        cbTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCBLayout = new javax.swing.GroupLayout(pnlCB);
        pnlCB.setLayout(pnlCBLayout);
        pnlCBLayout.setHorizontalGroup(
            pnlCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTP))
                .addGap(18, 18, 18)
                .addGroup(pnlCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCBLayout.createSequentialGroup()
                        .addComponent(lblTema)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCBLayout.setVerticalGroup(
            pnlCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTP)
                    .addComponent(lblTema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoPreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlPrengunta.setBackground(new java.awt.Color(0, 0, 29));
        pnlPrengunta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEnunciado.setForeground(new java.awt.Color(255, 255, 255));
        lblEnunciado.setText("ENUNCIADO:");

        txtEnunciado.setColumns(20);
        txtEnunciado.setRows(5);
        txtEnunciado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEnunciadoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtEnunciado);

        pnlA.setBackground(new java.awt.Color(0, 0, 29));

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane2.setViewportView(txtA);

        rbtnA.setBackground(new java.awt.Color(0, 0, 29));

        chA.setBackground(new java.awt.Color(0, 0, 29));

        lblA.setForeground(new java.awt.Color(255, 255, 255));
        lblA.setText("Opcion 1:");

        javax.swing.GroupLayout pnlALayout = new javax.swing.GroupLayout(pnlA);
        pnlA.setLayout(pnlALayout);
        pnlALayout.setHorizontalGroup(
            pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlALayout.createSequentialGroup()
                .addComponent(lblA)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlALayout.createSequentialGroup()
                .addComponent(chA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlALayout.setVerticalGroup(
            pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlALayout.createSequentialGroup()
                .addComponent(lblA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlALayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chA)
                            .addComponent(rbtnA))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlB.setBackground(new java.awt.Color(0, 0, 29));

        txtB.setColumns(20);
        txtB.setRows(5);
        jScrollPane3.setViewportView(txtB);

        rbtnB.setBackground(new java.awt.Color(0, 0, 29));

        chB.setBackground(new java.awt.Color(0, 0, 29));

        lblB.setForeground(new java.awt.Color(255, 255, 255));
        lblB.setText("Opcion 2:");

        javax.swing.GroupLayout pnlBLayout = new javax.swing.GroupLayout(pnlB);
        pnlB.setLayout(pnlBLayout);
        pnlBLayout.setHorizontalGroup(
            pnlBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBLayout.createSequentialGroup()
                .addComponent(chB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlBLayout.createSequentialGroup()
                .addComponent(lblB)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBLayout.setVerticalGroup(
            pnlBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBLayout.createSequentialGroup()
                .addComponent(lblB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chB)
                            .addComponent(rbtnB))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlC.setBackground(new java.awt.Color(0, 0, 29));

        txtC.setColumns(20);
        txtC.setRows(5);
        jScrollPane4.setViewportView(txtC);

        rbtnC.setBackground(new java.awt.Color(0, 0, 29));

        chC.setBackground(new java.awt.Color(0, 0, 29));

        lblC.setForeground(new java.awt.Color(255, 255, 255));
        lblC.setText("Opcion 3:");

        javax.swing.GroupLayout pnlCLayout = new javax.swing.GroupLayout(pnlC);
        pnlC.setLayout(pnlCLayout);
        pnlCLayout.setHorizontalGroup(
            pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLayout.createSequentialGroup()
                .addComponent(lblC)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlCLayout.createSequentialGroup()
                .addComponent(chC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCLayout.setVerticalGroup(
            pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLayout.createSequentialGroup()
                .addComponent(lblC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chC)
                            .addComponent(rbtnC))))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pnlD.setBackground(new java.awt.Color(0, 0, 29));

        txtD.setColumns(20);
        txtD.setRows(5);
        jScrollPane5.setViewportView(txtD);

        rbtnD.setBackground(new java.awt.Color(0, 0, 29));

        chD.setBackground(new java.awt.Color(0, 0, 29));

        lblD.setForeground(new java.awt.Color(255, 255, 255));
        lblD.setText("Opcion 4:");

        javax.swing.GroupLayout pnlDLayout = new javax.swing.GroupLayout(pnlD);
        pnlD.setLayout(pnlDLayout);
        pnlDLayout.setHorizontalGroup(
            pnlDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDLayout.createSequentialGroup()
                .addComponent(chD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDLayout.createSequentialGroup()
                .addComponent(lblD)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDLayout.setVerticalGroup(
            pnlDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDLayout.createSequentialGroup()
                .addComponent(lblD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chD)
                            .addComponent(rbtnD))))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        btnTerminar.setBackground(new java.awt.Color(75, 117, 137));
        btnTerminar.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(0, 0, 29));
        btnTerminar.setText("TERMINAR");
        btnTerminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrenguntaLayout = new javax.swing.GroupLayout(pnlPrengunta);
        pnlPrengunta.setLayout(pnlPrenguntaLayout);
        pnlPrenguntaLayout.setHorizontalGroup(
            pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrenguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlPrenguntaLayout.createSequentialGroup()
                        .addGroup(pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnunciado)
                            .addGroup(pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlPrenguntaLayout.createSequentialGroup()
                                    .addComponent(pnlC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pnlD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrenguntaLayout.createSequentialGroup()
                                    .addComponent(pnlA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pnlB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrenguntaLayout.setVerticalGroup(
            pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrenguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnunciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrenguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPrengunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrengunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoPregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoPregActionPerformed
        // TODO add your handling code here:
        tipoPreg = cbTipoPreg.getSelectedIndex();
        if (cbTipoPreg.getSelectedIndex() != 0) {
            lblTema.setVisible(true);
            cbTema.setVisible(true);
            padre.setSize(842, 140);
            pnlCB.updateUI();
            if (validarTema()) {
                validarEnunciado();
            }
        } else {
            lblTema.setVisible(false);
            cbTema.setVisible(false);
            lblEnunciado.setVisible(false);
            txtEnunciado.setVisible(false);
            pnlPrengunta.setVisible(false);
            opcionesVisibles(false);
            padre.setSize(430, 140);
            pnlCB.updateUI();
        }
        padre.setLocationRelativeTo(null);
    }//GEN-LAST:event_cbTipoPregActionPerformed

    private void cbTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTemaActionPerformed
        // TODO add your handling code here:
        if (validarTema()) {
            validarEnunciado();
        }
    }//GEN-LAST:event_cbTemaActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
        Main.mensaje(300, 30, "CREANDO PREGUNTA...", 3, "/Recursos/Imagenes/spinner-of-dots.png");
        boolean bool = controladorPregunta.registrarPregunta(
                Integer.parseInt(controladorPregunta.traerDato("tema", "idTema", "nombre", cbTema.getSelectedItem().toString()))
                , tipoPreg, txtEnunciado.getText().trim());
        if (chA.isVisible()) {
            controladorPregunta.añadirOpcion((chA.isSelected() ? 1 : 0), txtA.getText());
            controladorPregunta.añadirOpcion((chB.isSelected() ? 1 : 0), txtB.getText());
            controladorPregunta.añadirOpcion((chC.isSelected() ? 1 : 0), txtC.getText());
            controladorPregunta.añadirOpcion((chD.isSelected() ? 1 : 0), txtD.getText());
        }else{
            controladorPregunta.añadirOpcion((rbtnA.isSelected() ? 1 : 0), txtA.getText());
            controladorPregunta.añadirOpcion((rbtnB.isSelected() ? 1 : 0), txtB.getText());
            controladorPregunta.añadirOpcion((rbtnC.isSelected() ? 1 : 0), txtC.getText());
            controladorPregunta.añadirOpcion((rbtnD.isSelected() ? 1 : 0), txtD.getText());
        }
        if (bool) {
            Main.mensaje(300, 30, "PREGUNTA CREADA!!!...", 3, "/Recursos/Imagenes/Cuenta.png");
            padre.dispose();
            abuelo.listar();
        }else{
            Main.mensaje(300, 30, "NO SE HA PODIDO CREAR LA PREGUNTA!!!...", 3, "/Recursos/Imagenes/cancel.png");
        }
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void txtEnunciadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnunciadoKeyReleased
        // TODO add your handling code here:
        validarEnunciado();
    }//GEN-LAST:event_txtEnunciadoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox<String> cbTema;
    private javax.swing.JComboBox<String> cbTipoPreg;
    private javax.swing.JCheckBox chA;
    private javax.swing.JCheckBox chB;
    private javax.swing.JCheckBox chC;
    private javax.swing.JCheckBox chD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblTP;
    private javax.swing.JLabel lblTema;
    private javax.swing.JPanel pnlA;
    private javax.swing.JPanel pnlB;
    private javax.swing.JPanel pnlC;
    private javax.swing.JPanel pnlCB;
    private javax.swing.JPanel pnlD;
    private javax.swing.JPanel pnlPrengunta;
    private javax.swing.JRadioButton rbtnA;
    private javax.swing.JRadioButton rbtnB;
    private javax.swing.JRadioButton rbtnC;
    private javax.swing.JRadioButton rbtnD;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextArea txtB;
    private javax.swing.JTextArea txtC;
    private javax.swing.JTextArea txtD;
    private javax.swing.JTextArea txtEnunciado;
    // End of variables declaration//GEN-END:variables

    private void validarEnunciado() {
        if (txtEnunciado.getText().isEmpty()) {
            opcionesVisibles(false);
            validarTema();
        } else {
            opcionesVisibles(true);
        }
        padre.setLocationRelativeTo(null);
        actualizarOpciones();
    }
    private void actualizarOpciones(){
        pnlA.updateUI();
        pnlB.updateUI();
        pnlC.updateUI();
        pnlD.updateUI();
        pnlPrengunta.updateUI();
    }
    private void opcionesVisibles(boolean bool) {
        lblA.setVisible(bool);
        lblB.setVisible(bool);
        lblC.setVisible(bool);
        lblD.setVisible(bool);
        validarTP();
        txtA.setVisible(bool);
        txtB.setVisible(bool);
        txtC.setVisible(bool);
        txtD.setVisible(bool);
        pnlA.setVisible(bool);
        pnlB.setVisible(bool);
        pnlC.setVisible(bool);
        pnlD.setVisible(bool);
        btnTerminar.setVisible(bool);
        if (bool) {
            padre.setSize(1008, 670);
        }
    }

    private void validarTP() {
        switch (tipoPreg) {
            case 2:
                chA.setVisible(true);
                chB.setVisible(true);
                chC.setVisible(true);
                chD.setVisible(true);
                rbtnA.setVisible(false);
                rbtnB.setVisible(false);
                rbtnC.setVisible(false);
                rbtnD.setVisible(false);
                break;
            case 1:
                rbtnA.setVisible(true);
                rbtnB.setVisible(true);
                rbtnC.setVisible(true);
                rbtnD.setVisible(true);
                chA.setVisible(false);
                chB.setVisible(false);
                chC.setVisible(false);
                chD.setVisible(false);
                break;
            default:
                rbtnA.setVisible(false);
                rbtnB.setVisible(false);
                rbtnC.setVisible(false);
                rbtnD.setVisible(false);
                chA.setVisible(false);
                chB.setVisible(false);
                chC.setVisible(false);
                chD.setVisible(false);
                break;
        }
    }

    private boolean validarTema() {
        boolean bool = false;
        if (cbTema.getSelectedIndex() != 0) {
            pnlPrengunta.setVisible(true);
            lblEnunciado.setVisible(true);
            txtEnunciado.setVisible(true);
            padre.setSize(842, 300);
            bool = true;
        } else {
            pnlPrengunta.setVisible(false);
            lblEnunciado.setVisible(false);
            txtEnunciado.setVisible(false);
            padre.setSize(842, 140);
        }
        padre.setLocationRelativeTo(null);
        return bool;
    }
}
