// Ques1 : Create a Shape class with a method draw(). Derive two classes Circle and Square from Shape, each with their own implementation of the draw() method. Write a main method to demonstrate method overriding.

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape square = new Square();
        
        shape.draw(); 
        circle.draw();
        square.draw();   

    }
}