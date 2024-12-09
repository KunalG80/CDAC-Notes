import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    public String name;
    public int id;
    public int age;

    public Person(String name , int id, int age){
        this.name = name;
        this.id = id;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "Person={NAME="+ name+"ID="+id+"AGE="+age+"}";

    }
   
}

public class adressBook{
    private static List<Person> Persons = new ArrayList<>();
    private static void addPerson(Person p){
        Persons.add(p);
        System.out.println("added :"+ p);
    }

    private static void deletePerson(int id){
        Persons.removeIf(p-> p.id==id);
        System.out.println("deleted Person"+id);
    }
    private static void personList(){
        if(Persons.isEmpty()){
            System.out.println("List is empty");
        }else{
            for(Person e:Persons){
                System.out.println(e);
            }
        }

    }
     private static void sort() {
        Collections.sort(Persons, Comparator.comparingDouble(Person::getId));
    }


    public static void main(String[] args) {

        addPerson(new Person("saransh",45,21));
        addPerson(new Person("Shripad",35 , 22));
        addPerson(new Person("amit", 5, 23));
        System.out.println("Successfull added");
        deletePerson(5);
        sort();
        personList();
        sort();
        System.out.println("sort on the basis of ID");
        personList();
        
        
                
            }
        
}

   
        
