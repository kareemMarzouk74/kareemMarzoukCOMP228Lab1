/*
In this exercise you will develop a Java application that allows the user to process game objects. Create a class named GameObject.
A game object should contain information about object center, velocity, object state (alive or dead), and object rotation.
The object center is defined by its x and y coordinates.

Provide a constructor that allows the user to initialize game object information.
Provide all getter methods. Provide a getGameObject method to return game object information in a nicely formatted string.

Write a driver class to test the GameObject class.  The driver class (main class) interacts with the user and calls GameObject methods to initialize or update the game object.

Use the methods of JOptionPane class for providing input/output in the driver class.
*/


public class GameObject {

    //Variables
    String center;
    int velocity;
    String state;
    double rotation;


    //Getter and Setter
    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    //Constructor
    public GameObject(String center, int velocity, String state, double rotation){
        this.center = center;
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }

    //getGameObject method
    public String getGameObject(){
        return "Center: " + center + "\n" + "Velocity: " + velocity + "\n" + "State: " + state + "\n" + "Rotation: " + rotation;
    }

}
