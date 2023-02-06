package homework;

public class Chapter14homework {
public static void main(String[] args) {
		
//		String startDate = "2023-01-01";
//		String endDate = "2023-01-28";
//		
//		List<String> Calendar = new ArrayList<String>();
//		Calendar = eachEveryday(startDate,endDate);
//		
//		System.out.println("Calendar element: "+Calendar.toString());
//		
//	}
//	
//	public static List<String> eachEveryday(String startDate,String endDate){
//		
//		Date start = null;
//		Date end = null;
//		
//		try {
//			start = new SimpleDateFormat("yyyy-mm-dd").parse(startDate);
//			end = new SimpleDateFormat("yyyy-mm-dd").parse(endDate);
//		}catch(ParseException e) {
//			e.printStackTrace();
//		}
//		
//		List<String> result = new ArrayList<String>();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//	
//		Date date = start;
//		Calendar c = Calendar.getInstance();	
//		
//		while(date.getTime() <= end.getTime()) {
//			result.add(sdf.format(date));
//			c.setTime(date);
//			c.add(Calendar.DATE, 1);
//			date = c.getTime();
//		}
//		
//		return result;
}
}
