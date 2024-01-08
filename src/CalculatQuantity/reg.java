package CalculatQuantity;

public class reg extends Volume{
    public reg(int height, int wight, float range, int threeArm) {
        super(height, wight, range, threeArm);
    }

    @Override
    public int regtrangl() {
        return getHeight()*getWight()*getThreeArm();
    }

    @Override
    public float carcle() {
        int rage = (int) (getRange()*2);
        return (float) (3.14*rage*getHeight());
    }

    @Override
    public double tragle() {
        return (4/3)*3.14*getRange();
    }

    @Override
    public void TitleText() {
        super.TitleText();
        System.out.println(" Call One");
    }
}
