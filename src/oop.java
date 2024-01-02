 class oop extends Hello {


    //class convert record
    private final String name;
    private final String position;
    private final float salary;
    private int myCount;


    // Constructor -------------------------
//class convert Record ================================
    public oop(String name, String position, float salary){
        this.name = name;
        this.position = position;
        this.salary =salary;
         myCount = count+2000;
        propertyOne();

    }

    public oop(String name, String lastname, String position, float salary, int absent){
        this.name = name+" "+lastname;
        this.position = position;
        this.salary = salary-(absent*300);
         sayHello();

    }

// java setter Function for Class Object String name
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setPosition(String position){
//        this.position = position;
//    }
//
//    public void setSalary(float salary) {
//        this.salary = salary;
//    }




// java Getter function of Class and Objects -----------
    public String getName() {
        return name;
    }

    public String getPosition(){
        return position;
    }

    public float getSalary() {
        return salary;
    }

    public int getmyCount(){
        return myCount;
    }


    // how to set Setter and getter -----------------------





}
