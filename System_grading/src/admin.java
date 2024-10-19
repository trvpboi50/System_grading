import java.util.Scanner;

public class admin {
    private int AdminId;
    private int Phone;
    private String Dept;
    private String emailId;
    private String password;
    private String name;
    //constructors
    public admin (){}
    public admin(String name){
        System.out.print("ENTER ADMIN's NAME:" + name);
    }
   public void setAdminId(int id){
    AdminId = id;
} 
   public int getAdminId(){
       return AdminId;
   }
   public void setPhone(int number){
    Phone = number;
}
public String getName(){
        return name;
}
public void setName(){
        this.name=name;
}
   public void setpassword(String security){
       password = security;
   }
   //getter methods
   public String getpassword(){
       return password;
   }
   public int getPhone(){
       return Phone;
   }
   public void setDept(String name){
    this.Dept = name;
} 
   public String getDept(){
       return Dept;
   }
   public void setemailId(String id){
    emailId = id;
     
} 
   public String getemailId(){
       return emailId;
   }
   //set nfo
    public void setdetails(){
        System.out.println("Enter  ");
    }
   //display minfo
   public void displaysetdetails(){
       System.out.println("Admin ID :"+AdminId);
       System.out.println("Name :"+ name);
       System.out.println("Department :"+ Dept);

   }
   
}
