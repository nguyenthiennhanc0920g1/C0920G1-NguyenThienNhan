package _07_abstract_class_and_interface.thuc_hanh;

import _07_abstract_class_and_interface.thuc_hanh.Animal.Animal;
import _07_abstract_class_and_interface.thuc_hanh.Animal.Chicken;
import _07_abstract_class_and_interface.thuc_hanh.Animal.Edible;
import _07_abstract_class_and_interface.thuc_hanh.Animal.Tiger;

import java.sql.Time;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Animal cho = new Tiger();
        Animal meo = new Chicken();
        cho = meo;
        Tiger ho = (Tiger) cho;
    }
}
