// Custodian.java
// Jeffrey Yang
// 1606512
// Payroll for start up company
// methods for custodian class, which extends the employee class

public class Custodian extends Employee{
    Custodian(int yearsWorked){
        super.setYears(yearsWorked);
    }
    final int PAID_VACATION = 10; // days
    final int UNPAID_VACATION = 10; // days
    final double HEALTH_INSURANCE = 10000; // $/year
    final double INCOME = 50000; // $/year
    int usedUnpaidVacation; // keeps track of how much
    //unpaid vacation has been used.
    int usedVacation; // keeps track of used vacation days
    void usePaidVacation(){
        usedVacation++;
    } //adds one to used paid vacation days
    void useUnpaidVacation(){ //adds one to used unpaid vacation days
        usedUnpaidVacation++;
    }
    void workYear(){
        super.setYears(getYears() + 1);
    } //adds one to years worked

    @Override
    double YTDValue() {
        return(HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260));
    }
    //adds multiplies divides variables to get YTD Value
    int yearsTillRetirement(){
        return (int) Math.ceil(35 - (super.getYears() + ((double) usedUnpaidVacation / 260) + (((double)usedVacation / 260) * 2)));
    }
    //adds multiplies divides variables to get years till retirement
}
