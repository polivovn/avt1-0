package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;



public class CashbackHackServiceTest {
    @Test
    public void shouldTestCashBackWhenItsUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestWhenIts1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

}