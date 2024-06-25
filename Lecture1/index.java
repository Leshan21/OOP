public class index {
    public static void main(String[] args) {
        Undergraduate kamal = new Undergraduate("2021COM101", "kamal", 2021, 3.4);

        System.out.println(kamal.getGpa());
        kamal.showAward();
    }
}
