package test;

import main.Computer;
import main.ComputerBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerBuilderTest {

    @Test
    void shouldReturnBudgetException() {
        try {
            ComputerBuilder computerBuilder = new ComputerBuilder();
            Computer computer = computerBuilder.setBudget(0).build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("You don't have any money", e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void build() {
    }

    @org.junit.jupiter.api.Test
    void setTotalPrice() {
    }

    @org.junit.jupiter.api.Test
    void setPowerSupply() {
    }

    @org.junit.jupiter.api.Test
    void setMotherboard() {
    }

    @org.junit.jupiter.api.Test
    void setProcessor() {
    }

    @org.junit.jupiter.api.Test
    void setRandomAccessMemory() {
    }

    @org.junit.jupiter.api.Test
    void setSolidStateDrive() {
    }

    @org.junit.jupiter.api.Test
    void setCooler() {
    }

    @org.junit.jupiter.api.Test
    void setGraphicsCard() {
    }
}