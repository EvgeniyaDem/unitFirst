package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void ShouldRemainDifference() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldRemainWholeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldRemainNothing() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}





