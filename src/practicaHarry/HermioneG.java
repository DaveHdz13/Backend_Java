package practicaHarry;

public class HermioneG {
    private String name, gender, house, boggart, patronus;

    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getHouse(){  return house;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender){
        if (!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setHouse(String house){
        if (!house.isEmpty()){
            this.house = house;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String showMsg(){
        return "Name: " + name +
                "Gender: " + gender +
                "House: " + house +
                "Boggart: " + boggart +
                "Patronus: " + patronus;
    }

    public static void main(String[] args) {
        testHermione();
    }

    private static void testHermione(){
        HermioneG hermioneG = new HermioneG();
        // Setting parameters
        hermioneG.setName("Hermione Granger");
        hermioneG.setGender("Female");
        hermioneG.setHouse("Gryffindor");
        hermioneG.setBoggart("Professor McGonagall said she failed on all exams (Failure in general)");
        hermioneG.setPatronus("Otter");
        // Message to show
        System.out.println("Name: " + hermioneG.getName() +
                "\nGender: " + hermioneG.getGender() +
                "\nHouse: " + hermioneG.getHouse() +
                "\nBoggart: " + hermioneG.getBoggart() +
                "\nPatronus: " + hermioneG.getPatronus());
    }
}
