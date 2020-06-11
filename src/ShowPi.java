import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ShowPi extends AnchorPane {
    public static final int WIDTH = 1500;
    public static final int HEIGHT = 1000;
    double numPoints = 10000000;
    Point[] points = new Point[(int) numPoints];

    public ShowPi(){
        int n = 0;
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(20);
        gc.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 30));
        gc.fillText("Find Pi",25,25);
        Rectangle square = new Rectangle(500,500,Color.BLACK);
        square.setTranslateX(700);
        square.setTranslateY(400);
        Circle circle = new Circle(250, Color.RED);
        circle.setTranslateX(950);
        circle.setTranslateY(650);
        this.getChildren().addAll(canvas, square, circle);
        for(int i=0; i<numPoints; i++){
            Point p = new Point();
            points[i]=p;
            this.getChildren().addAll(p);
            n+=p.isInside();
        }
        Text t = new Text();
        t.setFont(Font.loadFont("file:src/Fonts/Philosopher-Bold.ttf", 30));
        t.setFill(Color.BLACK);
        t.setTranslateX(100);
        t.setTranslateY(300);
        System.err.println(n);
        double v = 4*(n/numPoints);
        System.err.println(v);
        t.setText(String.valueOf(v));
        this.getChildren().addAll(t);
    }
}
