package com.sonder.designpattern.decorator;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * .设计模式之装饰器模式：
 *     装饰器模式（Decortor Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *
 *     优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 *     缺点：多层装饰比较复杂
 */
@Service
@Controller
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

        Map<String,String> map = new HashMap<>(16);
        for (int i = 0;i<16;i++){
            map.put(String.valueOf(i),String.valueOf(i));
        }

        System.out.println(map);

    }

}
