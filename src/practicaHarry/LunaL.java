package practicaHarry;

public class LunaL {
    private String name, gender, house, boggart, patronus;
    
    public LunaL(String name, String gender, String house, String boggart, String patronus){
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public static void main(String[] args) {
        testLuna();
    }
    public static void testLuna(){
        LunaL lunaL = new LunaL(
                "Luna Lovegood",
                "Female",
                "Ravenclaw",
                "Her father Xenophilius Lovegood",
                "Hare"
        );
        System.out.println("Name: " + lunaL.name +
                "\nGender: " + lunaL.gender +
                "\nHouse: " + lunaL.house +
                "\nBoggart: " + lunaL.boggart +
                "\nPatronus: " + lunaL.patronus);
    }
}
