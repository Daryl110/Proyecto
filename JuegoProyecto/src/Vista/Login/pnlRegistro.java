/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Login;

import Controlador.Main;
import static Controlador.Main.controUsuario;
import Modelo.Usuario;
import Vista.Admin.pnlPregUsus;
import Vista.FrmCrearJuego;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Daryl Ospina
 */
public class pnlRegistro extends javax.swing.JPanel {

    private Usuario usu;
    private boolean modificador = false;
    private JDialog padre;
    private pnlPregUsus abuelo;

    /**
     * Creates new form pnlRegistro
     */
    public pnlRegistro() {
        initComponents();
        ocultarAsteriscos();
        cbPreguntaS.setModel(Main.controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
        if (FrmCrearJuego.ventanaJuego != null) {
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
    }

    public pnlRegistro(boolean modificador, JDialog padre, JPanel abuelo) {
        initComponents();
        ocultarAsteriscos();
        cbPreguntaS.setModel(Main.controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
        if (FrmCrearJuego.ventanaJuego != null) {
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
        if (modificador) {
            lblIniciarSesion.setVisible(!modificador);
            this.modificador = modificador;
            this.padre = padre;
            this.abuelo = (pnlPregUsus) abuelo;
        }
    }

    public pnlRegistro(Usuario usu, boolean modificador, JDialog padre, JPanel abuelo) throws NullPointerException {
        initComponents();
        ocultarAsteriscos();
        cbPreguntaS.setModel(Main.controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
        if (FrmCrearJuego.ventanaJuego != null) {
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
        if (modificador) {
            lblIniciarSesion.setVisible(!modificador);
            this.modificador = modificador;
            this.padre = padre;
            this.abuelo = (pnlPregUsus) abuelo;
            lblIniciarSesion.setVisible(false);
            btnCrearUsu.setText("Modificar Cuenta");
            cambiarCampos(usu);
        }
    }

    public pnlRegistro(Usuario usu) {
        initComponents();
        ocultarAsteriscos();
        cbPreguntaS.setModel(Main.controUsuario.solicitarListarEnCB("preguntaUsuario", "enunciado"));
        if (FrmCrearJuego.ventanaJuego != null) {
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
        lblIniciarSesion.setVisible(false);
        btnCrearUsu.setText("Modificar Cuenta");
        cambiarCampos(usu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIniciarSesion = new javax.swing.JLabel();
        btnCrearUsu = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNombreUsu = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbPreguntaS = new javax.swing.JComboBox<>();
        txtRespuesta = new javax.swing.JTextField();
        spnSemestre = new javax.swing.JSpinner();
        lblSemestre = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        lblCedula = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblPreguntaS = new javax.swing.JLabel();
        lblRespuestaS = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblCampos = new javax.swing.JLabel();
        lblObligatorios = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 29));
        setPreferredSize(new java.awt.Dimension(260, 592));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(51, 153, 255));
        lblIniciarSesion.setText("Iniciar Sesión");
        lblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarAIniciarSesion(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarColor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cambiarColor1(evt);
            }
        });
        add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 541, -1, -1));

        btnCrearUsu.setBackground(new java.awt.Color(51, 51, 51));
        btnCrearUsu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCrearUsu.setForeground(new java.awt.Color(204, 204, 204));
        btnCrearUsu.setText("Crear Cuenta");
        btnCrearUsu.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))));
        btnCrearUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuActionPerformed(evt);
            }
        });
        add(btnCrearUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 481, 256, 42));

        txtCedula.setBackground(new java.awt.Color(51, 51, 51));
        txtCedula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(204, 204, 204));
        txtCedula.setText("Cedula");
        txtCedula.setToolTipText("Cedula");
        txtCedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarCedula(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerCedula(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 26, 256, 25));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Nombre");
        txtNombre.setToolTipText("Nombre");
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarNombre(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerNombre(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 71, 256, 25));

        txtNombreUsu.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreUsu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNombreUsu.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreUsu.setText("Nombre de usuario");
        txtNombreUsu.setToolTipText("Nombre de usuario");
        txtNombreUsu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarNombreUsu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerNombreUsu(evt);
            }
        });
        txtNombreUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUsuKeyReleased(evt);
            }
        });
        add(txtNombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 116, 256, 25));

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("E-Mail");
        txtCorreo.setToolTipText("E-Mail");
        txtCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarCorreo(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerCorreo(evt);
            }
        });
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 206, 256, 25));

        txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono.setText("Telefono");
        txtTelefono.setToolTipText("Telefono");
        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarTelefono(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerTelefono(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 251, 256, 25));

        cbPreguntaS.setBackground(new java.awt.Color(51, 51, 51));
        cbPreguntaS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbPreguntaS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una pregunta de seguridad" }));
        cbPreguntaS.setToolTipText("Seleccione una pregunta de seguridad");
        cbPreguntaS.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51))));
        cbPreguntaS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPreguntaS.setNextFocusableComponent(txtRespuesta);
        cbPreguntaS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cambiarBorde(evt);
            }
        });
        add(cbPreguntaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 330, 256, 25));

        txtRespuesta.setBackground(new java.awt.Color(51, 51, 51));
        txtRespuesta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(204, 204, 204));
        txtRespuesta.setText("Respuesta de seguridad");
        txtRespuesta.setToolTipText("Respuesta de seguridad");
        txtRespuesta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarRespuesta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerRespuesta(evt);
            }
        });
        add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 375, 256, 25));

        spnSemestre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        spnSemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        spnSemestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        add(spnSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 296, 56, -1));

        lblSemestre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSemestre.setForeground(new java.awt.Color(255, 255, 255));
        lblSemestre.setText("Semestre:");
        add(lblSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 296, -1, -1));

        txtContrasena.setBackground(new java.awt.Color(51, 51, 51));
        txtContrasena.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasena.setText("Contraseña");
        txtContrasena.setToolTipText("Contraseña");
        txtContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                borrarCon(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ponerCon(evt);
            }
        });
        add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 161, 256, 25));

        lblCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 17, 25));

        lblNombreUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 116, 17, 25));

        lblContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 160, 20, 30));

        lblPreguntaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblPreguntaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 330, 17, 25));

        lblRespuestaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblRespuestaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 375, 17, 25));

        lblNota.setForeground(new java.awt.Color(255, 0, 0));
        lblNota.setText("Nota:");
        add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 418, -1, -1));

        lblCampos.setForeground(new java.awt.Color(255, 255, 255));
        lblCampos.setText("Los Campos con asteriscos");
        add(lblCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 418, -1, -1));

        lblObligatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblObligatorios.setText("son Obligatorios.");
        add(lblObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 438, -1, -1));

        lblCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/bloggif_59e7c9eb160c7.png"))); // NOI18N
        add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 205, 20, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarAIniciarSesion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarAIniciarSesion
        // TODO add your handling code here:
        abrirIniciarSesion();
    }//GEN-LAST:event_cambiarAIniciarSesion

    private void cambiarColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColor
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, Color.yellow);
        if (Main.ventanaPrincipal.isActive()) {
            Main.ventanaPrincipal.cambiarCursor(12);
        } else {
            FrmCrearJuego.ventanaJuego.cambiarCursor(12);
        }
    }//GEN-LAST:event_cambiarColor

    private void cambiarColor1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarColor1
        // TODO add your handling code here:
        Main.ventanaPrincipal.cambiarColor(lblIniciarSesion, new Color(51, 153, 255));
        if (Main.ventanaPrincipal.isActive()) {
            Main.ventanaPrincipal.cambiarCursor(0);
        } else {
            FrmCrearJuego.ventanaJuego.cambiarCursor(0);
        }
    }//GEN-LAST:event_cambiarColor1

    private void borrarCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCedula
        // TODO add your handling code here:
        if (txtCedula.getText().trim().isEmpty() || txtCedula.getText().trim().equalsIgnoreCase("cedula")) {
            Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.WHITE);
            if (!txtCedula.getText().equalsIgnoreCase("cedula") && !txtCedula.getText().equalsIgnoreCase("")) {
                if (validarCedula()) {
                    if (txtCedula.getText().isEmpty() || txtCedula.getText().equalsIgnoreCase("cedula")) {
                        Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.WHITE);
                    } else {
                        EtchedBorder borde = new EtchedBorder(1);
                        txtCedula.setBorder(borde);
                    }
                }
            }
            lblCedula.setVisible(false);
            notaVisible(false);
        }
    }//GEN-LAST:event_borrarCedula

    private void ponerCedula(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerCedula
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Cedula", txtCedula, Color.LIGHT_GRAY);
        if (txtCedula.getText().trim().equalsIgnoreCase("cedula") || txtCedula.getText().isEmpty() || validarCedula()) {
            lblCedula.setVisible(false);
            txtCedula.setBorder(new EtchedBorder(1));
            notaVisible(false);
        }
    }//GEN-LAST:event_ponerCedula

    private void borrarNombre(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarNombre
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre", txtNombre, Color.WHITE);
    }//GEN-LAST:event_borrarNombre

    private void ponerNombre(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerNombre
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre", txtNombre, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerNombre

    private void borrarNombreUsu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarNombreUsu
        // TODO add your handling code here:
        if (txtNombreUsu.getText().trim().isEmpty() || txtNombreUsu.getText().trim().equalsIgnoreCase("nombre de usuario")) {
            Main.ventanaPrincipal.vaciarCampo("Nombre de usuario", txtNombreUsu, Color.WHITE);
        } else {
            EtchedBorder borde = new EtchedBorder(1);
            txtNombreUsu.setBorder(borde);
        }
        lblNombreUsuario.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarNombreUsu

    private void ponerNombreUsu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerNombreUsu
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Nombre de usuario", txtNombreUsu, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerNombreUsu

    private void borrarCon(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCon
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Contraseña", txtContrasena, Color.WHITE);
        lblContrasena.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarCon

    private void ponerCon(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerCon
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Contraseña", txtContrasena, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerCon

    private void borrarCorreo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarCorreo
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("E-Mail", txtCorreo, Color.WHITE);
    }//GEN-LAST:event_borrarCorreo

    private void ponerCorreo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerCorreo
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("E-Mail", txtCorreo, Color.LIGHT_GRAY);
        if (validarEmail(txtCorreo.getText().trim())) {
            lblCorreo.setVisible(true);
            txtCorreo.setBorder(new LineBorder(Color.red));
            cambiarNota("El E-mail que ha introducido", "no es valido");
            notaVisible(true);
        } else {
            lblCorreo.setVisible(false);
            txtCorreo.setBorder(new EtchedBorder(1));
            notaVisible(false);
        }
    }//GEN-LAST:event_ponerCorreo

    private void borrarTelefono(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarTelefono
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Telefono", txtTelefono, Color.WHITE);
    }//GEN-LAST:event_borrarTelefono

    private void ponerTelefono(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerTelefono
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Telefono", txtTelefono, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerTelefono

    private void borrarRespuesta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_borrarRespuesta
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Respuesta de seguridad", txtRespuesta, Color.WHITE);
        lblRespuestaS.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_borrarRespuesta

    private void ponerRespuesta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ponerRespuesta
        // TODO add your handling code here:
        Main.ventanaPrincipal.vaciarCampo("Respuesta de seguridad", txtRespuesta, Color.LIGHT_GRAY);
    }//GEN-LAST:event_ponerRespuesta

    private void btnCrearUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            if (!validarEmail(txtCorreo.getText().trim())) {
                if (validarCedula()) {
                    if (usu == null) {
                        //Accion De Crear Usuario
                        Main.mensaje(300, 30, "CREANDO CUENTA....", 3, "/Recursos/Imagenes/spinner-of-dots.png");
                        if (!controUsuario.validarCampoUsuario(txtCedula.getText().trim(), "cedula", "usuario")) {
                            if (!controUsuario.validarCampoUsuario(txtNombreUsu.getText().trim(), "nombreUsu", "usuario")) {
                                if (controUsuario.solicitudRegistro(Integer.parseInt(txtCedula.getText().trim()),
                                        cbPreguntaS.getSelectedIndex(), Integer.parseInt(spnSemestre.getValue() + ""),
                                        validarEspaciosNoRequeridos(txtNombre.getText().trim()), txtNombreUsu.getText().trim(),
                                        txtContrasena.getText().trim(), validarEspaciosNoRequeridos(txtCorreo.getText().trim()),
                                        validarEspaciosNoRequeridos(txtTelefono.getText().trim()), txtRespuesta.getText().trim())) {
                                    Main.mensaje(300, 30, "!SE HA CREADO LA CUENTA EXITOSAMENTE!", 2, "/Recursos/Imagenes/Cuenta.png");
                                    if (modificador) {
                                        padre.dispose();
                                        abuelo.listar();
                                    } else {
                                        abrirIniciarSesion();
                                    }
                                } else {
                                    Main.mensaje(300, 30, "!ERROR CREANDO CUENTA!", 2, "/Recursos/Imagenes/cancel.png");
                                }
                            } else {
                                Main.mensaje(300, 30, "!EL NOMBRE DE USUARIO YA EXISTE!", 2, "/Recursos/Imagenes/cancel.png");
                                txtNombreUsu.setBorder(new LineBorder(Color.red));
                                lblNombreUsuario.setVisible(true);
                            }
                        } else {
                            Main.mensaje(300, 30, "!LA CEDULA YA EXISTE!", 2, "/Recursos/Imagenes/cancel.png");
                            txtCedula.setBorder(new LineBorder(Color.red));
                            lblCedula.setVisible(true);
                        }
                    } else {
                        //Modificar
                        Main.mensaje(300, 30, "MODIFICANDO CUENTA....", 3, "/Recursos/Imagenes/spinner-of-dots.png");
                        if (controUsuario.solicitudModificar(Integer.parseInt(txtCedula.getText().trim()),
                                cbPreguntaS.getSelectedIndex(), Integer.parseInt(spnSemestre.getValue() + ""),
                                validarEspaciosNoRequeridos(txtNombre.getText().trim()), txtNombreUsu.getText().trim(),
                                txtContrasena.getText().trim(), validarEspaciosNoRequeridos(txtCorreo.getText().trim()),
                                validarEspaciosNoRequeridos(txtTelefono.getText().trim()), txtRespuesta.getText().trim())) {
                            Main.mensaje(300, 30, "!SE HA MODIFICADO LA CUENTA EXITOSAMENTE!", 2, "/Recursos/Imagenes/Cuenta.png");
                            if (modificador) {
                                padre.dispose();
                                abuelo.listar();
                            }
                        } else {
                            Main.mensaje(300, 30, "!ERROR MODIFICANDO CUENTA!", 2, "/Recursos/Imagenes/cancel.png");
                        }
                    }
                }
            } else {
                lblCorreo.setVisible(true);
                txtCorreo.setBorder(new LineBorder(Color.red));
                cambiarNota("El E-mail que ha introducido", "no es valido");
                notaVisible(true);
            }
        }
    }//GEN-LAST:event_btnCrearUsuActionPerformed

    private void cambiarBorde(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cambiarBorde
        // TODO add your handling code here:
        cbPreguntaS.setBorder(new CompoundBorder(new LineBorder(new Color(51, 51, 51)), new EtchedBorder(1)));
        lblPreguntaS.setVisible(false);
        notaVisible(false);
    }//GEN-LAST:event_cambiarBorde

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        validarTeclado(evt);
        if (txtCedula.getText().length() >= 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        validarTeclado(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        // TODO add your handling code here:
        if (txtCedula.getText().length() < 10) {
            validarCedula();
        } else {
            validarCampo(lblCedula, txtCedula, "cedula", "La cedula que ha ingresado", "ya esta registrada.");
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtNombreUsuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuKeyReleased
        // TODO add your handling code here:
        validarCampo(lblNombreUsuario, txtNombreUsu, "nombreUsu", "El nombre de usuario que ha", "ingresado ya esta registrado.");
    }//GEN-LAST:event_txtNombreUsuKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsu;
    private javax.swing.JComboBox<String> cbPreguntaS;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblObligatorios;
    private javax.swing.JLabel lblPreguntaS;
    private javax.swing.JLabel lblRespuestaS;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JSpinner spnSemestre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsu;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    //Validar Cedula
    private boolean validarCedula() {
        if (txtCedula.getText().trim().equalsIgnoreCase("cedula") || txtCedula.getText().isEmpty()) {
            return true;
        } else {
            if (txtCedula.getText().length() < 10) {
                lblCedula.setVisible(true);
                txtCedula.setBorder(new LineBorder(Color.red));
                cambiarNota("La cedula que ha introducido no alcanza", "el numero de digitos necesarios");
                notaVisible(true);
                return false;
            } else {
                lblCedula.setVisible(false);
                txtCedula.setBorder(new EtchedBorder(1));
                notaVisible(false);
                return true;
            }
        }
    }

    //Validar Campo  
    private void validarCampo(JLabel asterisco, JTextField txt, String columna, String cadena1, String cadena2) {
        if (controUsuario.validarCampoUsuario(txt.getText().trim(), columna, "usuario")) {
            asterisco.setVisible(true);
            txt.setBorder(new LineBorder(Color.red));
            cambiarNota(cadena1, cadena2);
            notaVisible(true);
        } else {
            asterisco.setVisible(false);
            txt.setBorder(new EtchedBorder(1));
            notaVisible(false);
        }
    }

    //Cambiar Campos
    private void cambiarCampos(Usuario usu) {
        this.usu = usu;
        txtCedula.setText(usu.getCedula() + "");
        txtCedula.setEditable(false);
        txtNombre.setText(usu.getNombre());
        txtNombreUsu.setText(usu.getNombreUsu());
        txtNombreUsu.setEditable(false);
        txtContrasena.setText(usu.getContrasena());
        txtCorreo.setText(usu.getCorreo());
        txtTelefono.setText(usu.getTelefono());
        spnSemestre.setValue(usu.getSemestre());
        cbPreguntaS.setSelectedIndex(usu.getPregunta());
        txtRespuesta.setText(usu.getRespuesta());
    }

    //Abrir Iniciar Sesion
    private void abrirIniciarSesion() {
        if (Main.ventanaPrincipal.isVisible()) {
            Main.ventanaPrincipal.visualizar("inicio");
        } else {
            FrmCrearJuego.ventanaJuego.visualizar("inicio");
            FrmCrearJuego.ventanaJuego.setSize(350, FrmCrearJuego.ventanaJuego.getHeight());
        }
    }

    //Metodo Para Validar Key de tipos numericos
    private void validarTeclado(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }

    //Metodo Para Validar Campos
    private boolean validar() {
        cambiarNota("Los Campos con asteriscos", "son Obligatorios.");
        LineBorder b = new LineBorder(Color.red, 1);
        boolean bool = false;
        if (txtCedula.getText().trim().isEmpty() || txtCedula.getText().trim().equalsIgnoreCase("Cedula")) {
            txtCedula.setBorder(b);
            lblCedula.setVisible(true);
            bool = true;
        }
        if (txtNombreUsu.getText().trim().isEmpty() || txtNombreUsu.getText().trim().equalsIgnoreCase("Nombre de usuario")) {
            txtNombreUsu.setBorder(b);
            lblNombreUsuario.setVisible(true);
            bool = true;
        }
        if (txtContrasena.getText().trim().isEmpty() || txtContrasena.getText().trim().equalsIgnoreCase("Contraseña")) {
            txtContrasena.setBorder(b);
            lblContrasena.setVisible(true);
            bool = true;
        }
        if (txtRespuesta.getText().trim().isEmpty() || txtRespuesta.getText().trim().equalsIgnoreCase("Respuesta de seguridad")) {
            txtRespuesta.setBorder(b);
            lblRespuestaS.setVisible(true);
            bool = true;
        }
        if (cbPreguntaS.getSelectedIndex() == 0) {
            cbPreguntaS.setBorder(new CompoundBorder(b, new EtchedBorder(1)));
            lblPreguntaS.setVisible(true);
            bool = true;
        }
        return !notaVisible(bool);
    }

    //Metodo Para Mostar/Ocultar Etiqueta Espacios Obligatorios
    private boolean notaVisible(boolean bool) {
        lblNota.setVisible(bool);
        lblCampos.setVisible(bool);
        lblObligatorios.setVisible(bool);

        return bool;
    }

    //Metodo Para Cambiar Mensaje De Nota
    private void cambiarNota(String cadena1, String cadena2) {
        lblCampos.setText(cadena1);
        lblObligatorios.setText(cadena2);
    }

    //Metodo Para Ocultar Asteriscos
    private void ocultarAsteriscos() {
        lblCorreo.setVisible(false);
        lblCedula.setVisible(false);
        lblContrasena.setVisible(false);
        lblNombreUsuario.setVisible(false);
        lblPreguntaS.setVisible(false);
        lblRespuestaS.setVisible(false);
        lblNota.setVisible(false);
        lblCampos.setVisible(false);
        lblObligatorios.setVisible(false);
    }

    //Metodo Para Excluir Campos No Requeridos
    private String validarEspaciosNoRequeridos(String campo) {
        if (campo.equalsIgnoreCase("nombre") || campo.equalsIgnoreCase("e-mail") || campo.equalsIgnoreCase("telefono")) {
            return "";
        }
        return campo;
    }

    //Metodo Para Validar E-Mail
    private boolean validarEmail(String email) {
        if (!email.equalsIgnoreCase("E-Mail")) {
            String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

            Pattern pattern = Pattern.compile(PATTERN_EMAIL);

            Matcher matcher = pattern.matcher(email);
            return !matcher.matches();
        }
        return !true;
    }

}
