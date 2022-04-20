package practicaHarry;

public class Voldemort {
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
        testVoldemort();
    }
    public static void testVoldemort(){
        Voldemort voldemort = new Voldemort();
        // Setting parameters
        voldemort.setName("Tom Sorvolo Ryddle");
        voldemort.setGender("Male");
        voldemort.setHouse("Slytherin");
        voldemort.setBoggart("His own dead");
        voldemort.setPatronus("Nagini");
        // Message to show
        System.out.println("Name: " + voldemort.getName() +
                "\nGender: " + voldemort.getGender() +
                "\nHouse: " + voldemort.getHouse() +
                "\nBoggart: " + voldemort.getBoggart() +
                "\nPatronus: " + voldemort.getPatronus());
    }
}
