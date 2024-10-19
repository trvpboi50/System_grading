 import java.util.Scanner;
//public class admin {
   

class User {
    private final String  name;
    private final String password;
    private final String department;
    private final String email;

    // Constructor
    public User(String name, String password, String department, String email) {
        this.name = name;
        this.password = password;
        this.department = department;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    // Method to display user information
    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
    }
}

public class UserInfoApp {
    public static void main(String[] args) {
        // Collecting user information
        try (Scanner scanner = new Scanner(System.in)) {
            // Collecting user information
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            
            // Creating User object
            User user = new User(name, password, department, email);
            
            // Displaying user information
            user.displayUserInfo();
        }
    }
}

