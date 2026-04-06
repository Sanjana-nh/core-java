class PhonePeExecutor{
public static void main(String[] args){
PhonePe pp=new PhonePe();
pp. addInsuranceNames("Health");
pp. addInsuranceNames("Motor");
pp. addInsuranceNames("Life");
pp. addInsuranceNames("Travel");
pp. addInsuranceNames("Accident");
pp. addInsuranceNames("LIC");
pp. addInsuranceNames("SBI");
pp. addInsuranceNames("SBI Health");
pp. addInsuranceNames("HDFC Health");
pp. addInsuranceNames("ICICI Health");
pp. addInsuranceNames("Business");
pp. addInsuranceNames("Family");
pp. addInsuranceNames("TATA");
pp. addInsuranceNames("MAX");
pp. addInsuranceNames("Kotak Health");
pp. addInsuranceNames("Star Union");
pp. addInsuranceNames("Reliance Nippon");
pp. addInsuranceNames("Sahara India");
pp. addInsuranceNames("Canara Life");
pp. addInsuranceNames("PMSBY");
pp. addInsuranceNames("PM-JAY");
pp. addInsuranceNames("Bajaj Health");
pp. addInsuranceNames("Vehicle");
pp. addInsuranceNames("ERGO");
pp. addInsuranceNames("Digit");
pp. addInsuranceNames("Royal");
pp. addInsuranceNames("RGI");

pp.getInsuranceNames();
pp.getInsuranceNamesByindex(6);
pp.getIndexByInsuranceNames("Royal");
pp.updateInsuranceNames("Health", "Health Insurance");
pp.getInsuranceNames();
pp.deleteInsuranceNames("Vehicle");
pp.getInsuranceNames();

}
}