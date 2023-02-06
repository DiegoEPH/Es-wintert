package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Mond extends GraphicalObject {


    public Mond(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(147, 148, 147));
        drawTool.drawFilledCircle(x,y,60);
    }

    public void update(double dt){

    }

}
