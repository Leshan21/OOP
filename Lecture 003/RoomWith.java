public class RoomWith {
    public int roomNo;
    public String roomType;
    public float roomArea;
    public boolean acMachine;

    public void setData(int roomNo, String roomType, float roomArea, boolean acMachine){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    public void displayData(){
        System.out.println("roomNo: "+ roomNo);
        System.out.println("roomType: "+ roomType);
        System.out.println("roomArea: "+ roomArea);
        System.out.println("have an acMachine: "+ acMachine);
    }

    public static void main(String[] args) {
        RoomWith rr = new RoomWith();
        rr.setData(2, "small", 2, true);
        rr.displayData();
    }
}


