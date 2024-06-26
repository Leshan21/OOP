class Undergraduate{
    private String regNo;
    private String name;
    private int year;
    private double gpa;

    public Undergraduate(String regNo,String name,int year,double gpa){
        this.regNo = regNo;
        this.name = name;
        this.year = year;
        this.gpa = gpa;       
    }

    public String getRegno(){
        return regNo;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public double getGpa(){
        return gpa;
    }

    public void showAward(){
        if(gpa >= 3.7){
            System.out.println("First class");
        }else if(3.3<= gpa && gpa<3.7){
            System.out.println("Second class Upper division");
        }else if(3 <= gpa && gpa <3.3){
            System.out.println("Second class Lower division");
        }else if(2.0 <= gpa && gpa < 3.0){
            System.out.println("pass");
        }
    }

    public static void main(String[] args) {
        Undergraduate jone = new Undergraduate("2021COM100", "jone", 2021, 3.6);
        System.out.println(jone.getName());
        System.out.println(jone.getRegno());
        jone.showAward();
    } 
}