package extend;

public class Father {
    protected String name;
    protected int age;
    Father(){
    }
    Father(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(String food){
        System.out.println(this.name + " is eating " + food);
    }
}
