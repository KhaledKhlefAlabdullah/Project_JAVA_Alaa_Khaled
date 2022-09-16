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
 
}