package com.sonder.designpattern.decorator;

/**
 * .
 *
 * @author :Lik
 * @createDate :2020/5/30 16:57
 * @since :JDK1.8
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecortor redCircle = new RedShapeDecorator(new Circle());
        ShapeDecortor redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}
