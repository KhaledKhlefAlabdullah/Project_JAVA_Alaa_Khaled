import java.util.ArrayList;
class Project{
    static ArrayList<Doctor> lst=new ArrayList<>();
    public static void main(String[] args) {
        //Create Method
        //Doctor.init_object_of_Doctor(1,"khaled","khaled@gmail.com",20,"brogramar");
        //Read Method
        //Doctor.get_print_data(lst);
    }
}

class Patient{ 
    private int Id;
    private String Name;
    private String Email;
    private int Age;
    
    Patient(int Id,String Name,String Email,int Age){
        if(Id>0){ 
            this.Id = Id;
        }
        if(Name.length()>2){ 
            this.Name = Name;
        }
        if(Email.length()>5 && Email.contains("@")){ 
            this.Email =Email;
        }
        if(Age >1900 && Age < 2022){ 
            this.Age = Age;
        }
    }
    public int get_id(){ 
        return this.Id;
    }
    public void set_id(int Id){ 
        if(Id>0){ 
            this.Id = Id;
        }
    }
    public String get_name(){ 
        return this.Name;
    }
    public void set_name(String Name){ 
        if(Name.length()>2){ 
            this.Name = Name;
        }
    }
    public String get_email(){ 
        return this.Email;
    }
    public void set_email(String Email){ 
        if(Email.length()>5 && Email.contains("@")){ 
            this.Email =Email;
        }
    }
    public int get_age(){ 
        return this.Age;
    }
    public void set_Age(int Age){ 
        if(Email.length()>5 && Email.contains("@")){ 
            this.Age = Age;
        }
    }
}

class Doctor{
    private int id;
    private String name;
    private String email;
    private int age;
    private String type;
    
    public Doctor(int id,String name,String email,int age,String type){
        if(id>0){}
            this.id=id;
        if(name.length()>2)
            this.name=name;
        if(email.length()>10 && email.contains("@") && email.contains("."))
            this.email=email;
        if(age>17)
            this.age=age;
        if(type.length()>3)
            this.type=type;
    }
    public void set_id(int id){
        if(id>0){}
            this.id=id;
    }
    public int get_id(){
        return this.id;
    }
    public void set_name(String name){
        if(name.length()>2)
            this.name=name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_email(String email){
        if(email.length()>10 && email.contains("@") && email.contains("."))
            this.email=email;
    }
    public String get_email(){
        return this.email;
    }
    public void set_age(int age){
        if(age>17)
            this.age=age;
    }
    public int get_age(){
        return this.age;
    }
    public void set_type(String type){
        if(type.length()>3)
            this.type=type;
    }
    public String get_type(){
        return this.type;
    }
    public static void init_object_of_Doctor(int id,String name,String email,int age,String type){
        Doctor d1=new Doctor(id,name,email,age,type);
        Project.lst.add(d1);
    }
    public void get_all_data(){
        int id=get_id();
        String name=get_name();
        String email=get_email();
        int age=get_age();
        String type=get_type();
        System.out.println("{ Id: "+id+", Name: "+name+", Email: "+email+", Age: "+age+", Type: "+type+" }");
    }
    public static void get_print_data(ArrayList<Doctor> lst){
        for (Doctor d : lst) {
            d.get_all_data();
        }
    }
    
}