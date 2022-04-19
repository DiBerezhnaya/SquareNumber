package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSqrtCeil() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSqrtCeil(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSqrtCeilLarger() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calculateSqrtCeil(200, 600);

        assertEquals(expected, actual);
    }
}