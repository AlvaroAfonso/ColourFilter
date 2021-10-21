package alvaroycarlos.imagencolores;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.Dimension;
import java.awt.Image;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Lienzo extends JPanel {
    private BufferedImage imagen = null;
    private BufferedImage imagenlogo = null;

    private static boolean rojo = true;
    private static boolean verde = true;
    private static boolean azul = true;
    private int posicion = 2;

    public Lienzo() {
        try {
            imagen = ImageIO.read(new URL("https://data.1freewallpapers.com/download/rog-rgb-spectrum-4k-1024x768.jpg"));
            this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
            imagenlogo = ImageIO.read(new URL("https://cdn-icons-png.flaticon.com/128/4406/4406170.png"));
            imagenlogo.getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void almacenaColor(boolean rojo1,boolean verde1,boolean azul1){
        rojo = rojo1;
        verde = verde1;
        azul = azul1;
        this.repaint();
    }
    public void posicionLogo(int posicion){
        this.posicion= posicion;
        this.repaint();
    }
    
    public BufferedImage color(BufferedImage imagen1, boolean rojo,boolean verde,boolean azul ){
        return UtilsPractica5.seleccionarComponentes(imagen1, rojo, verde, azul);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        BufferedImage resuelta = color(imagen,rojo,verde,azul);
        g.drawImage(resuelta, 0, -100, null);
        switch (posicion){
            case 1: 
                g.drawImage(imagenlogo, 0, 0, null);
                break;
            case 2:
                g.drawImage(imagenlogo, 895, 0, null);
                break;
            case 3:
                g.drawImage(imagenlogo, 0, 472, null);
                break;
            case 4:
                g.drawImage(imagenlogo, 895, 472, null);
                break;
        }
    }
    
}
