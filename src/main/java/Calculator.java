import java.util.stream.DoubleStream;

public class Calculator {
    static double add(double... operands) {
        System.out.println("call add(..)");
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        System.out.println("call multiply(..)");
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}
