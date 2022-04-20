package practicaHarry;

public class GinyW {
    private String name, gender, house, boggart, patronus;

    public GinyW(String name, String gender, String house, String boggart, String patronus){
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public static void main(String[] args) {
        testGiny();
    }
    public static void testGiny(){
        GinyW ginyW = new GinyW(
                "Ginevra Weasly",
                "Female",
                "Gryffindor",
                "Her or her family members dead",
                "Horse"
        );
        System.out.println("Name: " + ginyW.name +
                "\nGender: " + ginyW.gender +
                "\nHouse: " + ginyW.house +
                "\nBoggart: " + ginyW.boggart +
                "\nPatronus: " + ginyW.patronus);
    }
}
