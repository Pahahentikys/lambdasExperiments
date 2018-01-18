import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    private static class LambdaExample {
        static Integer mulFunc(Integer i) {
            return i * i;
        }
    }

    public static void main(String[] args) {

        // Ссылка на метод
//        Function<Integer, Integer> multi = LambdaExample::mulFunc;
//        System.out.println(multi.apply(20));

//        Empl empl1 = new Empl("kek", "kok", 100);
//
//        List<Empl> empls = new ArrayList<>();
//        empls.add(empl1);
//
//        empls.stream()
//                .map(Empl::getCash)
//                .forEach(System.out::println);


//        Function<Empl, Empl> emplFunction = n -> new Empl("kek", "kok", 100);
//        System.out.println(emplFunction.toString());

//        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
//                .filter(v -> v > 0)
//                .count();
//        System.out.println(count);

//        ArrayList<String> cities = new ArrayList();
//        cities.addAll(Arrays.asList("One", "Two", "Three"));
//        cities.stream()
//                .filter(s->s.length()==6)
//                .map(s -> s + " Это лямбды, чувак!")
//                .forEach(System.out::println);

//        Stream<Empl> emplStream = Stream.of(
//                new Empl("Nick", "Maers", 2000),
//                new Empl("Nick", "Hock", 15000),
//                new Empl("Nick", "Morrison", 25000),
//                new Empl("Nick", "Gersey", 350500)
//        );
//
//        emplStream
//                .filter(empl -> empl.getFirstName() == "Nick")
//                .filter(empl -> empl.getCash() == 2000)
//                .forEach(System.out::println
//        );


//        emplStream
////                .skip(3)
//                .limit(1)
//                .flatMap(empl -> Stream.of(
//                        String.format("Имя сотрудника: %s, фамилия сотрудника: %s, зп: %d", empl.getFirstName(), empl.getLastName(), empl.getCash()),
//                        String.format("Имя сотрудника: %s, фамилия сотрудника: %s, зп с надбавкой: %d", empl.getFirstName(), empl.getLastName(), empl.getCash() + 7000))
//                )
//                .forEach(System.out::println);

//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
//
//        Optional<Integer> res = integerStream
//                .reduce((x, y) -> x + y);
//        System.out.println(res.get());
//
//    }

        //Композитные функции

        Function<Integer, Integer> sum = i -> i + 2;
        Function<Integer, Integer> mul = i -> i * 2;

        Function<Integer, Integer> funSumAndMul = i -> sum.apply(mul.apply(i));
        System.out.println(funSumAndMul.apply(10));

        // 1. sum, 2. mul
        Function<Integer, Integer> funCompositionOne = sum.andThen(mul);
        System.out.println(funCompositionOne.apply(10));

        // 1. mul, 2. sum
        Function<Integer, Integer> funCompositionTwo = sum.compose(mul);
        System.out.println(funCompositionTwo.apply(10));


//        List<Integer> nums = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        System.out.println("Чётные числа:");
//        List<Integer> evens = new ArrayList<>();
//        for (int i : nums) {
//            if (i % 2 == 0)
//                evens.add(i);
//        }
//        System.out.println(evens);
//
//        System.out.println(nums
//                .stream()
//                .filter(i -> i % 2 == 0)
//                .collect(Collectors.toList())
//        );




    }
}
