package exercise;

import example.Square;
import example.Tabla;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Joiners {

    public static <T> T fold(ArrayList<T> list, BinaryOperator<T> operator, Supplier<T> supplier) {

        T result = supplier.get(); //

        if(result instanceof String) {
           StringBuilder stringBuilder = new StringBuilder();
            for(T element: list) {
                stringBuilder.append(operator.apply(result, element));
            }
            return (T) stringBuilder.toString();

        } else {
            for(T element: list) {
                result = operator.apply(result, element);
            }

            return result;
        }
    }

}
