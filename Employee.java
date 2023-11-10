public class Employee extends Person{
    // Employee now has access to every method created in the Person class
    private String employeeId;
    private String title;

    public Employee(String name, int age, String gender, String employeeId, String title) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.title = title;
    }
    
    public String getEmployeeId() { 
        return employeeId; 
    } // Getter
    
    public void setEmployeeId(String employeeId) { 
        this.employeeId = employeeId; 
    } // Setter
    
    public String getTitle() { 
        return title; 
    } // Getter
    
    public void setTitle(String title) { 
        this.title = title;
    } // Setter
}
