import processing.core.PApplet;
import processing.core.PVector;

public class Main extends PApplet {
    Particle p;
    PVector gravity = new PVector(0, 0.4f);

    public void settings() {
        size(600,600);
    }

    public void setup() {
        p = new Particle(300, 300);
    }

    public void draw() {
        background(255);
        p.applyForce(gravity);
        p.update();
        p.draw(this);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}