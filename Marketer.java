// Marketer.java
// Jeffrey Yang
// 1606512
// Payroll for start up company
// methods for marketer class that extends employee class
public class Marketer extends Employee {
    Marketer(int yearsWorked){
        super.setYears(yearsWorked);
    }
    final double CLIENT_BONUS = 2000; // per new client
    final int PAID_VACATION = 10; // days
    final int UNPAID_VACATION = 10; // days
    final double HEALTH_INSURANCE = 10000; // $/year
    final double INCOME = 100000; // $/year
    int numBonuses; // keeps track of how many commission
    // based bonuses the employee received.
    int usedUnpaidVacation; // keeps track of how much
    //unpaid vacation has been used.
    int usedVacation; // keeps track of how much paid vacation
    // has been used.
    void signDeal(){
        numBonuses++;
    }
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
        return (CLIENT_BONUS * numBonuses + HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260));
    }
    int yearsTillRetirement(){
        return (35 - (super.getYears() + (usedUnpaidVacation / 260) + ((usedVacation / 260) * 2)));
    }
}
