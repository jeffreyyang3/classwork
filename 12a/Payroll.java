// Payroll.java
// Jeffrey Yang
// 1606512
// Payroll for start up company
// Constructor and sorting methods for an array of employee objects
public class Payroll extends Employee {
    private Employee[] employees;

    Payroll(int x){
        employees = new Employee[x];
    } // constructor
    public Employee [] getEmployees(){
        return employees;
    } //returns the private array for use by other methods
    void sortEmployeesByRetirement(){
        for (int i = 0; i < employees.length-1; i++)
            for (int j = 0; j < employees.length-i-1; j++)
                if (employees[j].yearsTillRetirement() > employees[j+1].yearsTillRetirement()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
    }
    void sortEmployeesByCost(){
        for (int i = 0; i < employees.length-1; i++)
            for (int j = 0; j < employees.length-i-1; j++)
                if (employees[j].YTDValue() < employees[j+1].YTDValue()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
    }

    }

