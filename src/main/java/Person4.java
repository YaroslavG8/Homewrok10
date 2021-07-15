import java.util.Objects;


public class Person4 {
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    String name;
    int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
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
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Person4))
            return false;
        Person4 e = (Person4) obj;
        return e.getAge() == this.getAge() && e.getName() == this.getName();

    }

}


