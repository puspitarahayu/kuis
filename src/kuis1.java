/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Puspita
 */
public class kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form kuis1
     */
    public kuis1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        nilai = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        matpel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Penilaian Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 90, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 70, 70, 14);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 110, 70, 14);

        jLabel4.setText("Matpel");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 150, 70, 14);

        jLabel5.setText("Nilai");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 190, 50, 14);

        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(170, 230, 100, 23);
        getContentPane().add(nilai);
        nilai.setBounds(160, 180, 110, 30);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(160, 60, 110, 30);
        getContentPane().add(absen);
        absen.setBounds(160, 100, 110, 30);
        getContentPane().add(matpel);
        matpel.setBounds(160, 140, 110, 30);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 270, 260, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        String Nama = nama.getText();
        String Absen = absen.getText();
        String Matpel = matpel.getText();
        int Nilai = Integer.parseInt(nilai.getText());
        String Keterangan = null;
        //operasi nilai
        if (Nilai>=0 && Nilai<=74){
            Keterangan = "Tidak Lulus";
        }
        else if (Nilai>=75 && Nilai<=99){
            Keterangan = "Lulus";
    }
        else if (Nilai == 100){
            Keterangan = "Sempurna";
        }
        else {
            Keterangan = "Amazing";
    }
        
        hasil.setText("Nama = "+Nama+"\n"+"Absen = "+ Absen +"\n"+ "Mata pelajaran = "+ Matpel +"\n"+ "Nilai = "+ Nilai+ "\n" +"Keterangan = "+ Keterangan);
// TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed

        
                // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

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
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matpel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilai;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
