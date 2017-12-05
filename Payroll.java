public class Payroll extends Employee {
    Employee[] employees;

    Payroll(int x){
        employees = new Employee[x];
    }
    void sortEmployeesByRetirement(){
        for (int i = 0; i < employees.length-1; i++)
            for (int j = 0; j < employees.length-i-1; j++)
                if (employees[j].yearsTillRetirement() > employees[j+1].yearsTillRetirement()) {
                    // swap temp and arr[i]
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
    }
}
