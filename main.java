class Project{
    public static void main(String[] args) {
        
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
 
}