import example.Square;
import example.Tabla;
import exercise.Joiners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {


    public static void method() {
        new Square().draw();

        Tabla tabla1 = new Tabla() {
            @Override
            public void draw() {
                System.out.println("disenez triunghi !!");
            }
        };

        Tabla tabla2 = () -> System.out.println("Disenez cerc!!!");
    }

    public static void main(String[] args) {
//
//        ArrayList<String> arrayListString = new ArrayList<>();
//        arrayListString.add("Hello ");
//        arrayListString.add("World");
//
//        ArrayList<Integer> arrayListInteger = new ArrayList<>();
//        arrayListInteger.add(1);
//        arrayListInteger.add(4);
//
//        String result = Joiners.fold(arrayListString, (a, b) -> a.concat(b), () -> "" );
//        Integer result2 = Joiners.fold(arrayListInteger, (a, b) -> a + b, () -> 0);
//
//        System.out.println(result);
//        System.out.println(result2);


//        Tabla tabla = () -> System.out.println("Disenez triunghi !!");


//        Tabla tabla = new Square();
//
//        tabla.draw();
//
//        Tabla tabla1 = new Tabla() {
//            @Override
//            public void draw() {
//                System.out.println("disenez triunghi !!");
//            }
//        };
//
//        Tabla tabla2 = () -> System.out.println("Disenez cerc!!!");
//
//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equals("b");
//            }
//        };
//
//
//        Arrays.asList("a", "b").stream()   // a, b
//                .peek((s) -> System.out.println(s)) // a, b   // intermediar
//                .filter((s) -> s.equals("b")) // b   intermediar
//                .map((s) -> s.toUpperCase()) // B
//                .peek((s) -> System.out.println(s)) // B // consumer.accept(s)
//                .collect(Collectors.toList()); // B
//
        Consumer<String> stringConsumer = s -> System.out.println(s);  // deferred execution

        BiConsumer<String, Integer> biConsumer1 = (a, b) -> System.out.println(a + " " + b);

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + " " + integer);
            }
        };

        Predicate<String> pr = s -> s.length() == 3;

        boolean a = pr.test("abc");

        System.out.println(a);

        biConsumer.accept("Nr casa: ",  42);

        Predicate<String> predicate = (a) -> a.contains("C");

        boolean isTrue = predicate.test("AbeCedar"); // true

        BiPredicate<String, String> predicate2 = (a, b) -> a.equals(b);

        boolean isTrue2 = predicate2.test("AbeCedar", "AbeCedar"); // true

//
//        System.out.println(" ------------------ ");
//
//        stringConsumer.accept("Hello World");


//        Supplier<String> supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "Citesc date din fisier /C:DOCUIMENTS/FILE2.TXT"; // deffered execution
//            }
//        };
//
//        String sr2 = supplier.get();
//
//        Supplier<String> supplier2 = () -> "Citesc date din fisier /C:DOCUIMENTS/FILE2.TXT"; // deffered execution
//
//        String sr = supplier2.get();
//
//        System.out.println(" ------------------ ");
//
//        if("file.txt".equals("file.txt")) {
//            System.out.println(supplier.get());
//
//        } else {
//            // nu citi
//        }

    }
}