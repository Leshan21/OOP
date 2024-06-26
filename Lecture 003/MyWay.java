public class MyWay{
    public static final double distance = 100;

    public double needToGo(double displacement){
        return distance - displacement;
    }

    public static void main(String[] args){
        MyWay mydis = new MyWay();

        double distanceToGo = mydis.needToGo(30);

        System.out.println("Distance remaining to travel: "+ distanceToGo +"km");
    }
}