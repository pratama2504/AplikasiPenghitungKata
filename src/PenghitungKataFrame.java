
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PenghitungKataFrame extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataFrame
     */
    public PenghitungKataFrame() {
        initComponents();
        initDocumentListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelKata = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelKarakter = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelKalimat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelParagraf = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnCarikata = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(280, 180));

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Jumlah kata");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        labelKata.setText("0");
        labelKata.setPreferredSize(new java.awt.Dimension(60, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(labelKata, gridBagConstraints);

        jLabel3.setText("Jumlah karakter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        labelKarakter.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(labelKarakter, gridBagConstraints);

        jLabel5.setText("Jumlah kalimat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        labelKalimat.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(labelKalimat, gridBagConstraints);

        jLabel7.setText("Jumlah paragraf");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        labelParagraf.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(labelParagraf, gridBagConstraints);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnHitung, gridBagConstraints);

        btnSimpan.setText("Simpan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnSimpan, gridBagConstraints);

        btnCarikata.setText("Cari kata");
        btnCarikata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarikataActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnCarikata, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(txtCari, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungJumlah();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCarikataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarikataActionPerformed
        cariKata();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarikataActionPerformed

    private void initDocumentListener() {
        // Menambahkan DocumentListener untuk mendeteksi perubahan di JTextArea
        txtInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                hitungJumlah();  // Hitung jumlah setiap kali ada perubahan
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                hitungJumlah();  // Hitung jumlah setiap kali ada perubahan
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                // Tidak digunakan untuk JTextArea, karena hanya akan dipanggil untuk perubahan gaya teks
            }
        });
    }

    private void hitungJumlah() {
        String teks = txtInput.getText();

        // Menghitung jumlah kata (kata dipisahkan oleh spasi, tab, atau karakter lain yang tidak dianggap kata)
        String[] kataArray = teks.trim().split("\\s+");
        int jumlahKata = (teks.trim().isEmpty()) ? 0 : kataArray.length;

        // Menghitung jumlah karakter (termasuk spasi, tanpa menghitung karakter non-printable)
        int jumlahKarakter = teks.length();

        // Menghitung jumlah kalimat, kalimat diakhiri dengan '.', '?', atau '!'
        int jumlahKalimat = teks.split("[.!?]").length;

        // Menghitung jumlah paragraf berdasarkan newline (baris kosong antar paragraf)
        int jumlahParagraf = teks.split("(?m)^\\s*$").length;

        // Update label dengan hasil perhitungan
        labelKata.setText(String.valueOf(jumlahKata));
        labelKarakter.setText(String.valueOf(jumlahKarakter));
        labelKalimat.setText(String.valueOf(jumlahKalimat));
        labelParagraf.setText(String.valueOf(jumlahParagraf));
    }
    
    private void cariKata() {
    String kataCari = txtCari.getText().trim();  // Ambil kata dari txtCari dan hapus spasi di awal/akhir
    String teksInput = txtInput.getText();  // Ambil teks dari JTextArea (txtInput)

    if (kataCari.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari.");
        return;
    }

    // Buat Highlighter untuk menyorot kata yang ditemukan
    Highlighter highlighter = txtInput.getHighlighter();
    highlighter.removeAllHighlights();  // Hapus highlight sebelumnya

    // Buat pattern regex untuk mencari kata (case-insensitive)
    Pattern pattern = Pattern.compile(Pattern.quote(kataCari), Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(teksInput);

    int count = 0;
    while (matcher.find()) {
        try {
            // Sorot kata yang ditemukan
            highlighter.addHighlight(matcher.start(), matcher.end(), new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW));
            count++;  // Hitung jumlah kemunculan kata
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    // Tampilkan jumlah kemunculan kata yang ditemukan
    if (count > 0) {
        JOptionPane.showMessageDialog(this, "Ditemukan " + count + " kemunculan kata \"" + kataCari + "\".");
    } else {
        JOptionPane.showMessageDialog(this, "Kata \"" + kataCari + "\" tidak ditemukan.");
    }
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
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarikata;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelKalimat;
    private javax.swing.JLabel labelKarakter;
    private javax.swing.JLabel labelKata;
    private javax.swing.JLabel labelParagraf;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables
}
