package practicaMona;

public class Investocat extends Octocat{
    public String headTop, outfit, accessorie01, accessorie02;
    public Investocat(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index, String outfit, String headTop, String accessorie01, String accessorie02) {
        super(name, body, head, faceColor, bodyColor, eyeColor, limbs, ears, whiskers, index);
        this.headTop = headTop;
        this.outfit = outfit;
        this.accessorie01 = accessorie01;
        this.accessorie02 = accessorie02;
    }

    // Investocat actions
    public void pose(){
        System.out.println("Investocat is posing like a private investigaror, smoking pipe and grabing his suitcase");
    }

    public static void main(String[] args) {
        showInvestocat();
    }
    public static void showInvestocat(){
        Investocat investocat = new Investocat(
                "Private Investocat",
                "Octopus Like",
                "Cat Like",
                "White",
                "White",
                "Unknown",
                5,
                2,
                4,
                119,
                "Trench coat",
                "Formal Hat",
                "Suitcase",
                "Pipe"
        );
        System.out.println("** Octocat 02 **" +
                "\nName --> " + investocat.name +
                "\nIndex Number --> #" + investocat.index +
                "\n** General Description **" +
                "\nBody Type --> " + investocat.body +
                "\nHead Type --> " + investocat.head +
                "\nLimbs --> " + investocat.limbs +
                "\nEars --> " + investocat.ears +
                "\nWhiskers --> " + investocat.whiskers +
                "\nFace Color --> " + investocat.faceColor +
                "\nBody Color --> " + investocat.bodyColor +
                "\nEye Color --> " + investocat.eyeColor +
                "\n** Role **" +
                "\nOutfit --> " + investocat.outfit +
                "\nAccessories --> " + investocat.accessorie01 + " / " + investocat.accessorie02);
        investocat.pose();
    }
}
