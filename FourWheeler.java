// child class of 2nd parent
class FourWheeler extends  RoadTransport {

String companyName;
String modelName;
void  carDetails(){
System.out.println("Car details are "+companyName +","+modelName);
}

public static void main(String args[]){

FourWheeler car=new FourWheeler();
car.modelName= "G Wagon";
car.companyName= "Mercedes";
car.transportType= "Road transportation ";
car.vehicleType="car";
car.fuelType="petrol";    
car.transportInfo();
car.vehicleInfo();
car.carDetails();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}
}