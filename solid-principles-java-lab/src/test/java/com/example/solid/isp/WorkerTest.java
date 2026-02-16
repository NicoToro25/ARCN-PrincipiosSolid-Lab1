package com.example.solid.isp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void developerShouldWork() {
        Workable developer = new Developer();
        assertDoesNotThrow(developer::work);
    }

    @Test
    void managerShouldEat() {
        Manager manager = new Manager();
        assertDoesNotThrow(manager::eat);
    }
}
