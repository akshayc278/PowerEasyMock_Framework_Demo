package org.akdev.whitebox.other;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    private static int count = 0;

    public Employee(){
        this(-1);
    }
    public Employee(int id){
        this(id,"no_name");
    }
    public Employee(int id,String firstName){
        this(id,firstName,"no_name");
    }
    public Employee(String firstName,String lastName){
        this(-1,firstName,lastName);
    }

    public Employee(int id,String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
}
