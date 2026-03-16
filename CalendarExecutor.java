class CalendarExecutor{
public static void main(String[] args){
Calendar calendar=new Calendar();
calendar.calendarId=1;
System.out.println(calendar.calendarId);

calendar.calendarCompany="Microsoft Teams";
System.out.println(calendar.calendarCompany);
Day day=new Day();
calendar.day=day;
}
}