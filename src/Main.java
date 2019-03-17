public class Main {

    public static void main(String[] args) {


        Animal animalFirst = new Animal("Tygrys", 9, "ssak");
        Animal animalSecond = new Animal("Rekin", 15, "ryba");
        Animal animalThird = new Animal("Niedzwiedz", 20, "ssak ");
        Animal animalFourth = new Animal("Wiewiórka", 7, "kręgowce");
        Animal animalFifth = new Animal("Orzeł", 20, "ptaki");

        Zoological zoo = new Zoological();

        zoo.addAnimal(animalFirst);
        zoo.addAnimal(animalSecond);
        zoo.addAnimal(animalThird);
        zoo.addAnimal(animalFourth);
        zoo.addAnimal(animalFifth);
        System.out.println(zoo);

        System.out.println("");

        zoo.oldestAnimals();
        zoo.youngestAnimals();
        System.out.println("Oldest animal: " +zoo.getOldest());
        System.out.println("Youngest animal: "+zoo.getYoungest());

        System.out.println("Animal Count: "+zoo.animalCount());

        System.out.println("" + zoo.getAnimalCard("Tygrys"));

        System.out.println(zoo.speciesAnimals());
    }

}
