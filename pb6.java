// Superclass raselhasan
class raselhasan{
    int x = 4000;    // Variable to store x fees
    int y = 3500;  // Variable to store y fees
}

// Subclass pb6 which extends raselhasan
public class pb6 extends raselhasan {
    int z = 2000;  // Variable to store private fees

    // Constructor for pb6
    public pb6() {
        super();  // Call the constructor of the superclass raselhasan
        this.z = 2000;  // Use 'this' keyword to refer to the instance variable z
    }

    public static void main(String[] args) {
        pb6 t = new pb6();  // Create an instance of the subclass pb6

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("raselhasan's x fees: " + t.x);
        System.out.println("raselhasan's y fees: " + t.y);
        System.out.println("raselhasan's private fees: " + t.z);
    }
}