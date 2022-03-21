package core.basesyntax;

public class Rectangle extends Figure implements FigureDetails{
    String name = String.valueOf(FigureE.RECTANGLE);
    int side1;
    int side2;

    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public void getArea() {
        System.out.println(side1 * side2);
    }

    @Override
    public void getDetails() {
        System.out.print(color + " " + name + " with sides " + side1 + " and " + side2 + " and area of ");
        getArea();
    }
}
