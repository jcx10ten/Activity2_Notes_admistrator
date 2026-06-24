package co.edu.udistrital.view;


import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {
    private PanelImagen panelImagen;
    private PanelEstudiantes panelEstudiantes;
    private PanelBotones panelBotones;
    private PanelInformacion panelInformacion;

    public VentanaPrincipal() {
        setTitle("Sistema de gestión de estudiantes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(new Color(48, 77, 110));
        getContentPane().setLayout(new BorderLayout(10, 10));
        ((JComponent) getContentPane()).setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
        inicializarComponentes();
    
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true); 
    }

    public void inicializarComponentes() {
        panelImagen = new PanelImagen();
        panelEstudiantes = new PanelEstudiantes();
        panelBotones = new PanelBotones();
        panelInformacion = new PanelInformacion();

        panelInformacion.setPreferredSize(new java.awt.Dimension(800, 150));
        panelBotones.setPreferredSize(new java.awt.Dimension(150, 150));
        JPanel panelSuperiorAgrupador = new JPanel(new GridLayout(1, 3, 10, 10));
        panelSuperiorAgrupador.setBackground(new Color(48, 77, 110));

        panelSuperiorAgrupador.add(panelImagen);
        panelSuperiorAgrupador.add(panelEstudiantes);

        getContentPane().add(panelSuperiorAgrupador, BorderLayout.CENTER);
        getContentPane().add(panelInformacion, BorderLayout.SOUTH);
        getContentPane().add(panelBotones, BorderLayout.EAST);
    }


    public PanelImagen getPanelImagen() {
        return panelImagen;
    }

    public PanelEstudiantes getPanelEstudiantes() {
        return panelEstudiantes;
    }

    public PanelBotones getPanelBotones() {
        return panelBotones;
    }

    public PanelInformacion getPanelInformacion() {
        return panelInformacion;
    }

    public void setPanelImagen(PanelImagen panelImagen) {
        this.panelImagen = panelImagen;
    }

    public void setPanelEstudiantes(PanelEstudiantes panelEstudiantes) {
        this.panelEstudiantes = panelEstudiantes;
    }

    public void setPanelBotones(PanelBotones panelBotones) {
        this.panelBotones = panelBotones;
    }

    public void setPanelInformacion(PanelInformacion panelInformacion) {
        this.panelInformacion = panelInformacion;
    }
}  
