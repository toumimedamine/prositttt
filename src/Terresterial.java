public final class Terresterial extends Animal{
   private int nbrLegs;
    public Terresterial(){

    }
    public Terresterial( String family, String name, int age, boolean isMammal,int nbrLegs){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
