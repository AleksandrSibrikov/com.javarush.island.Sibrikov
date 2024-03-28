package field;

import lifeform.LifeForm;
import lifeform.animal.Animal;
import lifeform.plant.Plant;

import java.util.*;

public class Location {
    private final int row;
    private final int column;
    private final List<Animal> animals;
    private final List<Plant> plants;


    public Location(int row, int column) { // установить значение строки и столбца для местоположения
        this.row = row;
        this.column = column;

        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }


    public void addAnimal(Animal animal) { // добавить животного в данное местоположение
        animal.setRow(row);
        animal.setColumn(column);

        animals.add(animal);
    }


    public void removeAnimal(Animal animal) { // удалить животное
        animals.remove(animal);
    }


    public void addPlant(Plant plant) { // добавить растение
        plant.setRow(row);
        plant.setColumn(column);
        plants.add(plant);
    }


    public void removePlant(Plant plant) { // удалить растение
        plants.remove(plant);
    }


    public List<Plant> getPlants() { // получить список растений
        return plants;
    }


    public List<Animal> getAnimals() { // получить список животных
        return animals;
    }


    public List<LifeForm> getLifeForms() {              // получить все формы жизни
        List<LifeForm> lifeForms = new ArrayList<>();
        lifeForms.addAll(animals);
        lifeForms.addAll(plants);
        return lifeForms;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
}
