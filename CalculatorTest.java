package test.java;

import PostfixCalculator.PostfixCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testEvaluatePostfixExpression() {
        PostfixCalculator calculator = new PostfixCalculator();
        assertEquals(15, calculator.evaluatePostfixExpression("1 2 + 4 * 3 +"));
        assertEquals(18, calculator.evaluatePostfixExpression("6 2 3 + *"));
    }
}
