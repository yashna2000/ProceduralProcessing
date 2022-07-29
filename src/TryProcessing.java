import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x=0;
    public static void main(String[] args) {

        PApplet.main("TryProcessing" ,args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }



    @Override
    public void draw() {
       // paintwhite();
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(x/5, HEIGHT/5,10,10);
        x++;

    }
    private void drawCircle2() {
        ellipse(2*x/5, (2*HEIGHT)/5,10,10);
        x++;

    }
    private void drawCircle3() {
        ellipse(3*x/5, (3*HEIGHT)/5,10,10);
        x++;

    }

    private void drawCircle4() {
        ellipse(4*x/5, (4*HEIGHT)/5,10,10);
        x++;

    }

}