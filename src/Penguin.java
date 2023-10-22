public class Pinguin extends Aquatic {
   private Float swimmingDepth;

    public Pinguin(){}
    public Pinguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth)
    {
        super(name,family,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
}

