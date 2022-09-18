import java.util.ArrayList;

class Project{
    static ArrayList<Patient> lst = new ArrayList<>();
    static ArrayList<Doctor> lst_doc = new ArrayList<>();
    public static void main(String[] args) {
        //** Create Function **
        //Patient.create_patieant_object(1, "Alaa", "jj@gmail.com", 28);
        //Patient.create_patieant_object(2, "Ahmad", "jwfj@gmaiwfwfl.com", 98);
        //Patient.create_patieant_object(3, "aaaaa", "jwfj@gmaaaaaaiwfwfl.com", 22);
        //** Update Function **
        //Patient.update_patient(lst, 1, "Omar", "ggg@dd.com," ,30);
        //** Read Function **
        //Patient.print_Data(lst);
        //** Delete Function **
        //Patient.delete_patient(lst, 3);
        //Patient.print_Data(lst);

/* 
        //Create Method by khaled
        Doctor.init_object_of_Doctor(1,"khaled","khaled@gmail.com",20,"brogramar");
        Doctor.init_object_of_Doctor(2,"jasem","jasem@gmail.com",25,"engenner");
        //Read Method by khaled
        Doctor.get_print_data(lst_doc);
        //Update Method by khaled
        Doctor.update_Doctor_data(lst_doc, 1, "khlef", "khlef@gmail.com", 65, "teacher");
        // after update
        Doctor.get_print_data(lst_doc);
        //Delete Method by khaled
        Doctor.delete_Doctor(lst_doc, 1);
        // after delete
        Doctor.get_print_data(lst_doc);
        */

    }
}

class Session{
   private int id; 
   private String date;
   private int number_of_reviews;
   private int price;
   public ArrayList<Patient> pattient_list;
   public ArrayList<Doctor> doctor_list;
   public Session(int id,String date,int number_of_reviews,int price, ArrayList<Patient> p_list,ArrayList<Doctor> d_list){
        if(id>0){
            this.id=id;
        }
        if(date.contains(" / / ")){
            this.date=date;
        }
        if(number_of_reviews>0){
            this.number_of_reviews=number_of_reviews;
        }
        if(price>0){
            this.price=price;
        }
        pattient_list=p_list;
        doctor_list=d_list;
   }
   public void set_id(int id){
        if(id>0){
            this.id=id;
        }
   }
   public int get_id(){
    return this.id;
   }
   public void set_date(String date){
        if(date.contains(" / / ")){
            this.date=date;
        }
    }
    public String get_date(){
        return this.date;
    }
    public void set_number_of_reviews(int number_of_reviews){
        if(number_of_reviews>0){
            this.number_of_reviews=number_of_reviews;
        }
    }
    public int get_number_of_reviews(){
        return this.number_of_reviews;
    }
    public void set_price(int price){
        if(price>0){
            this.price=price;
        }
    }
    public int get_price(){
        return this.price;
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
        if(Age >0 && Age < 100){ 
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
        if(Age >0 && Age < 100){ 
            this.Age = Age;
        }
    }

    public static void create_patieant_object(int Id,String Name,String Email,int Age){ 
        Patient p = new Patient(Id, Name, Email, Age);
        Project.lst.add(p);
    }
    public static void print_Data(ArrayList<Patient> lst){ 
        for (Patient object : lst) {
            System.out.println("Id :"+object.Id+" - "+"Name :"+object.Name+" - "+"Email :"+object.Email+" - "+"Age :"+object.Age);
        }

    }

    public static void update_patient(ArrayList<Patient> lst , int id ,String Name,String Email,int Age){
        for (Patient o : lst) {
            if(o.Id == id){
                o.set_name(Name);
                o.set_email(Email);
                o.set_Age(Age);
            }
            
        }

    }
    public static void delete_patient(ArrayList<Patient> lst, int Id){ 
        for (Patient o : lst) {
            if(o.Id == Id){
                lst.remove(o);
            }
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
        Project.lst_doc.add(d1);
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
    public static void update_Doctor_data(ArrayList<Doctor> lst , int id ,String name,String email,int age,String type){
        for (Doctor d : lst) {
            if(d.get_id() == id){
                d.set_name(name);
                d.set_email(email);
                d.set_age(age);
            }
            
        }

    }
    public static void delete_Doctor(ArrayList<Doctor> lst, int id){ 
        for (Doctor d : lst) {
            if(d.get_id() == id){
                lst.remove(d);
            }
        }
    }
}