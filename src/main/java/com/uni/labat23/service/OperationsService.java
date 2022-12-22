package com.uni.labat23.service;
import com.uni.labat23.entity.models.Numbers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OperationsService {
    public static double calculate(Numbers numbers, char op) {
        System.out.println("OperationService calculate");
        System.out.println(numbers);
        System.out.println(op);
        return switch (op) {
            case '+' -> plus(convert(numbers.getNum1(), numbers.getNum2(), numbers.getSystem()));
            case '-' -> minus(convert(numbers.getNum1(), numbers.getNum2(), numbers.getSystem()));
            case '*' -> multiplication(convert(numbers.getNum1(), numbers.getNum2(), numbers.getSystem()));
            case '/' -> division(convert(numbers.getNum1(), numbers.getNum2(), numbers.getSystem()));
            default -> 0.0;
        };
    }

    public static int plus(Numbers numbers) {
        System.out.println("plus operation");
        System.out.println(numbers.getNum1());
        System.out.println(numbers.getNum2());
        return numbers.getNum1() + numbers.getNum2();
    }

    public static int minus(Numbers numbers) {
        return numbers.getNum1() - numbers.getNum2();
    }

    public static int multiplication(Numbers numbers) {
        return numbers.getNum1() * numbers.getNum2();
    }

    public static double division(Numbers numbers) {
        return (double)numbers.getNum1() / numbers.getNum2();
    }

    public static Numbers convert(int num1, int num2, int system) {
        Numbers numbers = new Numbers();
/*        if (system == 2) {
            numbers.setNum1(Numbers.toBinary(num1));
            numbers.setNum2(Numbers.toBinary(num2));
        }
        if (system == 8) {
            numbers.setNum1(Numbers.toOctalString(num1));
            numbers.setNum2(Numbers.toOctalString(num2));
        }
        if (system == 16) {
            numbers.setNum1(Numbers.toHexString(num1));
            numbers.setNum2(Numbers.toHexString(num2));
        }*/
        if (system == 10 || system == 0 || system == 2 || system == 16) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
        }
        return numbers;
    }
}
