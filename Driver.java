import java.util.*;
class Driver {

    public static void main(String[] args) {
       Staff[] staff = new Staff[10];

        staff[0] = new Staff("Ali", "Khan", 111-11-1111);
        staff[1] = new Staff("Sara", "Ahmed", 222-22-2222);

        staff[2] = new Salaried_staff("Bilal", "Hassan", 333-33-3333, 800.00);
        staff[3] = new Salaried_staff("Ayesha", "Malik", 444-44-4444, 950.00);

        staff[4] = new Hourly_Staff("Usman", "Raza", 555-55-5555, 15.0, 45);
        staff[5] = new Hourly_Staff("Hina", "Shah", 666-66-6666, 20.0, 38);

        staff[6] = new ComissionStaff("Zain", "Ali", 777-77-7777, 10000, 0.06);
        staff[7] = new ComissionStaff("Fatima", "Noor", 888-88-8888, 15000, 0.05);

        staff[8] = new BasePlusComissionStaff("Hamza", "Tariq",999-99-9999, 20000, 0.04, 500);
        staff[9] = new BasePlusComissionStaff("Mariam", "Yousuf",101-01-1010, 25000, 0.05, 600);

 
        for (Staff emp : staff) {

            if (emp instanceof BasePlusCommissionStaff) {
                BasePlusCommissionStaff bpce = (BasePlusCommissionStaff) emp;
                double oldSalary = bpce.get_base_salary();
                double newSalary = oldSalary * 1.10;
                bpce.set_base_salary(newSalary);
                System.out.println(">> Base salary of " + bpce.getFirstName() +
                                   " increased by 10%: " + oldSalary +
                                   " -> " + newSalary);
            }

            System.out.println(emp.toString());
            System.out.println("Earnings: " + emp.payment_method());
        }
    }
}    