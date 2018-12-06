package com.gabriel.shade;

import java.lang.reflect.Constructor;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Testing");
        try {
            Class es = Class.forName("com.bgc.bgc2.ifix.quickfix.QfjEngine");
            Constructor<?>[] conlist = es.getDeclaredConstructors();
            for(Constructor constructor : conlist) {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
