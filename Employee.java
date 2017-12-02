/* Employee class which will simulate employees of a company.
 *
 */

//asdf
public class Employee {
    Employee(){};
    private int yearsWorked = 0;
    public Employee(int yearsWorked){
        this.yearsWorked = yearsWorked;
    }
    double YTDValue() {
        return 0;
    }
    int yearsTillRetirement() {
        return 35 - yearsWorked
    }
    void setYears(int x){
        yearsWorked = x;
    }
    int getYears(){
        return yearsWorked
    }

}
