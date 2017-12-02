public class Engineer extends Employee {
   Engineer(int yearsWorked){
       super.setYears(yearsWorked); //constructor
    }
    final double YEARLY_BONUS = 5000; // $/year
    final int PAID_VACATION = 10; // days)
    final int UNPAID_VACATION = 10;
    final double HEALTH_INSURANCE = 10000; // $/year
    final double INCOME = 100000; // $/year
    int usedUnpaidVacation; // keeps track of how much unpaid vacation has been used.
    int usedVacation; // keeps track of how much paid vacation has been used.
    void useUnpaidVacation(){
        usedUnpaidVacation++;
    }
    void usePaidVacation(){
        usedVacation++;
    }
    void workYear(){
        super.setYears(getYears() + 1);
    }

    @Override
    double YTDValue() {
        return(YEARLY_BONUS+HEALTH_INSURANCE+INCOME+PAID_VACATION * (INCOME/260));
    }
    int yearsTillRetirement(){
        return(35 - (super.getYears() + (usedUnpaidVacation / 260) + ((usedVacation / 260) * 2)));
    }
}
