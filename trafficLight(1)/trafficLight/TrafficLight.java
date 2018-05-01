import drawingTools.*;

/**
 * Write a description of class TrafficLight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficLight
{
    // instance variables
    private Circle red;
    private Circle yellow;
    private Circle green;
    private boolean stop;

    /**
     * Constructor for objects of class TrafficLight
     */
    public TrafficLight()
    {
        // Construct the circles
        // Set their color and make them visible
        // Set stop to be true;
        red = new Circle();
        yellow = new Circle();
        green = new Circle();
        stop = true;
        red.setPosition(200,200);
        yellow.setPosition(200,250);
        green.setPosition(200,300);
        red.changeColor("red");
        yellow.changeColor("black");
        green.changeColor("black");
        green.makeVisible();
        yellow.makeVisible();
        red.makeVisible();

    }
    /**
     * If the traffic light shows STOP, it changes to GO.
     * Use the pause method after each step
     * If the traffic light shows GO, it changes to STOP.
     */
    public void change() {
        // read the instructions for the user story 
        // of how this method should work
        if(stop==true){
            yellow.changeColor("yellow");
            pause();
            red.changeColor("black");
            yellow.changeColor("black");
            green.changeColor("green"); 
            stop=false;

        }else {
           green.changeColor("black");
           yellow.changeColor("yellow");
           pause();
           red.changeColor("red");
           yellow.changeColor("black");
           stop=true;
        }
    }

    /*
     * Do not change anything in the pause method
     */
    private void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
