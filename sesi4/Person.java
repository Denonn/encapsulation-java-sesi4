package sesi4;

public class Person {
    private String name ;
    private String addres ;

    public Person(String name, String addres) {
        this.name = name ;
        this.addres = addres ;
    }

    public String getName() {
        return this.name ;
    }

    public String getAddres() {
        return this.addres ;
    }

    public void setAddres (String Addres){
        this.addres = Addres ;
    }

    public String toString() {
        return name +"("+ addres +")" ;
    } 
}

