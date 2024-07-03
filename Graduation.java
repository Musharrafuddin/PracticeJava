// Parent class
public class Graduation {
    int passOutYear;
    String CollageName;
    public void studentDetail(){
        System.out.println("student details are  " +passOutYear +","+CollageName);
    }
}

// child class
class Btech extends Graduation {
    String Branch;
    char section;
    int rollnumber;
   public void BtechDetails(){
        System.out.println("student Btech details are :" +rollnumber+","+Branch+","+section);
    }
    public static void main(String args[]){
        Btech ob =new Btech();
        ob.rollnumber=44;
        ob.section='B';
        ob.Branch="CSE";
        ob.CollageName="Avanthi";
        ob.passOutYear=2024;
        ob.BtechDetails();
        ob.studentDetail();

    }

}