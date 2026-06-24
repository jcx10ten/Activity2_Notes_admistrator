package co.edu.udistrital.view;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;

public class PanelInformacion  extends JPanel {
    private JTextArea txtAreaInformacion;

    public PanelInformacion(){
        setLayout(new BorderLayout());
        setBackground(new java.awt.Color(212, 232, 255));
        setBorder(new TitledBorder("Panel de Información"));

        inicializarComponentes();
        setVisible(true);
    }

    public void inicializarComponentes() {
        txtAreaInformacion = new JTextArea();
        txtAreaInformacion.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaInformacion, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);

    }

    public JTextArea getTxtAreaInformacion() {
        return txtAreaInformacion;
    }

    public void setTxtAreaInformacion(JTextArea txtAreaInformacion) {
        this.txtAreaInformacion = txtAreaInformacion;
    }
}
