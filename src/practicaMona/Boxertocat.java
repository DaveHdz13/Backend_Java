package practicaMona;

public class Boxertocat extends Octocat{
    public String accessorie01, accessorie02, drawStyle;

    public Boxertocat(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index, String accessorie01, String accessorie02, String drawStyle) {
        super(name, body, head, faceColor, bodyColor, eyeColor, limbs, ears, whiskers, index);
        this.accessorie01 = accessorie01;
        this.accessorie02 = accessorie02;
        this.drawStyle = drawStyle;
    }

    // Boxercat actions
    public void fightPose(){
        System.out.println("Just like Rocky he is training to be better at box");
    }

    public static void main(String[] args) {
        showBoxertocat();
    }
    public static void showBoxertocat(){
        Boxertocat bxcat = new Boxertocat(
                "Boxertocat",
                "Octopus Like",
                "Cat Like",
                "Medium Champagne",
                "Black",
                "Black",
                5,
                2,
                4,
                139,
                "Red Headband",
                "Box Gloves",
                "8-bit art"
        );
        System.out.println("** Octocat 03 **" +
                "\nName --> " + bxcat.name +
                "\nIndex Number --> #" + bxcat.index +
                "\n** General Description **" +
                "\nBody Type --> " + bxcat.body +
                "\nHead Type --> " + bxcat.head +
                "\nLimbs --> " + bxcat.limbs +
                "\nEars --> " + bxcat.ears +
                "\nWhiskers --> " + bxcat.whiskers +
                "\nFace Color --> " + bxcat.faceColor +
                "\nBody Color --> " + bxcat.bodyColor +
                "\nEye Color --> " + bxcat.eyeColor +
                "\n** Role **" +
                "\nStyle --> " + bxcat.drawStyle +
                "\nAccessories --> " + bxcat.accessorie01 + " / " + bxcat.accessorie02);
        bxcat.fightPose();
    }
}
