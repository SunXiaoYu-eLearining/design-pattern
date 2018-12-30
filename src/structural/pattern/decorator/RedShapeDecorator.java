package structural.pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoretedShape){
        super(decoretedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
