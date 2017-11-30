package hacker.java.test;

import java.util.ArrayList;
import java.util.List;
interface Fly{

}

public class Bird implements Fly{
}

class Sparrow extends Bird { }

class test {
    public static void main(String[] args) {
        List<? extends Fly> birds = new ArrayList<>();
        // birds.add(new Sparrow()); // DOES NOT COMPILE
        // birds.add(new Bird()); // DOES NOT COMPILE
    }
}