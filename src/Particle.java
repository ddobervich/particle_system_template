import processing.core.PApplet;
import processing.core.PVector;

public class Particle {
    // TODO: add attributes
    private float size;

    public Particle(float x, float y) {
        // TODO: initialize attributes
        size = 10;
    }

    public void update() {
        // update velocity and position
    }

    public void applyForce(PVector f) {
        // a force affects the acceleration
    }

    public void draw(PApplet window) {
        window.fill(0);
        window.ellipse(pos.x, pos.y, size, size);
    }
}
