package practicaMona;

public class Steroidtocat extends Octocat{
    public String accessorie01, bodyWear01, bodyWear02;

    public Steroidtocat(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index,
                        String accessorie01, String bodyWear01, String bodyWear02) {
        super(name, body, head, faceColor, bodyColor, eyeColor, limbs, ears, whiskers, index);
        this.accessorie01 = accessorie01;
        this.bodyWear01 = bodyWear01;
        this.bodyWear02 = bodyWear02;
    }

    // Steroidtocat actions
    public void pose(){
        System.out.println("Arms crossed and combing his whiskers, showing his great physique");
    }

    public static void main(String[] args) {
        showSteroidtocat();
    }
    public static void showSteroidtocat(){
        Steroidtocat steroidtocat = new Steroidtocat(
                "Steroidtocat",
                "Octopus Like",
                "Cat Like",
                "Medium Champagne",
                "Black",
                "Unknown",
                5,
                2,
                4,
                106,
                "Sun Glasses",
                "Gray Shirt",
                "Blue Jeans"
        );
        System.out.println("** Octocat 05 **" +
                "\nName --> " + steroidtocat.name +
                "\nIndex Number --> #" + steroidtocat.index +
                "\n** General Description **" +
                "\nBody Type --> " + steroidtocat.body +
                "\nHead Type --> " + steroidtocat.head +
                "\nLimbs --> " + steroidtocat.limbs +
                "\nEars --> " + steroidtocat.ears +
                "\nWhiskers --> " + steroidtocat.whiskers +
                "\nFace Color --> " + steroidtocat.faceColor +
                "\nBody Color --> " + steroidtocat.bodyColor +
                "\nEye Color --> " + steroidtocat.eyeColor +
                "\n** Role **" +
                "\nOutfit --> " + steroidtocat.bodyWear01 + " / " + steroidtocat.bodyWear02 +
                "\nAccessories --> " + steroidtocat.accessorie01);
        steroidtocat.pose();
    }
}
