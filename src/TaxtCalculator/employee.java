package TaxtCalculator;

public abstract class employee {
    private final String name;
    private final String position;
    private final float salary;

    private final int dataOfBirth;

    public  abstract float calculate();
    public abstract int calculateAge();
    public abstract int actualSalary();

    protected employee(String name, String position, float salary, int dataOfBirth){
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dataOfBirth = dataOfBirth;
    }


    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public float getSalary(){
        return salary;
    }

    public int getDataOfBirth(){
        return dataOfBirth;
    }

    public void saySomething(){
        System.out.println("You are a Employee");
    }

}
