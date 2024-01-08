package CalculatQuantity;

public abstract class Volume {
    private final int height;
    private final int wight;
    private final float range;
    private final int threeArm;


    public abstract int regtrangl();
    public abstract float carcle();
    public abstract double tragle();

    protected Volume(int height, int wight, float range, int threeArm){
        this.height = height;
        this.wight = wight;
        this.range = range;
        this.threeArm = threeArm;
    }


    public int getThreeArm() {
        return threeArm;
    }

    public float getRange() {
        return range;
    }

    public int getWight() {
        return wight;
    }
    public int getHeight(){
        return height;
    }

    public void TitleText(){
        System.out.println("\n title: ");
    }



}
