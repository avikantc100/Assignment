package com.jdk;

public class Program9 {

	 int empId;
     String empName;
     Double empSalary;
     String deptname;
     
    public Program9(int empId, String empName,  String deptname) {
         super();
         this.empId = empId;
         this.empName = empName;
         this.deptname = deptname;
     }
     
     public int getEmpId() {
         return empId;
     }

   public void setEmpId(int empId) {
         this.empId = empId;
     }

    public String getEmpName() {
         return empName;
     }

    public void setEmpName(String empName) {
         this.empName = empName;
     }

   public Double getEmpSalary() {
         return empSalary;
     }

   public void setEmpSalary(Double empSalary) {
         this.empSalary = empSalary;
     }

    public String getDeptname() {
         return deptname;
     }

    public void setDeptname(String deptname) {
         this.deptname = deptname;
     }

    @Override
     public String toString() {
         return "Program9 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", deptname="
                 + deptname + "]";
     }
     
     public Object clone()
     {
           Program9 emp;
           emp = new Program9(this.empId, this.empName, this.deptname);
           emp.setEmpSalary(this.empSalary);
           return emp;
     }
     
     public static void main(String[] args)
     {
         Program9  emp1=new Program9(101, "Avikant", "IT");
         emp1.setEmpSalary(40000.0);
         Program9 emp2 = (Program9) emp1.clone();
         emp1.setEmpName("Ramesh");
           
         System.out.println(emp1);
         System.out.println(emp2);
           
         System.out.println(emp2 instanceof Program9);
         System.out.println(emp1.equals(emp2));
     }
}
