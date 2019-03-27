package codecool;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
        list = new ArrayList<>(Arrays.asList(6, 11, 45, 2, 13, 15, 4, 8));
    }

    @Test
    void testFindMethodThrowNoSuchElementExceptionWhenElementNotExistsInList() {
        assertThrows(NoSuchElementException.class, () -> {binarySearch.findElementBinarySearch(list, 27);});
    }

    @Test
    void testFindMethodReturnTrueIfElementExistsInList() {
        assertEquals(true, binarySearch.findElementBinarySearch(list, 13));
    }
}