import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    PhoneBook sut;
    @BeforeEach
    public void initEachTest() {
        sut = new PhoneBook();
    }
    @BeforeEach
    public void afterEachTest() {
        sut = null;
    }

    @Test
    public void testAdd() {
        assertEquals(sut.add("Nike", 354681), 1);
    }

    @Test
    public void testAddTwo() {
        sut.add("Nike", 354681);
        assertEquals(sut.add("Anny", 481900), 2);
    }

    @Test
    public void testFindByNumber() {
        sut.add("Nike", 354681);
        assertEquals(sut.findByNumber(354681), "Nike");
    }

    @Test
    public void testFindByName() {
        sut.add("Nike", 354681);
        assertEquals(sut.findByName("Nike"), 354681);
    }

    @Test
    public void testPrintAllNames() {
        sut.add("Nike", 354681);
        sut.add("Anny", 481900);
        sut.add("Mike", 731854);
        assertEquals(sut.printAllNames(), "Anny\n" +
                                                "Mike\n" +
                                                "Nike\n");
    }
}
