package practicaHarry;

public class SeverusS {
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
        testSeverus();
    }
    public static void testSeverus(){
        SeverusS severusS = new SeverusS();
        // Setting parameters
        severusS.setName("Severus Snape");
        severusS.setGender("Male");
        severusS.setHouse("Slytherin");
        severusS.setBoggart("Lord Voldemort");
        severusS.setPatronus("Doe");
        // Message to show
        System.out.println("Name: " + severusS.getName() +
                "\nGender: " + severusS.getGender() +
                "\nHouse: " + severusS.getHouse() +
                "\nBoggart: " + severusS.getBoggart() +
                "\nPatronus: " + severusS.getPatronus());
    }
}
