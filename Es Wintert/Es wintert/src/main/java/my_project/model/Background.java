package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Kugel (einen Kreis), der in eine Schlange eingefügt werden soll. Dabei muss jeder QueueBall immer
 * seinen Vorgänger kennen, damit er zu ihm Abstand halten kann.
 */
public class Background extends GraphicalObject {

    /**
     * Erzeugt einen neuen QueueBall
     * @param x Startposition x
     * @param y Startposition y
     */
    public Background(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(29, 35, 54));
        drawTool.drawFilledRectangle(x,y,6000,6000);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledRectangle(x,y+500,6000,1000);
    }
}