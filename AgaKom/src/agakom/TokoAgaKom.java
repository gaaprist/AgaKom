/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agakom;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aga
 */
public class TokoAgaKom extends javax.swing.JFrame {
    String judul = "";
    int volume = 0;
    int harga = 0;
    int a = 0;
    Deque<String> antrijudul = new LinkedList<String>();
    Stack antrian = new Stack();



    /**
     * Creates new form TokoAgaKom
     */
    public TokoAgaKom() {
        initComponents();
        volumekomik.setVisible(false);
        volumekomik1.setVisible(false);
        volumekomik2.setVisible(false);
        cekout.setVisible(false);
        jLabel6.setVisible(true);
        reset.setVisible(true);
        kembali.setVisible(false);
        keluar.setVisible(false);
        //setResizable(false);
        cekout.setLineWrap(true);
        cekout.setWrapStyleWord(true);


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
        jPanel2 = new javax.swing.JPanel();
        judulkomik = new javax.swing.JComboBox<>();
        volumekomik = new javax.swing.JComboBox<>();
        volumekomik1 = new javax.swing.JComboBox<>();
        volumekomik2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        tambah = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        total = new javax.swing.JButton();
        jumlahtotal = new javax.swing.JTextField();
        jumlahbayar = new javax.swing.JTextField();
        bayar = new javax.swing.JButton();
        jumlahkembali = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cek = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cekout = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AgaKom");
        setMinimumSize(new java.awt.Dimension(700, 650));
        setPreferredSize(new java.awt.Dimension(670, 610));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);

        jPanel2.setOpaque(false);

        judulkomik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Judul Komik -", "Naruto", "One Piece", "Detektif Conan" }));
        judulkomik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulkomikActionPerformed(evt);
            }
        });

        volumekomik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Volume Komik -", "Naruto : Volume 1", "Naruto : Volume 2" }));
        volumekomik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumekomikActionPerformed(evt);
            }
        });

        volumekomik1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Volume Komik -", "One Piece : Volume 1", "One Piece : Volume 2" }));
        volumekomik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumekomik1ActionPerformed(evt);
            }
        });

        volumekomik2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Volume Komik -", "Detektif Conan : Volume 1", "Detektif Conan : Volume 2" }));
        volumekomik2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumekomik2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(judulkomik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumekomik, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumekomik1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumekomik2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 159, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(judulkomik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumekomik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumekomik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumekomik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        total.setText("Cek Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jumlahtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jumlahtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahtotalActionPerformed(evt);
            }
        });

        jumlahbayar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        bayar.setText("Bayar");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        jumlahkembali.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jumlahkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahkembaliActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        jLabel4.setText("Pembayaran");

        jLabel5.setText("Kembalian");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jumlahbayar)
                    .addComponent(jumlahtotal)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(27, 27, 27)
                        .addComponent(delete))
                    .addComponent(bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jumlahkembali, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jLabel2.setText("Volume");

        jLabel1.setText("Judul Komik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 100, 255, 393);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Judul", "Volume", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 90, 380, 380);

        cek.setText("Cek");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });
        getContentPane().add(cek);
        cek.setBounds(320, 480, 110, 23);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(560, 480, 100, 23);

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali);
        kembali.setBounds(20, 580, 140, 23);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(523, 580, 130, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\Praktikum\\Praktikum DKP 2020\\AgaKom\\src\\agakom\\522.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -40, 690, 1478);

        jScrollPane3.setOpaque(false);

        cekout.setColumns(20);
        cekout.setRows(5);
        cekout.setAutoscrolls(false);
        cekout.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cekoutAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(cekout);
        cekout.getAccessibleContext().setAccessibleParent(jScrollPane1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 110, 650, 460);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\Praktikum\\Praktikum DKP 2020\\AgaKom\\src\\agakom\\522.jpg")); // NOI18N
        jLabel8.setText("jLabel6");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -40, 690, 1478);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
        int jtotal = 0;
        int jbayar = 0;
        int kembali = 0;
        //bayar = Integer.parseInt(kbayar.getText());

        jtotal = Integer.parseInt(jumlahtotal.getText());
        jbayar = Integer.parseInt(jumlahbayar.getText());

        kembali = jbayar - jtotal;

        jumlahkembali.setText(Integer.toString(kembali));
    }//GEN-LAST:event_bayarActionPerformed

    private void jumlahtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahtotalActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:

        int sum = 0;
        int jbayar = 0;

        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }

        jumlahtotal.setText(Integer.toString(sum));
        
    }//GEN-LAST:event_totalActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        //Menghapus row pilihan
        /*int[] rows = jTable1.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            model.removeRow(rows[i]-i);
        }*/
        //Menghapus row terakhir
        model.removeRow(model.getRowCount() - 1);
            while (a>=0){
                a--;
                break;
            }
        
        antrijudul.removeLast();
        antrijudul.removeLast();

            
        
    }//GEN-LAST:event_deleteActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        int jdlkomik = judulkomik.getSelectedIndex();
        int vlmkomik = volumekomik.getSelectedIndex();

        switch (jdlkomik) {
            case (0):
                judul = "pilih";
                break;
            case (1):
                judul = "Naruto";
                break;
            case (2):
                judul = "One Piece";
                break;
            case (3):
                judul = "Detektif Conan";
                break;

        }

        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();

        if (judul == "pilih"){
            showMessageDialog(null, "Silakan Pilih Judul Komik");
        }
        else if (volume == 0){
            showMessageDialog(null, "Silakan Pilih Volume Komik");
        }
        else {
            while (a>=0){
                a++;
                break;
            }
            model.addRow(new Object[]{a, judul, volume, harga});
            
            String volum = Integer.toString(volume);
            antrijudul.add(judul);
            antrijudul.add("Volume " + volum);

        }
        
        volume = 0;
    }//GEN-LAST:event_tambahActionPerformed

    private void volumekomik2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumekomik2ActionPerformed
        // TODO add your handling code here:
        int vlmkomik2 = volumekomik2.getSelectedIndex();

        switch (vlmkomik2) {
            case (0):
            volume = 0;
            harga = 13000;
            break;
            case (1):
            volume = 1;
            harga = 13000;
            break;
            case (2):
            volume = 2;
            harga = 13000;
            break;

        }
    }//GEN-LAST:event_volumekomik2ActionPerformed

    private void volumekomik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumekomik1ActionPerformed
        // TODO add your handling code here:
        int vlmkomik1 = volumekomik1.getSelectedIndex();

        switch (vlmkomik1) {
            case (0):
            volume = 0;
            harga = 15000;
            break;
            case (1):
            volume = 1;
            harga = 15000;
            break;
            case (2):
            volume = 2;
            harga = 15000;
            break;

        }
    }//GEN-LAST:event_volumekomik1ActionPerformed

    private void volumekomikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumekomikActionPerformed
        // TODO add your handling code here:
        int vlmkomik = volumekomik.getSelectedIndex();

        switch (vlmkomik) {
            case (0):
            volume = 0;
            harga = 12000;
            break;
            case (1):
            volume = 1;
            harga = 12000;
            break;
            case (2):
            volume = 2;
            harga = 12000;
            break;

        }
    }//GEN-LAST:event_volumekomikActionPerformed

    private void judulkomikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulkomikActionPerformed
        // TODO add your handling code here:
        int jdlkomik = judulkomik.getSelectedIndex();

        switch (jdlkomik) {
            case (0):
            volumekomik1.setVisible(false);
            volumekomik2.setVisible(false);
            volumekomik.setVisible(false);
            break;
            case (1):
                volumekomik1.setVisible(false);
                volumekomik2.setVisible(false);
                volumekomik.setVisible(true);
            break;
            case (2):
                volumekomik2.setVisible(false);
                volumekomik.setVisible(false);
                volumekomik1.setVisible(true);
            break;
            case (3):
                volumekomik.setVisible(false);
                volumekomik1.setVisible(false);
                volumekomik2.setVisible(true);

        }
    }//GEN-LAST:event_judulkomikActionPerformed

    private void jumlahkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahkembaliActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        // TODO add your handling code here:
        String volum = "";
        
        cek.setVisible(false);
        cekout.setText("");
        jPanel1.setVisible(false);
        jPanel3.setVisible(false);
        cekout.setVisible(true);
        kembali.setVisible(true);
        reset.setVisible(false);
        keluar.setVisible(true);
        jLabel6.setVisible(false);
        
        String t = jumlahtotal.getText();
        String b = jumlahbayar.getText();
        String k = jumlahkembali.getText();
        
        volum = Integer.toString(volume);

        cekout.setText(
                "==========================================================================================\n"+
                "-------------------------------------------------------              Toko AgaKom             ---------------------------------------------------------------\n" +
                "+++++++++++++++++++++++++++++++              Cek Transaksi            ++++++++++++++++++++++++++++++++++++\n"+
                "==========================================================================================\n\n"+
                "Detil Transaksi :\n" + antrijudul + "\n\n" +
                "Total 	: " + t + "\n\n" +
                "Jumlah Bayar 	: " + b + "\n\n" +
                "Kembalian 	: " + k

                        );
        
    }//GEN-LAST:event_cekActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        judulkomik.setSelectedIndex(0);
        jumlahtotal.setText("");
        jumlahbayar.setText("");
        jumlahkembali.setText("");
        antrijudul.clear();

        
    }//GEN-LAST:event_resetActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        
        jPanel1.setVisible(true);
        jPanel3.setVisible(true);
        cekout.setVisible(false);
        cek.setVisible(true);
        kembali.setVisible(false);
        reset.setVisible(true);
        keluar.setVisible(false);
        jLabel6.setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void cekoutAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cekoutAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cekoutAncestorAdded

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
            java.util.logging.Logger.getLogger(TokoAgaKom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TokoAgaKom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TokoAgaKom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TokoAgaKom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokoAgaKom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayar;
    private javax.swing.JButton cek;
    private javax.swing.JTextArea cekout;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> judulkomik;
    private javax.swing.JTextField jumlahbayar;
    private javax.swing.JTextField jumlahkembali;
    private javax.swing.JTextField jumlahtotal;
    private javax.swing.JButton keluar;
    private javax.swing.JButton kembali;
    private javax.swing.JButton reset;
    private javax.swing.JButton tambah;
    private javax.swing.JButton total;
    private javax.swing.JComboBox<String> volumekomik;
    private javax.swing.JComboBox<String> volumekomik1;
    private javax.swing.JComboBox<String> volumekomik2;
    // End of variables declaration//GEN-END:variables
}
