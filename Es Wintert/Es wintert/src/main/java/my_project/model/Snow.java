package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snow extends GraphicalObject {

    public Snow(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.white);
        drawTool.drawFilledCircle(x, y, 20);
        drawTool.drawFilledCircle(x+70, y, 20);
        drawTool.drawFilledCircle(x+140, y, 20);
        drawTool.drawFilledCircle(x+210, y, 20);
        drawTool.drawFilledCircle(x+280, y, 20);
        drawTool.drawFilledCircle(x+350, y, 20);
        drawTool.drawFilledCircle(x+420, y, 20);
        drawTool.drawFilledCircle(x+490, y, 20);
        drawTool.drawFilledCircle(x+560, y, 20);


    }
    public void update(double dt){
        y = y+50*dt;
        if(y>530){
            y=200;



}
}
}
