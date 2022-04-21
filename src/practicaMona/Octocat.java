package practicaMona;

public class Octocat {
    public String name, body, head, faceColor, bodyColor, eyeColor;
    public int limbs, ears, whiskers, index;

    public Octocat(String name, String body, String head, String faceColor, String bodyColor, String eyeColor, int limbs, int ears, int whiskers, int index){
        this.name = name;
        this.body = body;
        this.head = head;
        this.faceColor = faceColor;
        this.bodyColor = bodyColor;
        this.eyeColor = eyeColor;
        this.limbs = limbs;
        this.ears = ears;
        this.whiskers = whiskers;
        this.index = index;
    }

    public String msg(){
        return "-- Octocat --" +
                "\nName: " + name +
                "\nIndex: " + index +
                "\nBody Type: " + body +
                "\nHead Type: " + head +
                "\nFace Color: " + faceColor +
                "\nBody Color: " + bodyColor +
                "\nEye Color: " + eyeColor +
                "\nLimbs: " + limbs +
                "\nEars: " + ears +
                "\nWhiskers: " + whiskers;
    }
}
