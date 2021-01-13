import org.junit.jupiter.api.Test;
import sk.kosickaacademic.simon.personalid.Task;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Task task = new Task();
        assertEquals(0, task.Sum(0, 0));
        assertEquals(0, task.Sum(5, -5));
        assertEquals(-10, task.Sum(10, -20));
        assertEquals(89890, task.Sum(232414, -142524));
        assertEquals(150, task.Sum(200, -50));
    }

    @Test
    void isPrimeNumber() {
        Task task = new Task();
        assertTrue(task.isPrimeNumber(7));
        assertTrue(task.isPrimeNumber(97));
        assertTrue(task.isPrimeNumber(11));
        assertTrue(task.isPrimeNumber(997));
        assertTrue(task.isPrimeNumber(859844473));
    }

    @Test
    void isRectangularTriangle() {
        Task task = new Task();
        assertTrue(task.isRectangularTriangle(3, 4, 5));
    }

    @Test
    void reverseText() {
        Task task = new Task();
        assertEquals("CBAAAA", task.reverseText("AAAABC"));
    }
}