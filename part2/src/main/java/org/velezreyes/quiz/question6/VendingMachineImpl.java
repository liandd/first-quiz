package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

    private int totalQuarters = 0;

    @Override
    public void insertQuarter() {
        totalQuarters++;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        switch (name) {
            case "ScottCola":
                if (totalQuarters >= 3) {
                    totalQuarters -= 3;
                    return new ScottCola();
                } else {
                    throw new NotEnoughMoneyException();
                }
            case "KarenTea":
                if (totalQuarters >= 4) {
                    totalQuarters -= 4;
                    return new KarenTea();
                } else {
                    throw new NotEnoughMoneyException();
            }
            default:
                throw new UnknownDrinkException();
        }
    }
    public static VendingMachine getInstance() {
        return new VendingMachineImpl();
    }
}