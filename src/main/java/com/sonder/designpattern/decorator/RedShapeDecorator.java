package com.sonder.designpattern.decorator;

import com.sonder.designpattern.decorator.Shape;
import com.sonder.designpattern.decorator.ShapeDecortor;

/**
 * .
 *
 * @author :Lik
 * @createDate :2020/5/30 16:49
 * @since :JDK1.8
 */
public class RedShapeDecorator extends ShapeDecortor {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

}
