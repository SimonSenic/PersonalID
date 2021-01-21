import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.kosickaacademic.simon.personalid.Task;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task t;

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

    @Test
    void areEvenNumbers() {
        Task task = new Task();
        assertTrue(task.areEvenNumbers(new int[]{2, 4, 6, 8}));
    }

    @Test
    void isPalindromeNumber() {
        Task task = new Task();
        assertTrue(task.isPalindromeNumber(3));
        assertTrue(task.isPalindromeNumber(5));
        assertTrue(task.isPalindromeNumber(101));
        assertTrue(task.isPalindromeNumber(202));
    }

    @Test
    void countSpaces() {
        Task task = new Task();
        assertEquals(1, task.countSpaces("Hello world."));
        assertEquals(5, task.countSpaces("This text doesn't make a sense."));
    }

    @BeforeEach
    void setup(){
        t = new Task();
        System.out.println("Test started.. ");
    }

    @AfterEach
    void tearDown(){
        t = null;
        System.out.println("Test ended. ");
    }

    @Test
    void termDeposit() {
        assertEquals(1100, t.termDeposit(1000, 10, 1, false));
        assertEquals(1166, t.termDeposit(1000, 10, 2, true));
        assertEquals(206252, t.termDeposit(24000, 30, 10, true));
    }

    @Test
    void priceForTransport() {
        Task task = new Task();
        assertEquals(173.08, task.priceForTransport(500, 1.8, 5.2));
        assertEquals(0.32, task.priceForTransport(1, 1.2, 3.8));
        assertEquals(4.16, task.priceForTransport(11, 1.4, 3.7));
        assertEquals(370.97, task.priceForTransport(1000, 2.3, 6.2));
    }

    @Test
    void max() {
        Task task = new Task();
        assertEquals(4, task.max(new int[] { 1,2,4,8,3 }));
        assertEquals(1, task.max(new int[] { 1,2,0,0,0 }));
        assertEquals(0, task.max(new int[] { 5 }));
        assertEquals(0, task.max(new int[] { 9,9,9,9 }));
        assertEquals(0, task.max(null));
        assertEquals(1000, task.max(new int[] { 100,1000,11987,-3 }));
        assertEquals(-8, task.max(new int[] { -1, -8, -50, -13 }));

    }
}