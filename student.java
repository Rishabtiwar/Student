import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class student {
    private String name;
    private Date dob;

    public student(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long diff = currentDate.getTime() - dob.getTime();
        
        // Debugging statements
        System.out.println("Current Date: " + currentDate);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Difference in milliseconds: " + diff);
        
        // Convert milliseconds to years
        long ageInMillisPerYear = 1000L * 60 * 60 * 24 * 365;
        long age = diff / ageInMillisPerYear;
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = dateFormat.parse("15-05-2000");
        
        // Debugging statement
        System.out.println("Parsed Date of Birth: " + dob);
        
        student student = new student("Alice", dob);
        student.displayName();
        student.displayAge();
    }
}
