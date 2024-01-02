package TaxtCalculator;

public class partTimeEmployee extends employee {


    public partTimeEmployee(String name, String position, float salary, int dataOfBirth) {
        super(name, position, salary, dataOfBirth);
    }

    @Override
    public float calculate() {
        return getSalary()*10/100;
    }

    @Override
    public int calculateAge() {
        return 2024-getDataOfBirth();
    }

    @Override
    public int actualSalary() {
        return (int)(getSalary()-calculate());
    }

    @Override
    public void saySomething() {
        super.saySomething();
        System.out.println("You are a Part time Employee");
    }
}
