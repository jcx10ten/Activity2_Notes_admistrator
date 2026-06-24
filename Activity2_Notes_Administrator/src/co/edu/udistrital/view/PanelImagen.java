package co.edu.udistrital.view;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;


public class PanelImagen extends JPanel {

    private JLabel labelImagen;

    public PanelImagen() {
        setLayout(new BorderLayout(0, 10));
        setBackground(new Color(212, 232, 255));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inicializarComponentes();
        setVisible(true);
    }

    public void inicializarComponentes() {
       ImageIcon icon = new ImageIcon(getClass().getResource("/co/edu/udistrital/view/imagenes/logo.png"));

        Image imagenEscalada = icon.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        labelImagen = new JLabel();
        labelImagen.setIcon(iconoEscalado);
    
        labelImagen.setHorizontalAlignment(JLabel.CENTER);
        labelImagen.setVerticalAlignment(JLabel.CENTER);
        
        add(labelImagen, BorderLayout.CENTER);
    }
    
    
}
