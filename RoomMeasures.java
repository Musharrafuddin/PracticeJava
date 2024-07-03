public class RectangleRoom {
    void measures(int l,int b) {
        synchronized (this){
        System.out.println("Area"+(l*b));
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Perimeter"+(2*(l*b)));
    }
}
}


//Taking the room measurements
public class RoomMeasures extends Thread{
RectangleRoom r;
int l,b;
public RoomMeasures(int l,int b,RectangleRoom r){
    super();
    this.l=l;
    this.b=b;
    this.r=r;
}
public void run(){
    r.measures(l,b);
}
public static void main(String args[]){
    RectangleRoom rectangle=new RectangleRoom();
    RoomMeasures room=new RoomMeasures(10,20,rectangle);
    room.start();
    RoomMeasures room1=new RoomMeasures(30,40,rectangle);
    room1.start();
}
}
