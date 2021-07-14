public class Person {
    String name;
    int age;
    boolean married;

        public static void main(String[] args) {


            Person person = new Person();
            person.name = "Ivan";
            person.age = 26;
            person.married = true;

            System.out.println("Person with name " + person.name + " with age " +  person.age + " are married ? : " + person.married);

        }

    }


