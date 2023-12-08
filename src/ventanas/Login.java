
package ventanas;

// Bibliotecas o Librerias
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * @author Miller
 * @Proyecto DataSystem
 * @version 0.1
 * @since 18-nov-2023
 */

public class Login extends javax.swing.JFrame {
    
    public static String user ="";
    String pass = "";

   
    public Login() {
        
         // Metodo para poner transparente el jframe
        setUndecorated(true);
        
        
        initComponents();
        
         // 30% de opacidad del jframe
        setOpacity(0.7f);
        
        setSize(400, 550); // Medidas del Jframe
        setResizable(false);   // Para que no se pueda modificar el tamaño del Jframe.
        setTitle("Acceso al sistema"); // Titulo 
        setLocationRelativeTo(null); // El Jframe aparezca centrado 
        
         // Redondear las esquinas del jframe 
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 20,20));
        
        // Colocamos un borde al jframe
        //getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE,4));
        
        // Objeto para poder agregar el fondo de imagen al Jframe
        ImageIcon wallpaper = new ImageIcon("src/images/background.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), 
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();  // Opcional para que se apliquen los cambios.
        
        
        // imagen logo
        ImageIcon wallpaper_logo  = new ImageIcon("src/images/logoUser.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), 
                jLabel_Logo.getHeight(), Image.SCALE_DEFAULT)); 
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
    }
    
    // logo Jframe
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
    
    // Objeto para agregar  icono JOptionPane 
    public Icon icono (String path, int width, int heigth){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
            .getScaledInstance(width, heigth,java.awt.Image.SCALE_SMOOTH));
        return  img;
    }
            
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Logo = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Acceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        btn_Minimize = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 190));

        txt_user.setBackground(new java.awt.Color(255, 255, 255));
        txt_user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(51, 51, 51));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(null);
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userKeyPressed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 210, 30));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(51, 51, 51));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(null);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 210, 30));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jButton_Acceder.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_Acceder.setText("Acceder");
        jButton_Acceder.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 210, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("® Desing by Miller");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        btn_close.setBackground(new java.awt.Color(204, 204, 255));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("x");
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_close.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 30));

        btn_Minimize.setBackground(new java.awt.Color(204, 204, 255));
        btn_Minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Minimize.setForeground(new java.awt.Color(255, 255, 255));
        btn_Minimize.setText("-");
        btn_Minimize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MinimizeMouseExited(evt);
            }
        });
        btn_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
        // 
        user = txt_user.getText() .trim();
        pass = txt_password.getText() .trim();
        
        if(!user.equals("") || !pass.equals("")){
            
            try{
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst =cn.prepareStatement(
                        "select tipo_nivel, estatus from usuarios where username = '" + user
                            + "'  and password = '" + pass  + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    
                    if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                        
                    } else if(tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Capturista().setVisible(true);
                        
                    } else if(tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                
                }else {
                    //JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    JOptionPane.showMessageDialog(null, "<html><p style=\"color:red;font-size:12px;\">Datos de acceso incorrectos." +"</p></html>",
                        "advertencia", JOptionPane.PLAIN_MESSAGE, icono("/images/DS.png", 40 ,40));

                    txt_user.setText("");
                    txt_password.setText("");
                }
            
            } catch (SQLException e) {
                System.err.println("Error en el boton acceder." + e);
                //JOptionPane.showMessageDialog(null,"Error al iniciar sesion , contacte al administrador.");
                JOptionPane.showMessageDialog(null, "<html><p style=\"color:red;font-size:12px;\">Error al iniciar sesion , contacte al administrador." +"</p></html>",
                        "advertencia", JOptionPane.PLAIN_MESSAGE, icono("/images/DS.png", 40 ,40));

            }
        
        } else {
            //JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            JOptionPane.showMessageDialog(null, "<html><p style=\"color:red;font-size:12px;\">Debes llenar todos los campos." +"</p></html>",
                        "advertencia", JOptionPane.PLAIN_MESSAGE, icono("/images/DS.png", 40 ,40));

        }
        
    }//GEN-LAST:event_jButton_AccederActionPerformed

    private void txt_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_userKeyPressed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // Metodo para cerrar el jframe
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        // 
        btn_close.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        // TODO add your handling code here:
        btn_close.setBackground(Color.red);
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizeActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_MinimizeActionPerformed

    private void btn_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizeMouseExited
        // TODO add your handling code here:
        btn_Minimize.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_btn_MinimizeMouseExited

    private void btn_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizeMouseEntered
        // TODO add your handling code here:
        btn_Minimize.setBackground(Color.BLUE);
    }//GEN-LAST:event_btn_MinimizeMouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Minimize;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
