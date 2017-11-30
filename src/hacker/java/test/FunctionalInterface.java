package hacker.java.test;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void main(String[] args) {
        Supplier<String> s1 = String::new;
        Supplier<String> s2 = () -> "hola";

        System.out.println(s1.get());
        System.out.println(s2.get());

        FunctionalInterface fun = new FunctionalInterface();
        Consumer<String> c1 = fun::saludarInstancia;
        Consumer<String> c2 = x -> fun.saludarInstancia(x+" lambda timeeee ");

        c1.accept("jelouuuu");
        c2.accept("jelouuuu");

        Predicate<String> p1 = String::isEmpty;



    }

    public static void saludar(String saludo){
        System.out.println(saludo + "os saludo canallas");
    }


    public void saludarInstancia(String saludo){
        System.out.println(saludo + " somos instancia ");
    }

}
