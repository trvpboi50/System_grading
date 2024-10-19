public interface AdminInterface {
    void setAdminId(int id);
    int getAdminId();
    void setPhone(int number);
    int getPhone();
    void setPassword(String security);
    String getPassword();
    void setDept(String name);
    String getDept();
    void setEmailId(String id);
    String getEmailId();
}

class Admin implements AdminInterface {
    private int AdminId;
    private int Phone;
    private String Dept;
    private String emailId;
    private String password;
    private String name;

    // Constructors
    public Admin() {
    }

    public Admin(int AdminId, int Phone, String Dept, String emailId, String password, String name) {
        this.name = name;
        this.AdminId = AdminId;
        this.Dept = Dept;
        this.emailId = emailId;
        this.Phone = Phone;
        this.password = password;
    }

    // Implementing methods from AdminInterface
    public void setAdminId(int id) {
        AdminId = id;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setPhone(int number) {
        Phone = number;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPassword(String security) {
        password = security;
    }

    public String getPassword() {
        return password;
    }

    public void setDept(String name) {
        Dept = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setEmailId(String id) {
        emailId = id;
    }

    public String getEmailId() {
        return "";
    }
}