public class Person2 {
    String name;
    int age;
    boolean married;

    public Person2(){
        /*name = "ivan";
        age = 30;
        married = false;*/
    }

    public Person2(String name){
        this.name = name;
    }
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person2(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public static void main(String[] args) {
        Person2 person1 = new Person2();
        //Person2 person = new Person2("Ivan", 30, false);
        Person2 person2 = new Person2("Ivan");
        System.out.println(person2.name);
        Person2 person3 = new Person2("Ivan", 30);
        System.out.println(person3.name + person3.age);
        Person2 person4 = new Person2("Ivan", 30, false);
        System.out.println(person4.name + person4.age + person4.married);

    }

}
