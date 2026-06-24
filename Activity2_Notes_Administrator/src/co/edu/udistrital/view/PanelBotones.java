package co.edu.udistrital.view;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.GridLayout;

public class PanelBotones extends JPanel {
    private JButton btnAprobados;
    private JButton btnReprobados;
    private JButton btnPromedio;
    private JButton btnModa;
    private JButton btnDesviacion;

    public PanelBotones() {
        setLayout(new GridLayout(5, 1, 0, 25));
        setBackground(new java.awt.Color(212, 232, 255));
        setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));
        inicializarComponentes();
        setVisible(true);
    }
    public void inicializarComponentes() {
        btnAprobados = new JButton("Aprobados");
        btnReprobados = new JButton("Reprobados");
        btnPromedio = new JButton("Promedio");
        btnModa = new JButton("Moda");
        btnDesviacion = new JButton("Desviación");

        add(btnAprobados);
        add(btnReprobados);
        add(btnPromedio);
        add(btnModa);
        add(btnDesviacion);
    }

    public JButton getBtnAprobados() {
        return btnAprobados;
    }

    public JButton getBtnReprobados() {
        return btnReprobados;
    }

    public JButton getBtnPromedio() {
        return btnPromedio;
    }

    public JButton getBtnModa() {
        return btnModa;
    }

    public JButton getBtnDesviacion() {
        return btnDesviacion;
    }

    public void setBtnAprobados(JButton btnAprobados) {
        this.btnAprobados = btnAprobados;
    }

    public void setBtnReprobados(JButton btnReprobados) {
        this.btnReprobados = btnReprobados;
    }

    public void setBtnPromedio(JButton btnPromedio) {
        this.btnPromedio = btnPromedio;
    }

    public void setBtnModa(JButton btnModa) {
        this.btnModa = btnModa;
    }

    public void setBtnDesviacion(JButton btnDesviacion) {
        this.btnDesviacion = btnDesviacion;
    }
}
