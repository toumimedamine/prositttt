public class Penguin extends Aquatic {
   private Float swimmingDepth;
 public float getSwimmingDepth(){return swimmingDepth;}
    public void setSwimmingDepth(){this.swimmingDepth=swimmingDepth;}
    public Penguin(){}
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth)
    {
        super(name,family,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("this penguin is swimming");
    }
}

