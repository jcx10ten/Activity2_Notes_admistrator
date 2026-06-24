package co.edu.udistrital.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Font;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class PanelEstudiantes extends JPanel {

    private JLabel lblEstudiantes;
    private JLabel lblNotas;
    private JLabel[] lblNumeros;
    private JTextField[] txtNotas;
    private JTextField[] txtEstudiantes;

    public PanelEstudiantes() {
        setLayout(new BorderLayout(0, 10));
        setBackground(new Color(212, 232, 255));
        setBorder(new TitledBorder("Panel de Estudiantes"));
        inicializarComponentes();
        setVisible(true);
    }

    public void inicializarComponentes() {
        JPanel panelNombres = new JPanel(new GridLayout(1, 3, 5, 0));
        panelNombres.setBackground(Color.WHITE);

        panelNombres.add(new JLabel("")); 

        lblEstudiantes = new JLabel("Estudiantes", JLabel.CENTER);
        lblEstudiantes.setFont(new Font("Arial", Font.BOLD, 13));
        panelNombres.add(lblEstudiantes);

        lblNotas = new JLabel("Notas", JLabel.CENTER);
        lblNotas.setFont(new Font("Arial", Font.BOLD, 13));
        panelNombres.add(lblNotas);

        add(panelNombres, BorderLayout.NORTH);

        JPanel panelCuadricula = new JPanel(new GridLayout(10, 3, 5, 8));
        panelCuadricula.setBackground(Color.WHITE);

        lblNumeros = new JLabel[10];
        txtEstudiantes = new JTextField[10];
        txtNotas = new JTextField[10];

        for (int i = 0; i < 10; i++) {
            lblNumeros[i] = new JLabel(String.valueOf(i + 1), JLabel.CENTER);
            txtEstudiantes[i] = new JTextField();
            txtNotas[i] = new JTextField();

            panelCuadricula.add(lblNumeros[i]);
            panelCuadricula.add(txtEstudiantes[i]);
            panelCuadricula.add(txtNotas[i]);
        }

        add(panelCuadricula, BorderLayout.CENTER);
    }

    public JLabel getLblEstudiantes() {
        return lblEstudiantes;
    }

    public JLabel getLblNotas() {
        return lblNotas;
    }

    public JLabel[] getLblNumeros() {
        return lblNumeros;
    }

    public JTextField[] getTxtNotas() {
        return txtNotas;
    }

    public JTextField[] getTxtEstudiantes() {
        return txtEstudiantes;
    }

    public void setLblEstudiantes(JLabel lblEstudiantes) {
        this.lblEstudiantes = lblEstudiantes;
    }

    public void setLblNotas(JLabel lblNotas) {
        this.lblNotas = lblNotas;
    }

    public void setLblNumeros(JLabel[] lblNumeros) {
        this.lblNumeros = lblNumeros;
    }

    public void setTxtNotas(JTextField[] txtNotas) {
        this.txtNotas = txtNotas;
    }

    public void setTxtEstudiantes(JTextField[] txtEstudiantes) {
        this.txtEstudiantes = txtEstudiantes;
    }
    

}
