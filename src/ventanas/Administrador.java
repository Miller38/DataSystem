
package ventanas;

// Librerias
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

/**
 * @author Miller
 * @Proyecto DataSystem
 * @version 0.1
 * @since 18-nov-2023
 */


public class Administrador extends javax.swing.JFrame {
    
    String user, nombre_usuario;
    public static int sesion_usuario;

  
    public Administrador() {
        
        // Metodo para poner transparente el jframe
        //setUndecorated(true);
        
        initComponents();
        // recuperamos el nombre de usuario que viene desde el login.
        user = Login.user;
        sesion_usuario = 1;
        
        // 30% de opacidad del jframe
        //setOpacity(0.7f);
        
        setTitle("Administrador  " );
        setSize(650,430);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Redondear las esquinas del jframe 
         //setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 20,20));
       
       
        // Cerramos procesos en segundo plano cuando esta interfaz es cerrada
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        // Colocamos un borde al jframe
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
       
        
        // Objeto para poder agregar el fondo de imagen al Jframe
        ImageIcon wallpaper = new ImageIcon("src/images/background.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), 
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();  // Opcional para que se apliquen los cambios.
        
        
        
        // Nos conectamos a la base de datos y determinamos el usuario
        try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_NombreUsuario.setText(nombre_usuario);
            }
            
        } catch (SQLException e) {
            System.err.println("Error en conexion desde lainterfaz Administrador.");
        
            
        }
 
    }
    
    // logo Jframe
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_NombreUsuario = new javax.swing.JLabel();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jButton_GestionarUsuarios = new javax.swing.JButton();
        jButton_Creatividad = new javax.swing.JButton();
        jButton_Capturista = new javax.swing.JButton();
        jButton_Tecnico = new javax.swing.JButton();
        jButton_AcercaDe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton_RegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_GestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        jButton_GestionarUsuarios.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jButton_GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton_Creatividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creatividad.png"))); // NOI18N
        getContentPane().add(jButton_Creatividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 120, 100));

        jButton_Capturista.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_Capturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        getContentPane().add(jButton_Capturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 100));

        jButton_Tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        getContentPane().add(jButton_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 120, 100));

        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/geekipedia.png"))); // NOI18N
        getContentPane().add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 120, 100));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creatividad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 100, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel vista capturista");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Panel vista tecnico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 100, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acerca De");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 100, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioActionPerformed
        // Metodo que nos envia a la interfaz de Registrar Usuarios.
        RegistrarUsuarios registrarUsuarios = new RegistrarUsuarios();
        registrarUsuarios.setVisible(true);
    }//GEN-LAST:event_jButton_RegistrarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Capturista;
    private javax.swing.JButton jButton_Creatividad;
    private javax.swing.JButton jButton_GestionarUsuarios;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JButton jButton_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
