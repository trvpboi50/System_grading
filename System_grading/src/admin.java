public class admin {
    private int AdminId;
    private int Phone;
    private String Dept;
    private String emailId;
    private String password;
    
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
   public void setpassword(String security){
       password = security;
   }
   public String getpassword(){
       return password;
   }
   public int getPhone(){
       return Phone;
   }
   public void setDept(String name){
    Dept = name;
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
   
}
