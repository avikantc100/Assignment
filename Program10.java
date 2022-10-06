package com.jdk;

import java.time.LocalDate;

public class Program10 {

	 int emp_id;
     String emp_name;
     long emp_salary;
     String emp_address;
     private LocalDate emp_dob;
     private LocalDate emp_doj;
        
     public Program10(int emp_id, String emp_name, long emp_salary, String emp_address, LocalDate emp_dob,
             LocalDate emp_doj)
     {
         super();
         this.emp_id = emp_id;
         this.emp_name = emp_name;
         this.emp_salary = emp_salary;
         this.emp_address = emp_address;
         this.emp_dob = emp_dob;
         this.emp_doj = emp_doj;
     }
   @Override
     public String toString()
     {
         return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_address="
                 + emp_address + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
     }
     public static void main(String[] args)
     {
         Program10 emp = new Program10(101,"Avikant Chavan", 22000, "Ambajogai",LocalDate.of(1991, 06, 22),LocalDate.of(2022, 9, 30));
         System.out.println(emp);
     }
}
