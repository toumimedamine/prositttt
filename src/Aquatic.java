public non-sealed  abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public abstract void swim();
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    // Redéfinition de la méthode equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Même instance, donc considéré comme égal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Comparaison impossible si l'objet n'est pas une instance de la classe Aquatic
        }
        Aquatic other = (Aquatic) obj;
        return getName().equals(other.getName()) && getAge() == other.getAge() && habitat.equals(other.habitat);
    }



}
