package test.java;

import PostfixCalculator.VectorStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPushPop() {
        VectorStack<Integer> stack = new VectorStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testPeek() {
        VectorStack<Integer> stack = new VectorStack<>();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    void testIsEmpty() {
        VectorStack<Integer> stack = new VectorStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
        