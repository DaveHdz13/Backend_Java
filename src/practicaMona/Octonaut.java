package practicaMona;

public class Octonaut extends Octocat{
    public String outfit;

    public Octonaut(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index, String outfit) {
        super(name, body, head, faceColor, bodyColor, eyeColor, limbs, ears, whiskers, index);
        this.outfit = outfit;
    }

    // Octonaut actions.
    public void spaceExploration(){
        System.out.println("Octonaut is exploring space, leaving Earth behind");
    }

    public static void main(String[] args) {
        showOctonaut();
    }
    public static void showOctonaut(){
        Octonaut octonaut = new Octonaut(
                "Octonaut",
                "Octopus Like",
                "Cat Like",
                "Medium Champagne",
                "Black",
                "Brown",
                5,
                2,
                4,
                15,
                "Space Suit"
        );
        System.out.println("** Octocat 01 **" +
                "\nName --> " + octonaut.name +
                "\nIndex Number --> #" + octonaut.index +
                "\n** General Description **" +
                "\nBody Type --> " + octonaut.body +
                "\nHead Type --> " + octonaut.head +
                "\nLimbs --> " + octonaut.limbs +
                "\nEars --> " + octonaut.ears +
                "\nWhiskers --> " + octonaut.whiskers +
                "\nFace Color --> " + octonaut.faceColor +
                "\nBody Color --> " + octonaut.bodyColor +
                "\nEye Color --> " + octonaut.eyeColor +
                "\n** Role **" +
                "\nOutfit --> " + octonaut.outfit);
        octonaut.spaceExploration();
    }
}

