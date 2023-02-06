package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.*;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        Background b1 = new Background(0,0);
        viewController.draw(b1);
        //Haus
        Haus haus1 = new Haus(250,400);
        viewController.draw(haus1);
        //Mond
        Mond mond1 = new Mond(70,70);
        viewController.draw(mond1);
        //Wolken
        Cloud c1 = new Cloud(600,150);
        viewController.draw(c1);
        Cloud c2 = new Cloud(420,150);
        viewController.draw(c2);
        Cloud c3 = new Cloud(240,150);
        viewController.draw(c3);
        Cloud c4 = new Cloud(60,150);
        viewController.draw(c4);
        Cloud c5 = new Cloud(0,150);
        viewController.draw(c5);
        //Schnee
        Snow s1 = new Snow(50,200);
        viewController.draw(s1);
        Snow s2 = new Snow(50,250);
        viewController.draw(s2);
        Snow s3 = new Snow(50,300);
        viewController.draw(s3);
        Snow s4 = new Snow(50,350);
        viewController.draw(s4);
        Snow s5 = new Snow(50,400);
        viewController.draw(s5);
        Snow s6 = new Snow(50,450);
        viewController.draw(s6);
        //Tannenbaum
        Tree t1 = new Tree(100,500);
        viewController.draw(t1);


    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
