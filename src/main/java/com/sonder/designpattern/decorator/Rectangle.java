package com.sonder.designpattern.decorator;

/**
 * .长方形
 *
 * @author :Lik
 * @createDate :2020/5/30 16:26
 * @since :JDK1.8
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

}
