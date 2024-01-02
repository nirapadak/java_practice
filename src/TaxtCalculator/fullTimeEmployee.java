package TaxtCalculator;

public class fullTimeEmployee extends employee {


    public fullTimeEmployee(String name, String position, float salary, int dateOfBirth) {
        super(name, position, salary, dateOfBirth);
    }

    @Override
    public float calculate() {
        return getSalary()*5/100;
    }

    @Override
    public int calculateAge() {
        return getDataOfBirth()-2024;
    }

    @Override
    public int actualSalary() {
        return (int) (getSalary()-calculate());
    }


}
