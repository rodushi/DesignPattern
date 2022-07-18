
package decoratorPattern;


public class main {
    public static void main(String[] args) {
       Shape circle = new circle();
       Shape blueCircle = new BlueBorderDecorate(new circle());
       Shape bluerectangle = new BlueBorderDecorate(new rectangle());
       
       circle.draw();
        System.out.println("Normal Circle");
       blueCircle.draw();
        System.out.println("Blue Circle");
       bluerectangle.draw();
        System.out.println("Blue ractangle");
    }
}
