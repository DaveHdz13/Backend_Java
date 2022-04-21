package practicaMona;

public class TopOctocat extends Octocat{
    public String accessoire01, accessorie02, bodyWear;

    public TopOctocat(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index, String accessoire01, String accessorie02, String bodyWear) {
        super(name, body, head, faceColor, bodyColor, eyeColor, limbs, ears, whiskers, index);
        this.accessoire01 = accessoire01;
        this.accessorie02 = accessorie02;
        this.bodyWear = bodyWear;
    }

    // Topguntocat actions
    public void pose(){
        System.out.println("Using all his accessories and preparing to fly");
    }

    public static void main(String[] args) {
        showTopguncat();
    }
    public static void showTopguncat(){
        TopOctocat topOctocat = new TopOctocat(
                "Topguntocat",
                "Octopus Like",
                "Cat Like",
                "Medium Champagne",
                "Black",
                "Brown",
                5,
                2,
                4,
                111,
                "Pilot Helmet",
                "Pilot Mask",
                "Pilot Suit"
        );
        System.out.println("** Octocat 06 **" +
                "\nName --> " + topOctocat.name +
                "\nIndex Number --> #" + topOctocat.index +
                "\n** General Description **" +
                "\nBody Type --> " + topOctocat.body +
                "\nHead Type --> " + topOctocat.head +
                "\nLimbs --> " + topOctocat.limbs +
                "\nEars --> " + topOctocat.ears +
                "\nWhiskers --> " + topOctocat.whiskers +
                "\nFace Color --> " + topOctocat.faceColor +
                "\nBody Color --> " + topOctocat.bodyColor +
                "\nEye Color --> " + topOctocat.eyeColor +
                "\n** Role **" +
                "\nOutfit --> " + topOctocat.bodyWear +
                "\nAccessories --> " + topOctocat.accessoire01 + " / " + topOctocat.accessorie02);
        topOctocat.pose();
    }
}
