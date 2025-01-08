/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sim.kantordesa.mailtemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sim.kantordesa.config.AppContext;
import sim.kantordesa.config.koneksi;

/**
 *
 * @author manii
 */
public class edit_mailform extends javax.swing.JFrame {

    public int mailTypeId;
    public String title;
    private int mailId = 0;

    public edit_mailform(int mailId) {
        this.mailId = mailId;
        initComponents();
        loadDataFromMailId();
    }

    public void updateData() {
        Integer edit_mailform_mailId = (Integer) AppContext.get("edit_mailform_mailId");
        this.mailId = edit_mailform_mailId != null ? edit_mailform_mailId : 0;
        updateTitle(this.title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_warganegara = new javax.swing.ButtonGroup();
        group_jeniskelamin = new javax.swing.ButtonGroup();
        body = new javax.swing.JPanel();
        btn_next = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        nama = new javax.swing.JLabel();
        text_nama = new javax.swing.JTextField();
        tgl_lahir = new javax.swing.JLabel();
        text_tgl_lahir = new javax.swing.JTextField();
        umur = new javax.swing.JLabel();
        jUmur = new javax.swing.JSpinner();
        warganegara = new javax.swing.JLabel();
        wni = new javax.swing.JRadioButton();
        wna = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        lakilaki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        ttinggal = new javax.swing.JLabel();
        text_ttinggal = new javax.swing.JTextField();
        goldar = new javax.swing.JLabel();
        box_goldar = new javax.swing.JComboBox<>();
        no_ktp = new javax.swing.JLabel();
        no_kk = new javax.swing.JLabel();
        text_noktp = new javax.swing.JTextField();
        text_nokk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_keperluan = new javax.swing.JTextArea();
        keperluan = new javax.swing.JLabel();
        sd = new javax.swing.JLabel();
        daritanggal = new com.toedter.calendar.JDateChooser();
        berlaku = new javax.swing.JLabel();
        sampaitanggal = new com.toedter.calendar.JDateChooser();
        box_agama = new javax.swing.JComboBox<>();
        agama = new javax.swing.JLabel();
        text_pekerjaan = new javax.swing.JTextField();
        pekerjaan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setPreferredSize(new java.awt.Dimension(1300, 640));

        btn_next.setBackground(new java.awt.Color(19, 128, 97));
        btn_next.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Simpan");
        btn_next.setPreferredSize(new java.awt.Dimension(120, 35));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(19, 128, 97));
        btn_back.setText("Kembali");
        btn_back.setPreferredSize(new java.awt.Dimension(100, 35));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama.setText("Nama");

        text_nama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_nama.setPreferredSize(new java.awt.Dimension(500, 35));

        tgl_lahir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tgl_lahir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tgl_lahir.setText("Tempat / Tanggal Lahir");

        text_tgl_lahir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_tgl_lahir.setPreferredSize(new java.awt.Dimension(500, 35));

        umur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        umur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        umur.setText("Umur");

        jUmur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jUmur.setPreferredSize(new java.awt.Dimension(64, 35));

        warganegara.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        warganegara.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        warganegara.setText("Warga Negara");

        group_warganegara.add(wni);
        wni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wni.setText("WNI");
        wni.setPreferredSize(new java.awt.Dimension(64, 35));

        group_warganegara.add(wna);
        wna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wna.setText("WNA");
        wna.setPreferredSize(new java.awt.Dimension(64, 35));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setText("Jenis Kelamin");

        group_jeniskelamin.add(lakilaki);
        lakilaki.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lakilaki.setText("Laki - laki");
        lakilaki.setPreferredSize(new java.awt.Dimension(64, 35));

        group_jeniskelamin.add(perempuan);
        perempuan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perempuan.setText("Perempuan");
        perempuan.setPreferredSize(new java.awt.Dimension(120, 35));

        ttinggal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ttinggal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ttinggal.setText("Tempat Tinggal");

        text_ttinggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_ttinggal.setPreferredSize(new java.awt.Dimension(500, 35));

        goldar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        goldar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        goldar.setText("Golongan Darah");

        box_goldar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        box_goldar.setMaximumRowCount(4);
        box_goldar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O", "AB", "A", "B" }));
        box_goldar.setToolTipText("");
        box_goldar.setMinimumSize(new java.awt.Dimension(64, 35));
        box_goldar.setPreferredSize(new java.awt.Dimension(64, 35));

        no_ktp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        no_ktp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        no_ktp.setText("Nomor KTP");

        no_kk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        no_kk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        no_kk.setText("Nomor KK");

        text_noktp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_noktp.setPreferredSize(new java.awt.Dimension(500, 35));

        text_nokk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_nokk.setPreferredSize(new java.awt.Dimension(500, 35));

        text_keperluan.setColumns(20);
        text_keperluan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_keperluan.setRows(5);
        jScrollPane1.setViewportView(text_keperluan);

        keperluan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        keperluan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keperluan.setText("Keperluan");

        sd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sd.setText("s/d");

        daritanggal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daritanggal.setMaxSelectableDate(new java.util.Date(253370739706000L));
        daritanggal.setPreferredSize(new java.awt.Dimension(140, 35));

        berlaku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        berlaku.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        berlaku.setText("Berlaku");

        sampaitanggal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sampaitanggal.setMaxSelectableDate(new java.util.Date(253370739706000L));
        sampaitanggal.setPreferredSize(new java.awt.Dimension(140, 35));

        box_agama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        box_agama.setMaximumRowCount(6);
        box_agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Katolik", "Protestan", "Hindu", "Buddha", "Konghucu" }));
        box_agama.setToolTipText("");
        box_agama.setMinimumSize(new java.awt.Dimension(64, 35));
        box_agama.setPreferredSize(new java.awt.Dimension(200, 35));

        agama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agama.setText("Agama");

        text_pekerjaan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_pekerjaan.setPreferredSize(new java.awt.Dimension(500, 35));

        pekerjaan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pekerjaan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pekerjaan.setText("Pekerjaan");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama)
                            .addComponent(tgl_lahir)
                            .addComponent(text_ttinggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttinggal)
                            .addComponent(warganegara)
                            .addComponent(jUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umur)
                            .addComponent(gender)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(lakilaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perempuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(wni, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wna, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(box_agama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nokk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_noktp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_ktp)
                            .addComponent(no_kk)
                            .addComponent(keperluan)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(daritanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sd)
                                .addGap(18, 18, 18)
                                .addComponent(sampaitanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(berlaku)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_goldar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goldar))
                        .addGap(60, 60, 60))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pekerjaan))
                        .addGap(731, 731, 731))))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama)
                            .addComponent(no_ktp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgl_lahir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(text_noktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_kk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_nokk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umur)
                    .addComponent(keperluan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warganegara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lakilaki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perempuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(goldar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_goldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(agama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(berlaku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daritanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sd)
                    .addComponent(sampaitanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(ttinggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_ttinggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pekerjaan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1291, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        Connection conn = koneksi.getConnection();
        String sql1 = "UPDATE civil_registry SET nama = ?, no_ktp = ?, no_kk = ?, tempat_tanggal_lahir = ?, "
                + "warga_negara = ?, agama = ?, jenis_kelamin = ?, pekerjaan = ?, alamat = ?, gol_darah = ?, usia = ? "
                + "WHERE no_ktp = (SELECT no_ktp FROM mail_content WHERE mail_id = ?)";
        String sql2 = "UPDATE mail_content SET no_ktp = ?, mulai_berlaku = ?, tgl_akhir = ?, keperluan = ? WHERE mail_id = ?";
            try (PreparedStatement stmt1 = conn.prepareStatement(sql1);
                PreparedStatement stmt2 = conn.prepareStatement(sql2)) {
                
                stmt1.setString(1, text_nama.getText());
                stmt1.setString(2, text_noktp.getText());
                stmt1.setString(3, text_nokk.getText());
                stmt1.setString(4, text_tgl_lahir.getText());
                stmt1.setString(5, wni.isSelected() ? "WNI" : "WNA");
                stmt1.setString(6, box_agama.getSelectedItem().toString());
                stmt1.setString(7, lakilaki.isSelected() ? "Laki-laki" : "Perempuan");
                stmt1.setString(8, text_pekerjaan.getText());
                stmt1.setString(9, text_ttinggal.getText());
                stmt1.setString(10, box_goldar.getSelectedItem().toString());
                stmt1.setString(11, jUmur.getValue().toString());
                stmt1.setInt(12, mailId);
                
                stmt2.setString(1, text_noktp.getText());
                stmt2.setDate(2, daritanggal.getDate() != null ? new java.sql.Date(daritanggal.getDate().getTime()) : null);
                stmt2.setDate(3, sampaitanggal.getDate() != null ? new java.sql.Date(sampaitanggal.getDate().getTime()) : null);
                stmt2.setString(4, text_keperluan.getText());
                stmt2.setInt(5, mailId);
                
                stmt1.executeUpdate();
                stmt2.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(edit_mailform.class.getName()).log(Level.SEVERE, null, ex);
            }
        JOptionPane.showMessageDialog(this, mailId != 0 ? "Data berhasil diperbarui" : "Data berhasil disimpan");
        dispose();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    public final void updateTitle(String title) {
        this.setTitle(title);
    }

    private void loadDataFromMailId() {
        Connection conn = koneksi.getConnection();
        String query1 = "SELECT mc.*, mt.type_name FROM mail_content mc "
                + "JOIN mail_type mt ON mc.mail_type_id = mt.mail_type_id WHERE mc.mail_id = ?";
        String query2 = "SELECT * FROM civil_registry WHERE no_ktp = (SELECT no_ktp FROM mail_content WHERE mail_id = ?)";
        try (PreparedStatement ps = conn.prepareStatement(query1);
            PreparedStatement ps2 = conn.prepareStatement(query2)) {
            ps.setInt(1, mailId);
            ps2.setInt(1, mailId);
            ResultSet rs = ps.executeQuery();
            ResultSet rs2 = ps2.executeQuery();
            if (rs.next() && rs2.next()) {
                text_nama.setText(rs2.getString("nama"));
                text_tgl_lahir.setText(rs2.getString("tempat_tanggal_lahir"));
                jUmur.setValue(rs2.getInt("usia"));
                wni.setSelected("WNI".equals(rs2.getString("warga_negara")));
                wna.setSelected("WNA".equals(rs2.getString("warga_negara")));
                lakilaki.setSelected("Laki-laki".equals(rs2.getString("jenis_kelamin")));
                perempuan.setSelected("Perempuan".equals(rs2.getString("jenis_kelamin")));
                text_ttinggal.setText(rs2.getString("alamat"));
                box_goldar.setSelectedItem(rs2.getString("gol_darah"));
                text_noktp.setText(rs.getString("no_ktp"));
                text_nokk.setText(rs2.getString("no_kk"));
                text_keperluan.setText(rs.getString("keperluan"));

                daritanggal.setDate(rs.getDate("mulai_berlaku"));
                sampaitanggal.setDate(rs.getDate("tgl_akhir"));

                box_agama.setSelectedItem(rs2.getString("agama"));
                text_pekerjaan.setText(rs2.getString("pekerjaan"));

                this.mailTypeId = rs.getInt("mail_type_id");
                this.title = rs.getString("type_name");
                updateTitle(this.title);

                // Additional fields
                MailData.getMap().put("mail_id", String.valueOf(rs.getInt("mail_id")));
                MailData.getMap().put("mail_date", rs.getString("mail_date"));
                MailData.getMap().put("status", rs.getString("status"));
                MailData.getMap().put("created_at", rs.getString("created_at"));
                MailData.getMap().put("updated_at", rs.getString("updated_at"));
                MailData.getMap().put("mail_number", rs.getString("mail_number"));
                MailData.getMap().put("mulai_berlaku", rs.getString("mulai_berlaku"));
                MailData.getMap().put("tgl_akhir", rs.getString("tgl_akhir"));
                MailData.getMap().put("created_by", rs.getString("created_by"));
                MailData.getMap().put("status_validation", rs.getString("status_validation"));
                MailData.getMap().put("status_lead", rs.getString("status_lead"));
                MailData.getMap().put("updated_validation", rs.getString("updated_validation"));
                MailData.getMap().put("updated_lead", rs.getString("updated_lead"));
                MailData.getMap().put("mail_comment", rs.getString("mail_comment"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agama;
    private javax.swing.JLabel berlaku;
    private javax.swing.JPanel body;
    private javax.swing.JComboBox<String> box_agama;
    private javax.swing.JComboBox<String> box_goldar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_next;
    private com.toedter.calendar.JDateChooser daritanggal;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel goldar;
    private javax.swing.ButtonGroup group_jeniskelamin;
    private javax.swing.ButtonGroup group_warganegara;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jUmur;
    private javax.swing.JLabel keperluan;
    private javax.swing.JRadioButton lakilaki;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel no_kk;
    private javax.swing.JLabel no_ktp;
    private javax.swing.JLabel pekerjaan;
    private javax.swing.JRadioButton perempuan;
    private com.toedter.calendar.JDateChooser sampaitanggal;
    private javax.swing.JLabel sd;
    private javax.swing.JTextArea text_keperluan;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_nokk;
    private javax.swing.JTextField text_noktp;
    private javax.swing.JTextField text_pekerjaan;
    private javax.swing.JTextField text_tgl_lahir;
    private javax.swing.JTextField text_ttinggal;
    private javax.swing.JLabel tgl_lahir;
    private javax.swing.JLabel ttinggal;
    private javax.swing.JLabel umur;
    private javax.swing.JLabel warganegara;
    private javax.swing.JRadioButton wna;
    private javax.swing.JRadioButton wni;
    // End of variables declaration//GEN-END:variables
}
