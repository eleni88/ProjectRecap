package projectrecap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eleni
 */
public class ProjectRecap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dog d1 = new Dog("Jack", 3);
        Dog d2 = new Dog("Hector", 5);
        
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        

        List<Dog> dog = new ArrayList();
        dog.add(d1);
        dog.add(d2);
        
        for(Dog d:dog){
            System.out.println(d.getAge()); //μας δίνει την ηλικία κάθε σκυλιού
        }                                   //στη λίστα.

        Person p1 = new Person("John", 25);
        p1.setSkyli(d1);//δίνουμε στον person p1 ένα σκυλάκι d1.
        //έχουμε ξεχωριστό constractor για τις τιμές του person  και του 
        //προσθέτουμε τον σκύλο με το setter-getter.
        //θα μπορούσαμε να φτιάξουμε και constractor που να τα σετάρει και τα τρία μαζί.
        Person p2 = new Person("Maria", 30);
        //p2.setSkyli(d2);
       
        List<Person>person =  new ArrayList();
        person.add(p1);
        person.add(p2);
        for(Person p:person){
//            System.out.println(p.getName()+ " "+p.getAge());
//            System.out.println(p.getSkyli());
            if(p.getSkyli()!=null){
            System.out.println("Person " + p.getName() + " has dog " + p.getSkyli().getName());
        }else{
                System.out.println("Person " + p.getName() + " has  not a dog");
            }
        }
        
        
       Team t1 = new Team("football");
       t1.setPlayers(person);
       
       Person p3 = new Person("Andy",19);
      t1.addPlayer(p3);
      
      Dog d3 = new Dog("Russel",1);
      p3.setSkyli(d3);
        System.out.println();
        
        List<Person> players = t1.getPlayers();
        for(Person human:players){
            
            if(human.getSkyli()!=null){
            System.out.println("Person " + human.getName() + " has dog " + human.getSkyli().getName());
        }else{
                System.out.println("Person " + human.getName() + " has  not a dog");
            }
        }
          //t1.getPlayers().get(1).getSkyli() έτσι μπορούμε να εκτυπώσουμε συγκεκριμένο
          //σκυλί συγκεκριμένου παίκτη
    }
    

}
