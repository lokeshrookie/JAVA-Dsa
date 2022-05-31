package SourceCode.Trees;

//public class Sudha {
//}

class Admin{
    int AdminId;
    String emailId;
    String firstName;
    String lastName;
    String password;

    public Admin(){
        super();
    }

    public Admin(int AdminId, String emailId, String firstName, String lastName, String password){

        super();
        this.AdminId = AdminId;
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public int getAdminId(){
        return this.AdminId;
    }
    public void setAdminId(int AdminId){
        this.AdminId = AdminId;
    }

    public String getemailId(){
        return this.emailId;
    }
    public void setemailId(String emailId){
        this.emailId = emailId;
    }

    public String getfirstName(){
        return this.firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return this.lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getpassword(){
        return this.password;
    }
    public void setpassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "Admin [AdminId="+AdminId+", emailId="+emailId+", firstName="+firstName+", lastName="+lastName+", password="+password+"]";
    }
}

interface AdminService{
    void createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(int id);
    Admin[] getAdmin();
}

class AdminServiceImpl implements AdminService{
    public static Admin adminArray[] = new Admin[5];
    static int count = 0;

    @Override
    public void createAdmin(Admin admin)
    {
        adminArray[count] = admin;
        count++;
    }

    @Override
    public Admin updateAdmin(Admin admin)
    {
        for(int i = 0; i < adminArray.length; i++)
        {
            if(adminArray[i].getAdminId() == admin.getAdminId()){
                adminArray[i] = admin;
                return admin;
            }
        }
        return admin;
    }

    @Override
    public void deleteAdmin(int AdminId)
    {
        for(int i = 0; i < adminArray.length; i++)
        {
            if(adminArray[i].getAdminId() == AdminId)
            {
                adminArray[i] = null;
            }
        }
    }

    @Override
    public Admin[] getAdmin(){
        return adminArray;
    }
}

public class Source{
    public static void main(String[] args){
        AdminService adminService = new AdminServiceImpl();

        Admin rajan = new Admin(1004, "rajan@gmail.com", "Rajan", "Arun", "Password4");
        adminService.createAdmin(rajan);

        System.out.println(rajan);
    }
}
