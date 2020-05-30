package com.sonder.designpattern.decorator;

/**
 * .
 *
 * @author :Lik
 * @createDate :2020/5/30 16:30
 * @since :JDK1.8
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
