interface Vehicle {
    void gear(int x);
    void speedUp(int x);
    void applyBreaks(int x);
}

class Car implements Vehicle {
    int speed;
    int gear;

    @Override
    public void gear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }
    
    @Override
    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("speed: "+ speed +" gear: "+ gear);
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.gear(2);
        car.speedUp(3);
        car.applyBreaks(2);
        car.printStates();
    }
}