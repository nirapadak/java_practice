public class Hello {
    public int count = 1000;


    public void sayHello(){
        System.out.println("Hello, Hi I am sayHello.");
    }

    public void propertyOne(){
        System.out.println("Hello, this is my private property");
        System.out.println(OutPrint("Nirapadak pal\n"));
        String funciton = OutPrint("Burget");
        System.out.println(funciton);
    }

    private String OutPrint(String name){
        return name;
    }

}
