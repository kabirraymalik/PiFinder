import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Point extends StackPane {
    private Circle c = new Circle(10, Color.BLUE);
    public Point(){
        Random r = new Random();
        double x = r.nextDouble()*500;
        x += 700;
        double y = r.nextDouble()*500;
        y += 400;
        c.setTranslateX(x);
        c.setTranslateY(y);
    }
    public int isInside(){
        double b = Math.sqrt((c.getTranslateX()-950)*(c.getTranslateX()-950)+(c.getTranslateY()-650)*(c.getTranslateY()-650));
        if(b<250.0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
