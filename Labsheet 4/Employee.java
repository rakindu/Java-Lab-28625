
package com.mycompany.lab230601;

public class Employee {
    private int empId;
    private String empName, empDesing;



   public void setEmpdetails(int empId, String empName, String empDesing) {
        this.empId = empId;
        this.empName = empName;
        this.empDesing = empDesing;
    }


    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesing() {
        return empDesing;
    }
    
}
