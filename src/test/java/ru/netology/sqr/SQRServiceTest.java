package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {"from two hundred to three hundred,200,300,3",
                     "from two hundred to five hundred,200,500,8"
            }
    )
    void shouldCalculateNumberOfSquares(String testName,int min, int max, int expected) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.numberOfSquares(min, max);

        assertEquals(expected, actual);
    }

}