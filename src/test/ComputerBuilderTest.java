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

    void shouldReturnMotherboardException() {
        try {
            ComputerBuilder computerBuilder = new ComputerBuilder();
            Computer computer = computerBuilder.setBudget(1000).build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("You need a motherboard", e.getMessage());
        }
    }

    void ShouldReturnValidComputer(){
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer computer = computerBuilder.setBudget(1000).setMotherboard('H61 AFOX H61 IH61-MA5 Micro-ATX LGA1155').build();
        assertNotNull(computer);
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