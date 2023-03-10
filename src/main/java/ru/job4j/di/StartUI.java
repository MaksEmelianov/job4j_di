package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private Store store;

    /*public StartUI(Store store) {
        this.store = store;
    }*/

    public void add(String value) {
        store.add(value);
    }

    /*@Autowired
    public void setStore(Store store) {
        this.store = store;
    }*/

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
