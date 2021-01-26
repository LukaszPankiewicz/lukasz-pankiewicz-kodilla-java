package stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2, 3, 5, 7, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(21.65, result);
    }
}
