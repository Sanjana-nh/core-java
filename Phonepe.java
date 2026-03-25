class PhonePe{
String insuranceNames[]=new String[27];
int index;

public boolean addInsuranceNames(String insuranceName){
boolean isInsuranceNameAdded=false;
if(insuranceName!=null && !insuranceName.isEmpty()){
insuranceNames[index]=insuranceName;
index++;
isInsuranceNameAdded=true;	
}
else{
System.out.println(insuranceName+"is invalid");
}

return isInsuranceNameAdded;
}

public void getInsuranceNames(){
	for(String insuranceName:insuranceNames){
		System.out.println(insuranceName);
	}
}
}