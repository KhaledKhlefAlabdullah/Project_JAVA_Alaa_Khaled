class Project{
    public static void main(String[] args) {

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