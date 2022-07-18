
package decoratorPattern;


public class BlueBorderDecorate extends shapeDecorator{
    
    public BlueBorderDecorate(Shape decorateShape) {
        super(decorateShape);
    }
    
     @Override
    public void draw() {
        decorateShape.draw();
        setBlueBorder(decorateShape);
    }

    private void setBlueBorder(Shape decorateShape) {
        System.out.println("Border:Blue");
       }
    
    
}
