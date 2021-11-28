package main;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder(){
        computer = new Computer();
    }

    public Computer build() {
        if(computer.getBudget() == 0){
            throw  new IllegalArgumentException("You don't have any money");
        }

        return computer;
    }

    public ComputerBuilder setBudget(float budget) {
        computer.budget = budget;
        return this;
    }

    public ComputerBuilder setTotalPrice(float totalPrice) {
        computer.totalPrice = totalPrice;
        return this;
    }

    public ComputerBuilder setPowerSupply(String powerSupply) {
        computer.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuilder setMotherboard(String motherboard) {
        computer.motherboard = motherboard;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        computer.processor = processor;
        return this;
    }

    public ComputerBuilder setRandomAccessMemory(String randomAccessMemory) {
        computer.randomAccessMemory = randomAccessMemory;
        return this;
    }

    public ComputerBuilder setSolidStateDrive(String solidStateDrive) {
        computer.solidStateDrive = solidStateDrive;
        return this;
    }

    public ComputerBuilder setCooler(String cooler) {
        computer.cooler = cooler;
        return this;

    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        computer.graphicsCard = graphicsCard;
        return this;
    }
}
