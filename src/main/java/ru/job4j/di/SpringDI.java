package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        /*context.register(Store.class);
        context.register(StartUI.class);*/
        context.scan("ru.job4j.di");
        context.refresh();
        /*StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr");
        ui.add("Maks");
        ui.print();*/
        Store store = context.getBean(Store.class);
        store.add("Petr");
        store.add("Maks");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);
    }
}
