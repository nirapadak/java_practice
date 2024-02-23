package myInterfaceDetail;

public class Dog implements run{

    @Override
    public void myRun() {
        System.out.println("this is run function.");
    }

    @Override
    public String myAnimalRun() {
        String name = "nirapdak pal";
        return name;
    }
}
