public class Person5 {
    String name;
    int age;
    double weight;

    public Person5(){
    }

    public Person5(String newName){
        name = newName;

    }

    public Person5(String newName, int newAge){
        name = newName;
        age = newAge;
    }

    public Person5(String newName, int newAge, double newWeight){
        name = newName;
        age = newAge;
        weight = newWeight;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public void setWeight(double newWeight){
        weight = newWeight;
    }


    public static void main(String[] args){
        Person5 person5 = new Person5();
        //System.out.println(person5.toString());
        Person5 person1 = new Person5("Ivan", 28, 98.8);
        System.out.println(person1.getName() + person1.getAge() + person1.getWeight());
        Person5 person2 = new Person5( "Ivan", 67);
        System.out.println(person2.getName() + person2.getAge());
        Person5 person3 = new Person5("Ivan");
        System.out.println(person3.getName());
        Person5[] mas = {person1, person2, person3};
        for (Person5 item: mas){
            System.out.println(item.name);
        }


        }
        }








