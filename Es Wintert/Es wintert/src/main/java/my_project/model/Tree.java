package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {


    public Tree(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        //Stamm und Blötter
        drawTool.setCurrentColor(new Color(58, 43, 4));
        drawTool.drawFilledRectangle(x-20,y-50,40,100);
        drawTool.setCurrentColor(new Color(19, 52, 19));
        drawTool.drawFilledTriangle(x-50,y,x,y-100,x+50,y);
        drawTool.drawFilledTriangle(x-50,y-75,x,y-150,x+50,y-75);
        //Weihnachtskugeln
        drawTool.setCurrentColor(new Color(255, 226, 0));
        drawTool.drawFilledCircle(x,y-150,10);

        drawTool.setCurrentColor(new Color(30, 183, 30));
        drawTool.drawFilledCircle(x-50,y-75,10);
        drawTool.setCurrentColor(new Color(229, 16, 16));
        drawTool.drawFilledCircle(x-50,y,10);

        drawTool.setCurrentColor(new Color(0, 109, 255));
        drawTool.drawFilledCircle(x+50,y,10);
        drawTool.setCurrentColor(new Color(229, 112, 16));
        drawTool.drawFilledCircle(x+50,y-75,10);

    }

    public void update(double dt){

    }

}
