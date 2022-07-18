
package decoratorPattern;


public abstract class shapeDecorator implements Shape{
    protected Shape decorateShape;
    
    public shapeDecorator(Shape decorateShape){
        this.decorateShape = decorateShape;
    }
    
    
     @Override
    public void draw() {
         decorateShape.draw();
    }
    
}
