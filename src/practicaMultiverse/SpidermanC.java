package practicaMultiverse;

public class SpidermanC extends SpiderMan implements BaseMoves, UniPower{
    public String suitDeco;

    SpidermanC(String name, String alias, String gender, String suitColor01, String suitColor02, String gadgets, int earth, String suitDeco) {
        super(name, alias, gender, suitColor01, suitColor02, gadgets, earth);
        this.suitDeco = suitDeco;
    }

    @Override
    public void spiderSense() {
        System.out.println("\nSpider Sense: " +
                "\n  Extra sensorial ability to warn of potential danger '''(O.O)''' ");
    }

    @Override
    public void wallCrawling() {
        System.out.println("\nWall Crawling: " +
                "\n  Affects the atraction between the surface and him, using his hands and feet.");
    }

    @Override
    public void webThrow() {
        System.out.println("\nWeb Throw: " +
                "\n  He can throw web through gadgets on his wrist.");
    }

    @Override
    public void webSwing() {
        System.out.println("\nWeb Swing: " +
                "\n  Throwing his web into a surface allows him to swing.");
    }

    @Override
    public void superSpeed() {
        System.out.println("\nSuper Speed: " +
                "\n  Super human speed applied to other attributes and powers as well.");
    }

    @Override
    public void superStrength() {
        System.out.println("\nSuper Strength: " +
                "\n  Super human strength applied to other attributes and powers as well.");
    }

    @Override
    public void superSight() {
        System.out.println("\n** Uni Power **" +
                "\nSuper Sight: " +
                "\n  It allows him to see things clearly from a huge distance.");
    }

    @Override
    public void superHearing() {
        System.out.println("\nSuper Hearing: " +
                "\n  It allows him to hear a whisper to a huge distance.");
    }

    @Override
    public void matterManipulation() {
        System.out.println("\nMatter Manipulation: " +
                "\n  He can divert energy flow in a different direction or convert it. This power allows him to fly.");
    }

    @Override
    public void energyBlast() {
        System.out.println("\nEnergy Blast: " +
                "\n  He can shoot concentrated blast of energy from his hands.");
    }

    @Override
    public void molecularChange() {
        System.out.println("\nMolecular Change: " +
                "\n  He can make his web as hard as adamantium or change his form.");
    }

    public static void main(String[] args) {
        showSpiderC();
    }
    public static void showSpiderC(){
        SpidermanC spidermanC = new SpidermanC(
                "Peter Parker",
                "Captain Universe",
                "Male",
                "White",
                "Blue Navy",
                "None",
                13,
                "Stars within Blue Navy"
        );
        System.out.println("--- Base Characteristics ---" +
                "\nName: " + spidermanC.name +
                "\nAlias: " + spidermanC.alias +
                "\nEarth: #" + spidermanC.earth +
                "\nGender: " + spidermanC.gender +
                "\n--- Suit ---" +
                "\nColors --> " + spidermanC.suitColor01 + " / " + spidermanC.suitColor02 +
                "\nGadgets --> " + spidermanC.gadgets +
                "\nStyle --> " + spidermanC.suitDeco +
                "\n--- Moves ---");
        spidermanC.spiderSense();
        spidermanC.wallCrawling();
        spidermanC.webThrow();
        spidermanC.webSwing();
        spidermanC.superSpeed();
        spidermanC.superStrength();
        spidermanC.superSight();
        spidermanC.superHearing();
        spidermanC.matterManipulation();
        spidermanC.energyBlast();
        spidermanC.molecularChange();
    }
}
