package my_project.model;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Kugel (einen Kreis), der in eine Schlange eingefügt werden soll. Dabei muss jeder QueueBall immer
 * seinen Vorgänger kennen, damit er zu ihm Abstand halten kann.
 */
public class Haus extends GraphicalObject {

    /**
     * Erzeugt einen neuen QueueBall
     * @param x Startposition x
     * @param y Startposition y
     */
    public Haus(double x, double y){
        this.x = x;
        this.y = y;
    }


    /**
     * Selbsterklärend: zeichnet den die optische Repräsentation eines Ball-Objekts. Wird vom Framework automatisch aufgerufen (jeden Frame 1x).
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(128, 99, 67));
        drawTool.drawFilledRectangle(x,y,200,100);
        drawTool.setCurrentColor(new Color(87, 29, 21));
        drawTool.drawFilledRectangle(x+50,y-50,20,40);
        drawTool.setCurrentColor(new Color(54, 40, 11));
        drawTool.drawFilledTriangle(x,y,x+100,y-50,x+200,y);
        drawTool.setCurrentColor(new Color(49, 38, 24));
        drawTool.drawFilledRectangle(330,y+40,40,60);



    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){

    }

}