public class admin {
    private int AdminId;
    private int Phone;
    private String Dept;
    private String emailId;
    private String password;
    private String name;

    //constructors
    public admin(){}
   public admin(int AdminId,int Phone,String Dept,String emailId,String password,String name){
       this.name=name;
       this.AdminId=AdminId;
       this.Dept=Dept;
       this.emailId=emailId;
       this.Phone=Phone;
       this.password=password;
    }
    //methods
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