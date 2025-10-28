package Tugas5.logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiPenghitungKata extends JFrame {

    private JTextArea areaTeks;
    private JLabel lblKata, lblKarakter, lblKalimat, lblParagraf;
    private JButton btnHitung;

    public AplikasiPenghitungKata() {
        setTitle("Aplikasi Penghitung Kata");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        areaTeks = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTeks);

        JPanel panelBawah = new JPanel(new GridLayout(5, 1, 5, 5));
        lblKata = new JLabel("Jumlah Kata: 0");
        lblKarakter = new JLabel("Jumlah Karakter: 0");
        lblKalimat = new JLabel("Jumlah Kalimat: 0");
        lblParagraf = new JLabel("Jumlah Paragraf: 0");

        btnHitung = new JButton("Hitung");
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungTeks();
            }
        });

        panelBawah.add(lblKata);
        panelBawah.add(lblKarakter);
        panelBawah.add(lblKalimat);
        panelBawah.add(lblParagraf);
        panelBawah.add(btnHitung);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(panelBawah, BorderLayout.SOUTH);
        add(panel);
    }

    private void hitungTeks() {
        String teks = areaTeks.getText();
        lblKata.setText("Jumlah Kata: " + PenghitungKataHelper.hitungKata(teks));
        lblKarakter.setText("Jumlah Karakter: " + PenghitungKataHelper.hitungKarakter(teks));
        lblKalimat.setText("Jumlah Kalimat: " + PenghitungKataHelper.hitungKalimat(teks));
        lblParagraf.setText("Jumlah Paragraf: " + PenghitungKataHelper.hitungParagraf(teks));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AplikasiPenghitungKata().setVisible(true);
        });
    }
}
