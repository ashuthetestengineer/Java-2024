package basicPrograms;
//Using Switch Statement print day of week
public class DayOfWeek {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		String day6 = "saturday";
		switch(day6){
		case "monday": System.out.println("Today Is Monday");
		break;
		
		case "tuesday": System.out.println("Today Is Tuesday");
		break;
		
		case "wednesday": System.out.println("Today Is Wednesday");
		break;
		
		case "thursday": System.out.println("Today Is Thursday");
		break;
		
		case "friday": System.out.println("Today Is Friday");
		break;
		
		case "saturday": System.out.println("Today Is Saturday");
		break;
		
		default:System.out.println("SUNDAY");
		
		}
		
		System.out.println("Main Ends");
	}

}
