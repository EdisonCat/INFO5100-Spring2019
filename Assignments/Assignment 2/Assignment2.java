/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to finish the extra credit question. 
 * The deadline of this assignment is 01/25/2019 23:59 PST.
 * Please feel free to contact Fiona for any questions.
 * TA office hour: Tuesday 1 pm -- 4 pm
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    		//write your code here
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
    		//write your code here
        return this.name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    		//write your code here
        this.name=name;

    }
    public void raiseSalary(double byPercent){
        this.salary=this.salary*(1+byPercent/100);
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double socialSecurityTax;
        if(employee.salary<=8900){
            socialSecurityTax=employee.salary*0.062;
            System.out.println("Social Security Tax is "+socialSecurityTax);
        }
        else{
            socialSecurityTax=106800*0.062;
            System.out.println("Social Security Tax is "+socialSecurityTax);
        }
    	return socialSecurityTax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
        double insuranceCoverage;
        if(employee.age<35){
            insuranceCoverage=employee.salary*0.03;
            System.out.println("insurance coverage is "+insuranceCoverage);
        }
        else if(employee.age>=35&&employee.age<=50){
            insuranceCoverage=employee.salary*0.04;
            System.out.println("insurance coverage is "+insuranceCoverage);
        }
        else if(employee.age>50&&employee.age<60){
            insuranceCoverage=employee.salary*0.05;
            System.out.println("insurance coverage is "+insuranceCoverage);
        }
        else{
            insuranceCoverage=employee.salary*0.06;
            System.out.println("insurance coverage is "+insuranceCoverage);
        }
        return insuranceCoverage;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        Employee employeeSet [] = {e1,e2,e3};
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(employeeSet[j].salary>employeeSet[j+1].salary){
                    Employee tempEmployee=employeeSet[j];
                    employeeSet[j]=employeeSet[j+1];
                    employeeSet[j+1]=tempEmployee;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(employeeSet[i].name+" ");
        }
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)  
     */
    public static void tripleSalary(Employee employee) {
        //write your code here
        employee.salary=3*employee.salary;
    }




    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Your Answer:
     It is because the parameters are just passed by values and after the swap the memory will be released, meaning
     swap will only happen within the swap method itself.
     To fix this, we should manually swap every member in class Employee like below:

     public static void swap(Employee x, Employee y){
        String tempName=x.name;
        int tempAge=x.age;
        Gender tempGender=x.gender;
        double tempSalary=x.salary;
        x.name=y.name;
        x.age=y.age;
        x.gender=y.gender;
        x.salary=y.salary;
        y.name=tempName;
        y.age=tempAge;
        y.gender=tempGender;
        y.salary=tempSalary;
    }
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Employee c = new Employee("aaa",20,Gender.MALE,1000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);//
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x ;
        x = y;
        y = temp;
    }
}