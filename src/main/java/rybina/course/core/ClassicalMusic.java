package rybina.course.core;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music{

    public void initMethod() {
        System.out.println("init");
    }

    public void destroyMethod() {
        System.out.println("destroy");
    }
    @Override
    public String getSong() {
        return "Classic Music";
    }
}
