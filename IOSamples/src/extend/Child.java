package extend;

public class Child extends Father{
    Child(){
        super();
    }
    Child(String name, int age){
        super(name, age);
    }
    @Override
    public void eat(String food){
        System.out.println(this.name + " is plan to eat " + food);
    }
}
