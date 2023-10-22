public final class Terrestre extends Animal{
   private int nbrLegs;
    public Terrestre(){}
    public Terrestre(int nbrLegs,String family, String name, int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
