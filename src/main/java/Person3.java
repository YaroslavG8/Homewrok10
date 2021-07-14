public class Person3 {
    String name;
    int age;
    boolean married;
    @Override
    public String toString() {
        return "My name is " + name + ". I’m " + age + " years old. Am I married?\n" + married;

    }

        public static void main(String[] args) {
                Person3 person = new Person3();
                person.name = "Ivan";
                person.age = 26;
                person.married = true;
                System.out.println(person.toString());

        }

    }






