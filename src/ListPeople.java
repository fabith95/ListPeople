/*Cookie: Given a List of Person, please determine how many male and females Person are in the list.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPeople {

    public static void main(String[] args) {
        List<Persons> listPersons = new ArrayList<>();

        listPersons.add(new Persons("DANIEL", 20));
        listPersons.add(new Persons("JUAN", 30));
        listPersons.add(new Persons("ESTEBAN", 15));
        listPersons.add(new Persons("JULIAN", 18));

        Collections.sort(listPersons, Comparator.comparing(Persons::getAge));

        listPersons.forEach(lista -> System.out.println(lista.toString()));

    }



}






