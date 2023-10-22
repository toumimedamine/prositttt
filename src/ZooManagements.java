
public class ZooManagements {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();

        Zoo zoo = new Zoo();

        // Ajouter des pingouins au zoo
        Penguin penguin1 = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 30.2f);
        Dolphin dolphin1 = new Dolphin("Spheniscidae", "Skipper", 3, true, "Ocean", 22.3f);
        Dolphin dolphin2 = new Dolphin("Spheniscidae", "Skipper", 3, true, "Ocean", 20.3f);
        zoo.addPenguin(penguin1);
        zoo.addPenguin(penguin2);
        zoo.addDolphin(dolphin1);
        zoo.addDolphin(dolphin2);
        zoo.displayNumberOfAquaticsByType();
        }}
/*
        // Obtenir la profondeur maximale de nage des pingouins
        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("Profondeur maximale de nage des pingouins dans le zoo : " + maxDepth + " mètres");

        // Test de l'égalité entre aquatic1 et aquatic2
        System.out.println("aquatic1 est égal à aquatic2 : " + aquatic1.equals(aquatic2));

        // Test de l'égalité entre aquatic1 et aquatic3
        System.out.println("aquatic1 est égal à aquatic3 : " + aquatic1.equals(aquatic3));
    }
}
*/

       /* //Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terresterial terrestrial = new Terresterial("panda", "Carla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);


        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        Zoo zooo = new Zoo();

        // Ajouter des animaux aquatiques au zoo
        Aquatic fish1 = new Aquatic("Spheniscidae", "Skipper", 3, true, "Ocean");
        Aquatic fish2 = new Aquatic("Delphinidae", "Flipper", 5, true, "Ocean");

        zooo.addAquaticAnimal(fish1);
        zooo.addAquaticAnimal(fish2);
        // Afficher les animaux aquatiques dans le zoo
        zooo.displayAquaticAnimals();
        zooo.AquaticAnimalsSwim();*/
