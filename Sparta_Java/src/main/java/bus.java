class PublicTransportation{
    int public_num;
    int fuel_capacity = 100;
    int speed = 0;
    int change_speed;
    int max_passenger;
    int current_passenger = 0;
    int price;
    String state;

    // default constructor
    public PublicTransportation() {};

    public void SetOperations(String state) {
        if (fuel_capacity > 10) {
            this.state = state;
        } else {
            System.out.println("주유 필요");
        }
    }

    public void ChangeBusState() {
        if (fuel_capacity <= 0) {
            this.state = "차고지행";
        } else if (fuel_capacity<10) {
            System.out.println("주유가 필요하다");
        } else {
            this.state = "운행";
        }
    }


    public void BoardingBus(int passenger) {

        if (current_passenger <= max_passenger && state.equals("운행")){
            current_passenger += passenger;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (max_passenger-current_passenger));
            System.out.println("요금 확인 = " + price * passenger);
            ; } else {
            System.out.println("최대 승객 수 초과");

        }
    }


    public void BoardingTaxi(int passenger, String destination, int Distance) {

        if (state.equals("일반") && current_passenger<=max_passenger) {
            current_passenger += passenger;
            state = "운행중";
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (max_passenger - current_passenger));
            System.out.println("기본 요금 확인 = " + price);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지의 거리 = " + Distance);


        } else {
            System.out.println("탑승불가");
        }

    }





}

class Bus extends PublicTransportation{

    public Bus(int num) {
        super.public_num = num;
        super.state = "운행";
        super.max_passenger = 30;
        super.price = 1000;
        System.out.println(num + "번 버스가 생성되었습니다");
    }




}



class Taxi extends PublicTransportation{
    String destination;
    int Distance;
    int distanceDefault = 1;
    int chargeDefault = 3000;
    int extra_charge = 1000;
    int current_passenger;

    public Taxi(int num) {
        super.public_num = num;
        super.state = "일반";
        super.max_passenger = 4;
        super.current_passenger = current_passenger;
        super.price = 3000;
        System.out.println(num + "번 택시가 생성되었습니다");
    }

    public void BoardingTaxi(int passenger, String destination, int Distance) {
        if (Distance > 1) {
            ExtraCharge(Distance);
        }
    }

    public void ExtraCharge(int Distance) {
        price = 3000 + (Distance-1) * extra_charge;
        System.out.println("지불할 요금 = " + price);
        System.out.println("상태 = " + state);
    }


}



public class bus {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        Bus bus1 = new Bus(452);
        Bus bus2 = new Bus(470);
        Taxi taxi1 = new Taxi(7122);

//bus1.BoardingBus(5);
//bus1.BoardingBus(7);
        taxi1.BoardingTaxi(2,"서울역",2);




    }

}