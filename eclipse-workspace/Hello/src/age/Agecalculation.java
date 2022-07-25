package age;

import java.time.LocalDate;
import java.time.Period;

public class Agecalculation {

	public static void main(String[] args) {
		
		LocalDate dob = LocalDate.of(1997, 04, 026);
		LocalDate curDate =LocalDate.now();
		Period period = Period.between(dob,curDate);
		System.out.printf("your age is %d your month is %d and your yeear is %d days",period.getYears(),period.getMonths(),period.getDays());
		
			
		
	
		
	}

}
