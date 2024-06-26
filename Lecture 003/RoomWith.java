public class RoomWith {
    public int roomNo;
    public String roomType;
    public float roomArea;
    public boolean acMachine;

    void setData(int roomNo, String roomType, float roomArea, boolean acMachine){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    void displayData(){
        System.out.println("roomNo: "+ roomNo);
        System.out.println("roomType: "+ roomType);
        System.out.println("roomArea: "+ roomArea);
        System.out.println("have an acMachine: "+ acMachine);
    }

    public static void main(String[] args) {
        RoomWith rr = new RoomWith();
        rr.setData(2, "small", 278, true);
        rr.displayData();
    }
}




Write a java program to do the following tasks.
i.	Create a java class Room with,
three instance variables:
•	roomNo as a int primitive type
•	roomType as a String primitive type
•	roomArea as a float primitive type
•	acMachine as a boolean primitive type
a method setData(),accepts the values for instances variables via parameters and assign to them.
a method displayData(),display the values of the instances variables.

ii.	Write a java class TestRoom which has a main() method to instantiate the class Room and invoke all the member methods of the class Room.