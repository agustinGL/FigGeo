/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figgeo;

import java.awt.Graphics;

/**
 *
 * @author HERNANDEZ
 */
public class Dibujo {
    public static void HacerLinea (Graphics g, int x1, int y1, int x2, int y2)
    {
        g.drawLine(x1, y1, x2, y2);
    }
    
    public static void HacerCuadro (Graphics g, int x, int y, int ancho, int alto)
    {
        g.drawRect(x, y, ancho, alto);
    }
    
    public static void HacerCirculo (Graphics g, int x, int y, int x1, int y1)
    {
        g.drawOval(x, y, x1, y1);
    }
    
    public static void HacerRectangulo (Graphics g, int x, int y, int ancho, int alto)
    {
        g.drawRect(x, y, ancho, alto);
    }
    
    public static void HacerElipse (Graphics g, int x, int y, int x1, int y1)
    {
        g.drawOval(x, y, x1, y1);
    }
}
