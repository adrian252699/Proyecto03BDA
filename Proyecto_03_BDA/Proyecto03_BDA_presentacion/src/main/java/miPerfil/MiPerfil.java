/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miPerfil;

import control.ControlNavegacion;
import control.ControlUsuario;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import usuarioDTOs.LoginUsuarioDTO;
import usuarioDTOs.ModificarUsuarioDTO;

/**
 *
 * @author jalt2
 */
public class MiPerfil extends javax.swing.JFrame {
    private ControlNavegacion control;
    private LoginUsuarioDTO usuarioActual = ControlUsuario.getInstance().getUsuarioActual();
    /**
     * Creates new form MiPerfil
     */
    public MiPerfil(ControlNavegacion control) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.rellenarInformacionTextField();
        this.control=control;
        this.pnlBuscador.setControl(control);
        this.control.agregarClickListeners(this, pnlBuscador.getTxtBuscar());
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
        pnlBuscador = new buscador.Buscador();
        pnlMiPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        pnlInformacionCuenta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        lblUserPhoto = new javax.swing.JLabel();
        btnCambiarFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pnlBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pnlMiPerfil.setBackground(new java.awt.Color(102, 102, 102));
        pnlMiPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Mi Perfil");
        pnlMiPerfil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        pnlMiPerfil.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        pnlInformacionCuenta.setBackground(new java.awt.Color(51, 51, 51));
        pnlInformacionCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informacion de la cuenta");
        pnlInformacionCuenta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo: ");
        pnlInformacionCuenta.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        pnlInformacionCuenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Usuario:");
        pnlInformacionCuenta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");
        pnlInformacionCuenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido Paterno:");
        pnlInformacionCuenta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido Materno:");
        pnlInformacionCuenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 100, 100, -1));

        btnEditar.setBackground(new java.awt.Color(0, 153, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlInformacionCuenta.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 90, 20));

        txtCorreo.setEditable(false);
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(null);
        pnlInformacionCuenta.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, 20));

        txtNombreUsuario.setEditable(false);
        txtNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreUsuario.setBorder(null);
        pnlInformacionCuenta.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 20));

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        pnlInformacionCuenta.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 190, 20));

        txtApellidoPaterno.setEditable(false);
        txtApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoPaterno.setBorder(null);
        pnlInformacionCuenta.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 150, 20));

        txtApellidoMaterno.setEditable(false);
        txtApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoMaterno.setBorder(null);
        pnlInformacionCuenta.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 150, 20));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlInformacionCuenta.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, 20));

        txtContrasena.setText("jPasswordField1");
        pnlInformacionCuenta.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, -1));

        pnlMiPerfil.add(pnlInformacionCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 560, 170));

        lblUserPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/UserPhoto.png"))); // NOI18N
        pnlMiPerfil.add(lblUserPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 128, 128));

        btnCambiarFoto.setBackground(new java.awt.Color(0, 153, 51));
        btnCambiarFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setText("Cambiar foto");
        btnCambiarFoto.setEnabled(false);
        btnCambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFotoActionPerformed(evt);
            }
        });
        pnlMiPerfil.add(btnCambiarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, 20));

        jPanel1.add(pnlMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 620, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void rellenarInformacionTextField(){
        this.lblUsuario.setText(usuarioActual.getNombreUsuario());
        this.txtNombre.setText(usuarioActual.getNombre());
        this.txtApellidoPaterno.setText(usuarioActual.getApellidoPaterno());
        this.txtApellidoMaterno.setText(usuarioActual.getApellidoMaterno());
        this.txtNombreUsuario.setText(usuarioActual.getNombreUsuario());
        this.txtCorreo.setText(usuarioActual.getCorreo());
        this.txtContrasena.setText(usuarioActual.getContrasena());
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String password = JOptionPane.showInputDialog(this, "Ingrese su contraseña", "Validacion", JOptionPane.INFORMATION_MESSAGE);
        
        if (password.equals(usuarioActual.getContrasena())) {
            this.btnEditar.setEnabled(false);
            this.btnGuardar.setEnabled(true);
            this.btnCambiarFoto.setEnabled(true);
            this.txtNombre.setEditable(true);
            this.txtApellidoPaterno.setEditable(true);
            this.txtApellidoMaterno.setEditable(true);
            this.txtCorreo.setEditable(true);
            this.txtContrasena.setEditable(true);
            this.txtNombreUsuario.setEditable(true);
        }else{
            JOptionPane.showMessageDialog(this, "Credenciales Incorrectas", "Validacion", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //Logica para actualizar datos        
        ModificarUsuarioDTO usuarioModificar = new ModificarUsuarioDTO(usuarioActual.getIdUsuario(), txtNombreUsuario.getText(), txtCorreo.getText(), 
                txtContrasena.getText(), txtNombre.getText(), txtApellidoPaterno.getText(), txtApellidoMaterno.getText());
        System.out.println(usuarioModificar.getIdUsuario());
        try {
//            ControlUsuario.getInstance().modificarUsuario(usuarioModificar);
            if (ControlUsuario.getInstance().modificarUsuario(usuarioModificar)) {
                JOptionPane.showMessageDialog(this, "Usuario Modificado", "Modificar", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(this, "No fue posible modificar", "Modificar", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(MiPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Deshabilitar campos de nuevo
        this.lblUsuario.setText(usuarioModificar.getNombreUsuario());
        this.btnGuardar.setEnabled(false);
        this.btnCambiarFoto.setEnabled(false);
        this.btnEditar.setEnabled(true);
        this.txtNombre.setEditable(false);
        this.txtApellidoPaterno.setEditable(false);
        this.txtApellidoMaterno.setEditable(false);
        this.txtCorreo.setEditable(false);
        this.txtContrasena.setEditable(false);
        this.txtNombreUsuario.setEditable(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        // TODO add your handling code here:
        String ruta = "";
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG, JPEG, ICON", "jpg","png","jpeg","ico");
        fileChooser.setFileFilter(filtro);
        
        int respuesta = fileChooser.showOpenDialog(this);
        
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getPath();
            
            Image imagen = new ImageIcon(ruta).getImage();
            ImageIcon icon = new ImageIcon(imagen.getScaledInstance(lblUserPhoto.getWidth(), lblUserPhoto.getHeight(), Image.SCALE_SMOOTH));
            lblUserPhoto.setIcon(icon);
        }   
        
    }//GEN-LAST:event_btnCambiarFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblUserPhoto;
    private javax.swing.JLabel lblUsuario;
    private buscador.Buscador pnlBuscador;
    private javax.swing.JPanel pnlInformacionCuenta;
    private javax.swing.JPanel pnlMiPerfil;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
