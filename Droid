// javaBasics - Understanding classes, constructors, and methods

// Program: Droid
// Description: Simulates a droid object with a name, battery level, and tasks.

public class Droid {

    int batteryLevel;
    String name; 

    
    public void batteryUse() {
        batteryLevel = batteryLevel - 10;
    }

    
    public void performTask(String task) {
        System.out.println(name + " is performing " + task);
        batteryUse(); 
    }

    public String toString() {
        return "Hello, I'm the droid " + name + ". Battery level: " + batteryLevel + "%";
    }

    
    public Droid(String droidName) {
        batteryLevel = 100;
        name = droidName;
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey"); 
        System.out.println(Codey);      
        Codey.performTask("coding");    
        System.out.println(Codey);     
    }
}
