import java.util.*;

public class Zoological {

    private Animal oldest;
    private Animal youngest;

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Optional <Animal> getAnimalCard (String name){
        for (Animal animal : animals) {
            if(animal.getName().equals(name)){
                return Optional.of(animal);
            }
        }
        return Optional.empty();
    }


    public Set<String> speciesAnimals (){
        Set<String> animalsSet = new HashSet<>();
        for (int i =0; i< animals.size(); i++){
            String species = animals.get(i).getSpecies();
            animalsSet.add(species);
        }
        return animalsSet;
    }


    public void oldestAnimals() {
        Animal temp = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getAge() > temp.getAge()) {
                temp = animal;
            }
        }
        this.oldest = temp;
    }

    public void youngestAnimals() {
        Animal temp = animals.get(0);
        for (Animal animal : animals) {
            if (animal.getAge() < temp.getAge()) {
                temp = animal;
            }
        }
        this.youngest = temp;
    }

    @Override
    public String toString() {
        return "Zoological{" +
                "oldest=" + oldest +
                ", youngest=" + youngest +
                ", animals=" + animals +
                '}';
    }

    public Animal getOldest() {
        return oldest;
    }

    public Animal getYoungest() {
        return youngest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public int animalCount() {
        return animals.size();
    }
}

