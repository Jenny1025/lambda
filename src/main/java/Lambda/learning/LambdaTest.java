package Lambda.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class LambdaTest {
    public static void main( String[] args ) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Benjmin");
        nameList.add("jack");
        nameList.add("en");

        List nameLists = nameList.stream().map(x -> "The student's name is " + x).collect(Collectors.toList());
        nameLists.forEach(System.out::println);



        // Use forEach
        for (String name: nameList) {
            if(name.length()>3) {
                System.out.println("The name use forEach " + name);
            }
        }

        // Use iterator
        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() > 3) {
                System.out.println("The name use iterator " + name);
            }
        }

        // Use lambda
        List list = nameList.stream().filter(x -> x.length()>5).collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}

