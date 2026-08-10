class Dog extends Animal {

    Dog() {
        super();   // Calls parent class constructor
        System.out.println("Dog constructor called");
    }

    void display() {
        super.sound();   // Calls parent class method
    }
}