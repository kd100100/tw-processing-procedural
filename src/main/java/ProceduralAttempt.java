import processing.core.PApplet;

public class ProceduralAttempt extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int frame = 0;

    public static void main(String[] args) {
        PApplet.main("ProceduralAttempt", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        moveBalls(1);
        moveBalls(2);
        moveBalls(3);
        moveBalls(4);
        frame++;
    }

    private void moveBalls(int ballNumber) {
        ellipse(frame*ballNumber, HEIGHT*((float)ballNumber/5), DIAMETER, DIAMETER);
    }
}
