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
public String getInsuranceNamesByIndex (int index){
	String insuranceName = null ;
	if (index < insuranceNames .length){
		insuranceName  = insuranceNames [index];
		System.out.println("The insuranceName  at index " + index  +" is: " + insuranceName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return insuranceName ;
}

	public int getIndexByInsuranceNames(String insuranceName ){
	int index = 0;
    for (String cinsuranceName  : insuranceNames ) {
        if (cinsuranceName  == insuranceName  ) {
			System.out.println("The index of " + cinsuranceName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateInsuranceNames(String existingInsuranceName , String updateInsuranceName){
    boolean isInsuranceNameUpdated = false;
    for(int index = 0 ; index< insuranceNames.length;index++){
        if (insuranceNames[index] == existingInsuranceName){
            insuranceNames[index] = updateInsuranceName ;
            isInsuranceNameUpdated = true;
            System.out.println("The updated name of " + existingInsuranceName + " is :" + updateInsuranceName);
        }
    }
    if (isInsuranceNameUpdated == false){
        System.out.println("Faild to Update the Data");
    }
    return isInsuranceNameUpdated;
}

public boolean deleteInsuranceNames(String insuranceName){
    boolean isInsuranceNameDeleted = false;

    for(int index = 0; index < insuranceNames.length; index++){
        if(insuranceNames[index] != null && insuranceNames[index].equals(insuranceName)){
            insuranceNames[index] = null;
            isInsuranceNameDeleted = true;
            System.out.println(insuranceName+ " is deleted");
            break;
        }
    }

    if(isInsuranceNameDeleted == false){
        System.out.println(insuranceName + " not found");
    }

    return isInsuranceNameDeleted;
}
}