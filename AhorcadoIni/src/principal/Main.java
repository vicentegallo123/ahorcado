package principal;

import static java.lang.System.exit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    ImageIcon img1 = new ImageIcon(getClass().getResource("ahorcado1.png"));
    ImageIcon img2 = new ImageIcon(getClass().getResource("horcado1.png"));
    ImageIcon img3 = new ImageIcon(getClass().getResource("horcado2.png"));
    ImageIcon img4 = new ImageIcon(getClass().getResource("horcado3.png"));
    ImageIcon img5 = new ImageIcon(getClass().getResource("horcado4.png"));
   
    
    private String[][] lista = {
        {"pera", "piña", "limon", "sandia", "uva", "zarzamora"},
        {"juan", "pedro", "oscar", "javier", "ruperto", "hermenegildo"}};
    
    int categoria = -1;
    String palabraGenerada, palabraAdivinada, usadas;
    int error, jugar = 0, bandera1 = 0;
    int pos = 0;
    char [] test;

    public Main() {
        
        super("ahorcadito");
        
        initComponents();

        setSize(530, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        btnProbar = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        txt1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txt1.setEnabled(false);
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });
        getContentPane().add(txt1);
        txt1.setBounds(30, 310, 40, 28);

        btnProbar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnProbar.setText("Probar");
        btnProbar.setEnabled(false);
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProbar);
        btnProbar.setBounds(100, 310, 100, 32);

        lbl2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl2.setText("Palabra a adivinar");
        getContentPane().add(lbl2);
        lbl2.setBounds(10, 70, 190, 30);

        lbl3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lbl3.setText("-");
        getContentPane().add(lbl3);
        lbl3.setBounds(220, 70, 270, 30);

        btnIniciar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(220, 310, 100, 30);

        lbl1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl1.setText("Elija una categoria");
        getContentPane().add(lbl1);
        lbl1.setBounds(10, 20, 200, 30);

        menu.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una categoria...", "Frutas", "Personas" }));
        menu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menuItemStateChanged(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(220, 20, 280, 28);

        lbl4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl4.setText("Letras Utilizadas :");
        getContentPane().add(lbl4);
        lbl4.setBounds(30, 350, 190, 26);

        lbl5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(lbl5);
        lbl5.setBounds(30, 370, 470, 32);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Ahorcado1.png"))); // NOI18N
        getContentPane().add(imagen);
        imagen.setBounds(170, 110, 180, 180);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(350, 310, 100, 30);

        jMenu1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu1.setText("Juego");

        jMenuItem1.setText("Jugar");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Reiniciar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 15))); // NOI18N
        jMenu2.setText("Ayuda");

        jMenuItem5.setText("¿Cómo jugar?");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setText("Creditos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        Random rnd = new Random();
        palabraAdivinada = new String("");
        imagen.setIcon(img1);
        error = 0;
        lbl5.setText("");
        txt1.setText("");
 
        pos = rnd.nextInt() % 6;
            
        if (pos < 0) pos *= -1;
        
        try {
            
            palabraGenerada = lista[categoria][pos];
            if(!txt1.getText().equals(null))txt1.setEnabled(true);
        } 
        catch(ArrayIndexOutOfBoundsException ex){
        
            JOptionPane.showMessageDialog(this, "Seleeciona una categoria");
        }
        
        try{
            
            for (int i = 0; i < palabraGenerada.length(); i++) {
            
            palabraAdivinada += "-";
            lbl3.setText(palabraAdivinada);
          }
        } catch(NullPointerException ex){}
        //metodo para convertir una cadena en cadena de caracteres
        test = palabraAdivinada.toCharArray();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void menuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menuItemStateChanged

        categoria = menu.getSelectedIndex() - 1;
    }//GEN-LAST:event_menuItemStateChanged

    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed

        try{
            char letra = txt1.getText().charAt(0);
                
            int bandera = 0;
            txt1.setText("");
        
            for(int i = 0; i < palabraGenerada.length(); i++){

                if(palabraGenerada.charAt(i) == letra){
                
                    test[i] = letra;
                    bandera = 1;
                    bandera1++;
                }
            
                usadas = String.valueOf(letra);
            }
        
        
            lbl3.setText(String.valueOf(test));
            lbl5.setText(lbl5.getText() + usadas);
        
            if(bandera == 0) error++;
            if(bandera1 == palabraGenerada.length()){
            
                bandera1 = 0;
                JOptionPane.showMessageDialog(this, "¡Ganáste!");
                btnProbar.setEnabled(false);
                txt1.setEnabled(false);
            }

            if (error == 0 && img1 != null) imagen.setIcon(img1);
            if (error == 1 && img2 != null) imagen.setIcon(img2);
            if (error == 2 && img3 != null) imagen.setIcon(img3);
            if (error == 3 && img4 != null) imagen.setIcon(img4);
        
            if (error == 4 && img5 != null){
            
                imagen.setIcon(img5);
                JOptionPane.showMessageDialog(this, "se murio");
                JOptionPane.showMessageDialog(this, "esta era la palabra correcta: " + palabraGenerada);
                btnProbar.setEnabled(false);
                txt1.setText("");
                txt1.setEnabled(false);
            }
        }catch(StringIndexOutOfBoundsException ex) {JOptionPane.showMessageDialog(this, "solo caracteres");}
           
    }//GEN-LAST:event_btnProbarActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        
         String caracteres = "0123456789-+*!#$%&/()=?¡|,.¡¿}{[]¨";
         
         if (caracteres.contains(Character.toString(evt.getKeyChar()))) evt.consume();
         
         if(txt1.getText().length() >= 1) evt.consume();
    }//GEN-LAST:event_txt1KeyTyped

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
       
        if(!txt1.getText().isEmpty()) btnProbar.setEnabled(true);
        else btnProbar.setEnabled(false);
    }//GEN-LAST:event_txt1KeyReleased

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ingrese letras e intente adivinar la palabra oculta en base a\n"
                                                                + "la categoría elegida. Tiene 5 oportunidades antes de perder.");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if(jugar == 0) JOptionPane.showMessageDialog(this, "Presione Jugar");
        
        else{
            Random rnd = new Random();
            palabraAdivinada = new String("");  
            imagen.setIcon(img1);
            error = 0;
            lbl5.setText("");
            txt1.setText("");
            
            pos = rnd.nextInt() % 6;
            
            if (pos < 0) pos *= -1;
        
            try {
            
                palabraGenerada = lista[categoria][pos];
                if(!txt1.getText().equals(null))txt1.setEnabled(true);
            } 
            catch(ArrayIndexOutOfBoundsException ex){
        
                JOptionPane.showMessageDialog(this, "Seleeciona una categoria");
            }
        
            try{
            
                for (int i = 0; i < palabraGenerada.length(); i++) {
            
                palabraAdivinada += "-";
                lbl3.setText(palabraAdivinada);
               }
            } catch(NullPointerException ex){}
        
            test = palabraAdivinada.toCharArray();
       }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "¡Hasta pronto!");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
      exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnProbar;
    private javax.swing.JLabel imagen;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
