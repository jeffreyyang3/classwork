/**
 * Created by Jeffrey Yang on 12/1/2017.
 */ //8

public class BoardMember extends Employee{
    BoardMember(int yearsWorked){
        super.setYears(yearsWorked);
    }
    final double YEARLY_BONUS = 20000; // $/year
    final int PAID_VACATION = 20; // days
    final int UNPAID_VACATION = 10; // days
    final int SICK_LEAVE = 10; // days
    final double HEALTH_INSURANCE = 20000;//$/year
    final double INCOME = 200000; // $/year
    int usedUnpaidVacation; // keeps track of how much
    //unpaid vacation has been used.
    int usedVacation; // keeps track of how much paid vacation
    // has been used.
    int usedSickDays; // keeps track of how many sick days
    // have been used.

    void usePaidVacation(){
        usedVacation++;
    }

    void useUnpaidVacation(){
        usedUnpaidVacation++;
    }

    void useSickDay(){
        usedSickDays++;
    } // adds one to usedSickDays

    void workYear(){
        super.setYears(super.getYears() + 1);

    } // adds one to yearsWorked.

    double YTDValue(){
        return (YEARLY_BONUS + HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260) (SICK_LEAVE - usedSickDays) * ((INCOME / 260) / 2) )
    }

    int yearsTillRetirement(){
        return (int)((double)( 35 -(yearsWorked + (usedUnpaidVacation / 260) + ((usedVacation / 260) * 2) + (usedSickDays / 260))))
    }





}