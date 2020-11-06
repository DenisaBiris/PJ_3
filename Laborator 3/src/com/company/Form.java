package com.company;

public class Form {
    private String FirstName;
    private String LastName;
    private Integer Age;
    private String Gender;
    private Boolean Status;
    private String Address;

    public Form(String FirstName, String LastName, Integer Age, String Gender,Boolean Status, String Address){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Gender = Gender;
        this.Status = Status;
        this.Address = Address;

    }

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getLastNameirstName() {
        return LastName;
    }
    public void setLastName(String LastName){
        this.FirstName = LastName;
    }
    public Integer getAge() {
        return Age;
    }
    public void setAge(Integer Age){
        this.Age = Age;
    }
    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }
    public void setGender(String Gender) {
       this.Gender = Gender;
    }

    public void setAddress(String Address) {
       this.Address = Address;
    }

    public Boolean getStatus(){
        return Status;
    }
    public void setStatus(Boolean Status){
        this.Status = Status;
    }

}
