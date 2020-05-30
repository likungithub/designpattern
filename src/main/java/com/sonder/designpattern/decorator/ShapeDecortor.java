package com.sonder.designpattern.decorator;

import org.springframework.http.codec.protobuf.ProtobufCodecSupport;

/**
 * .
 *
 * @author :Lik
 * @createDate :2020/5/30 16:31
 * @since :JDK1.8
 */
public abstract class ShapeDecortor implements Shape {

    protected Shape decoratedShape;

    public ShapeDecortor(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
