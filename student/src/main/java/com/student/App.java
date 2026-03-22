package com.student;

import com.klu.student.AppConfig;
import com.klu.student.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // XML-based IoC Container
        System.out.println("=== XML Configuration ===");
        ApplicationContext xmlCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student xmlCI = xmlCtx.getBean("studentCI", Student.class);
        System.out.println("Constructor Injection : " + xmlCI);

        Student xmlSI = xmlCtx.getBean("studentSI", Student.class);
        System.out.println("Setter Injection      : " + xmlSI);

        ((ClassPathXmlApplicationContext) xmlCtx).close();

        // Annotation-based IoC Container
        System.out.println("\n=== Annotation Configuration ===");
        AnnotationConfigApplicationContext annCtx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student annCI = annCtx.getBean("studentCI", Student.class);
        System.out.println("Constructor Injection : " + annCI);

        Student annSI = annCtx.getBean("studentSI", Student.class);
        System.out.println("Setter Injection      : " + annSI);

        annCtx.close();
    }
}
