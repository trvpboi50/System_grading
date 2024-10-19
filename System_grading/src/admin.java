import java.util.Scanner;
public class admin {
    private  String  name;
    private String password;
    private String department;
    private String email;

    // Constructor
    public admin(String name, String password, String department, String email) {
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

public void setDetails() {
        // Collecting user information
        Scanner scanner = new Scanner(System.in) {
            // Collecting user information
            System.out.print("Enter name: ");
            this.name = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();




            // Displaying user information


    }
}

