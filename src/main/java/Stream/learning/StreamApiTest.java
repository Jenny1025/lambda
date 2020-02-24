package Stream.learning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamApiTest {

    public static void main(String[] args) {

        List<Integer> testNumberLists = new ArrayList<>();
        testNumberLists.add(12);
        testNumberLists.add(15);
        testNumberLists.add(45);
        testNumberLists.add(12);
        testNumberLists.add(67);
        testNumberLists.add(8);

        // Skip操作
        testNumberLists.stream().skip(3).forEach(System.out::println);

        // Skip及びlimit操作
        testNumberLists.stream().skip(2).limit(2).forEach(System.out::println);

        // 重複操作
        testNumberLists.stream().distinct().forEach(System.out::println);

        // get操作
        Optional optional = testNumberLists.stream().max((x, y) ->x-y);
        System.out.println(optional.get());

        // reduce(合計値)操作
        Optional optionalSum = testNumberLists.stream().reduce((sum,x) -> sum + x);
        System.out.println(optionalSum.get());
        
    }
}
