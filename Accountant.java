public class Accountant extends Employee {
    //asdf
    Accountant(int yearsWorked){
        super.setYears(yearsWorked);
    }
    final int PAID_VACATION = 10; // days
    final int UNPAID_VACATION = 10; // days
    final double HEALTH_INSURANCE = 15000; // $/year
    final double INCOME = 125000; // $/year
    int usedUnpaidVacation; // keeps track of how much
    //unpaid vacation has been used.
    int usedVacation; // keeps track of how much paid vacation
    // has been used.
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
        return (HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260));
    }
    int yearsTillRetirement(){
        return (35 - (super.getYears() +  (usedUnpaidVacation / 260) + (( usedVacation / 260) * 2)));
    }
}
