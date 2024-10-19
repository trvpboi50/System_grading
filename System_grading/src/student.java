import java.io.*;
import java.util.*;


public class student {
    private int id;
    private String name;
    private String course;
    private String Reg_no;
    private int age;
    private String gender;
    private String address;
    private String phone_number;
    private String email;
    private String password;
    private String status;
    private String department;
    private String confirm_password;

    public student(){}
    public student(int id,String name, String reg_no, String age, String gender, String address, String phone_number, String email, String password, String status, String department){
        this.id = id;
        this.name = name;
        this.course = course;
        this.Reg_no = Reg_no;
        this.age = Integer.parseInt(age);
        this.gender = gender;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.status = status;
        this.department = department;
        this.email = email;
        this.password = password;
    }
    //getter methods
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    public String getReg_no() {
        return Reg_no;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getStatus() {
        return status;
    }
    public String getDepartment() {
        return department;
    }
    //setter methods
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setReg_no(String reg_no) {
        Reg_no = reg_no;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    //display detals
    public void displaySetdails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("RegNo: " + Reg_no);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone_number);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Status: " + status);
        System.out.println("Department: " + department);
    }
    //setdeils
    public void setDetails(Scanner input){
        System.out.println("Enter student ID: ");
        id = input.nextInt();
        System.out.println("Enter student name: ");
        name = input.next();
        System.out.println("Enter student course: ");
        course = input.next();
        System.out.println("Enter student regNo: ");
        Reg_no = input.next();
        System.out.println("Enter student age: ");
        age = input.nextInt();
        System.out.println("Enter student gender: ");
        gender = input.next();
        System.out.println("Enter student address: ");
        address = input.next();
        System.out.println("Enter phone number: ");
        phone_number = input.next();
        System.out.println("Enter student email: ");
        email = input.next();
        System.out.println("Enter password: ");
        password = input.next();
        System.out.println("confirm password:");
        confirm_password=input.next();
        password = input.next();
        System.out.println("Enter student department: ");
        department = input.next();

    }
}

