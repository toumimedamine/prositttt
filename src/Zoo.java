public class Zoo {
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private Aquatic [] aquaticAnimals;
    private int aquaticAnimalCount;
    private Penguin[] penguins;
    private int penguinCount;
    private Dolphin[] dolphins;
    private Penguin[] Penguins;
    private int dolphinCount;
    private int PenguinCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
        aquaticAnimalCount = 0;
        penguins = new Penguin[10]; // Créer un tableau pour stocker les pingouins
        penguinCount = 0; //
        dolphins = new Dolphin[10]; // Supposons que vous avez un tableau pour les dauphins
        dolphinCount = 0;
        // Initialiser le compteur de pingouins à 0
    }


    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }
    public void addDolphin(Dolphin dolphin) {
        if (dolphinCount < 10) {
            dolphins[dolphinCount] = dolphin;
            dolphinCount++;
        } else {
            System.out.println("Le tableau de dauphins est plein. Impossible d'ajouter plus de dauphins.");
        }
    }
    // Méthode pour afficher le nombre de dauphins et de pingouins
    public void displayNumberOfAquaticsByType() {
        System.out.println("Nombre de dauphins dans le zoo : " + dolphinCount);
        System.out.println("Nombre de pingouins dans le zoo : " + penguinCount);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    // Méthode pour trouver la profondeur maximale de nage des pingouins
    public float maxPenguinSwimmingDepth() {
        if (penguinCount == 0) {
            return 0.0f; // Retourne 0 si aucun pingouin n'est présent dans le zoo
        }

        float maxDepth = penguins[0].getSwimmingDepth();
        for (int i = 1; i < penguinCount; i++) {
            float depth = penguins[i].getSwimmingDepth();
            if (depth > maxDepth) {
                maxDepth = depth;
            }
        }

        return maxDepth;
    }

    public void addPenguin(Penguin penguin) {
        if (penguinCount < 10) {
            penguins[penguinCount] = penguin;
            penguinCount++;
        } else {
            System.out.println("Le tableau de pingouins est plein. Impossible d'ajouter plus de pingouins.");
        }
    }
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticAnimalCount < 10) {
            aquaticAnimals[aquaticAnimalCount] = aquatic;
            aquaticAnimalCount++;
            System.out.println(aquatic + " a été ajouté au zoo.");
        } else {
            System.out.println("Le tableau est plein. Impossible d'ajouter plus d'animaux aquatiques.");
        }
    }

    public void displayAquaticAnimals() {
        System.out.println("Animaux aquatiques dans le zoo:");
        for (int i = 0; i < aquaticAnimalCount; i++) {
            System.out.println(aquaticAnimals[i].getName());
        }
    }
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public void AquaticAnimalsSwim() {
        System.out.println("Les animaux aquatiques dans le zoo nagent :");
        for (int i = 0; i < aquaticAnimalCount; i++) {
            aquaticAnimals[i].swim();
        }
    }
    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }
}


