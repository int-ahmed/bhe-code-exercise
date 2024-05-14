package org.intesar;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class PrimeServiceTest {

    @Inject
    PrimeService service;

    @Test
    void testPrimeService_sieve_6() {
        String EXPECTED = "2 3 5";
        String result = service.sieve(6);
        assertEquals(EXPECTED, result);
    }

    @Test
    void testPrimeService_sieve_12() {
        String EXPECTED = "2 3 5 7 11";
        String result = service.sieve(12);
        assertEquals(EXPECTED, result);
    }

    @Test
    void testPrimeService_sieve_2() {
        String EXPECTED = "2";
        String result = service.sieve(2);
        assertEquals(EXPECTED, result);
    }

    @Test
    void testPrimeService_sieve_1() {
        String EXPECTED = "Invalid input; use 2 or greater";
        String result = service.sieve(1);
        assertEquals(EXPECTED, result);
    }
}
