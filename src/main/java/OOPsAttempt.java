import processing.core.PApplet;

class Ball {

    int xPosition, speed;

    public Ball(int speed) {
        this.xPosition = 0;
        this.speed = speed;
    }

    public int moveBall() {
        this.xPosition += this.speed;
        return this.xPosition;
    }

}

public class OOPsAttempt extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static Ball[] balls = new Ball[]{
            new Ball(1),
            new Ball(2),
            new Ball(3),
            new Ball(4)
    };

    public static void main(String[] args) {
        PApplet.main("OOPsAttempt", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(balls[0].moveBall(), 1*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(balls[1].moveBall(), 2*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(balls[2].moveBall(), 3*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(balls[3].moveBall(), 4*HEIGHT/5, DIAMETER, DIAMETER);
    }
}
