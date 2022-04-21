package practicaMona;

public class Filmotocat extends Octocat{
    public String accessorie01, accessorie02, accessorie03;

    public Filmotocat(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index, String accessorie01, String accessorie02, String accessorie03) {
        super(name, body, head, faceColor, bodyColor, eyeColor, limbs, ears, whiskers, index);
        this.accessorie01 = accessorie01;
        this.accessorie02 = accessorie02;
        this.accessorie03 = accessorie03;
    }

    // Filmotocat actions
    public void filming(){
        System.out.println("He is filming the next movie");
    }

    public static void main(String[] args) {
        showFilmotocat();
    }
    public static void showFilmotocat(){
        Filmotocat filmcat = new Filmotocat(
                "Filmotocat",
                "Octopus Like",
                "Cat Like",
                "Medium Champagne",
                "Black",
                "Unknown",
                5,
                2,
                4,
                120,
                "Glasses",
                "Camera",
                "Large microphone"
        );
        System.out.println("** Octocat 04 **" +
                "\nName --> " + filmcat.name +
                "\nIndex Number --> #" + filmcat.index +
                "\n** General Description **" +
                "\nBody Type --> " + filmcat.body +
                "\nHead Type --> " + filmcat.head +
                "\nLimbs --> " + filmcat.limbs +
                "\nEars --> " + filmcat.ears +
                "\nWhiskers --> " + filmcat.whiskers +
                "\nFace Color --> " + filmcat.faceColor +
                "\nBody Color --> " + filmcat.bodyColor +
                "\nEye Color --> " + filmcat.eyeColor +
                "\n** Role **" +
                "\nAccessories --> " + filmcat.accessorie01 + " / " + filmcat.accessorie02 + " / " + filmcat.accessorie03);
        filmcat.filming();
    }
}
