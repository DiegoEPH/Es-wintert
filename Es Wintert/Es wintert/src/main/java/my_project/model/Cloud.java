package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    public Cloud(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.white);
        drawTool.drawFilledCircle(x,y,65);
        drawTool.drawFilledCircle(x+45,y+35,65);
        drawTool.drawFilledCircle(x-45,y+35,65);




    }

        public void update(double dt){
            x = x+50*dt;

            if(x>665){
                x=-100;
}
    }
}
