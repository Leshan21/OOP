class Undergraduate{
    String regNo;
    String name;
    int year;
    double gpa;

    void setData(String regNo,String name,int year,double gpa){
        this.regNo = regNo;
        this.name = name;
        this.year = year;
        this.gpa = gpa;       
    }

    void displayData(){
        System.out.println("regNo: "+ regNo);
        System.out.println("name: "+ name);
        System.out.println("year: "+ year);
        System.out.println("gpa: "+gpa);
    }

    void showAward(){
        if(gpa > 3.7){
            System.out.println("First class");
        }else if(3.3< gpa && gpa<3.7){
            System.out.println("Second class Upper division");
        }else if(3 < gpa && gpa <3.3){
            System.out.println("Second class Lower division");
        }else if(2.0 < gpa && gpa < 3.0){
            System.out.println("pass");
        }
    }

    public static void main(String[] args) {
        Undergraduate uu = new Undergraduate();
        uu.setData("2021Com101", "Leshan", 2021, 3.2);
        uu.displayData();
        uu.showAward();
    } 
}