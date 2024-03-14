package bg.uni.fmi.lab01.baseline;

public class Person {
    private int age;
    private String name;

    Person(){
        name="No name";
        age=-1;
    }

    Person(String name){
        this.name=name;
        age=-1;
    }
    Person (String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if(age==-1){
            if(name=="No name"){
                return "I am John Doe";
            }else {
                return String.format("Hello, I am %s.",name);
            }
        }
        return String.format("Hello, I am %s. I am %d years old ",name, age);
    }
}
