package Homework15.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Animals {
    /**
     * Создать класс, который будет хранить в себе коллекцию с названиями животных.
     * Реализовать методы удаления и добавления животных по следующим правилам:
     * добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
     * объекта этого класса в main методе другого класса
     */
    List<String> animals = new LinkedList<>();
    public void delete(){
        animals.removeLast();
    }

    public List<String> getAnimals() {
        return animals;
    }

    public void setAnimals(List<String> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "animals=" + animals +
                '}';
    }

    public void add(String animal){
        animals.addFirst(animal);
    }
}
