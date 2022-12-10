package Seminar6;
// Реализуйте 1 из вариантов класса Cat из 

import java.util.ArrayList;

// предыдущего задания, можно использовать 
// не все придуманные поля и методы. Создайте 
// несколько экземпляров этого класса, выведите
//  их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль
//  объекта типа Cat, выводилась его кличка, цвет 
//  и возраст (или другие параметры на ваше усмотрение).

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class cat {
    String name;
    Integer number;
    Double weight;
    List<String> therapy;
    String colour;
    Double length;
    String[] colours = { "черный", "белый", "рыжий" };

    cat(String input_name, Integer input_number, Double input_weight) {
        therapy = new ArrayList<String>();
        name = input_name;
        number = input_number;
        weight = input_weight;
        Random random = new Random();
        colour = colours[random.nextInt(0, 3)];
    }

    public String toString() {
        return name + " " + number + " " + weight + " " + colour;
    }

    public void create_note(String input_note) {
        therapy.add(input_note);
    }

    public void print_notes() {
        for (int i = 0; i < therapy.size(); i++) {
            System.out.println(therapy.get(i));
        }
    }

    public Boolean isequal(cat o) {
        if (name.equals(o.name) && number == o.number && weight == o.weight && colour == o.colour) {
            return true;
        } else {
            return false;
        }
    }
    public int hashCode(){
        int hashCode = hashCode();
    }

}
