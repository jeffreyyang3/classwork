// Custodian.java
// Jeffrey Yang
// 1606512
// Sorting Approval Ratings
// Getter and setter methods for CongressMembersTest
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
    int usedVacation;
    void usePaidVacation(){
        usedVacation++;
    }
    void useUnpaidVacation(){
        usedUnpaidVacation++;
    }
    void workYear(){
        super.setYears(getYears() + 1);
    }

    @Override
    double YTDValue() {
        return(HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260));
    }
    int yearsTillRetirement(){
        return (int) Math.ceil(35 - (super.getYears() + ((double) usedUnpaidVacation / 260) + (((double)usedVacation / 260) * 2)));
    }
}
