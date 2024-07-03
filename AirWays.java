public  class AirWays implements MakeMyTrip {
    @Override
    public void budget(int a){

        System.out.println("Your budget is :" +a);
    }

    @Override
    public void destination(String b){

        System.out.println("Destination is : "+b);
    }
    @Override
    public void mode_of_travel(String c) {
        System.out.println("Mode of travel is :" + c);
    }
    public static void main(String args[]){
            MakeMyTrip trip =new AirWays();
        trip.budget(4500);
            trip.destination("Goa");
            trip.mode_of_travel("Airways");
        }
    }
