package practicaMultiverse;

public class SpidermanGR extends SpiderMan implements BaseMoves, GhostRider{
    public String headStyle;

    SpidermanGR(String name, String alias, String gender, String suitColor01, String suitColor02, String gadgets, int earth, String headStyle) {
        super(name, alias, gender, suitColor01, suitColor02, gadgets, earth);
        this.headStyle = headStyle;
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
                "\n  Super human strength applied to other attributes and powers as well");
    }

    @Override
    public void demonicTransform() {
        System.out.println("\nDemonic Transform: " +
                "\n  He can transform into Ghost Rider at will.");
    }

    @Override
    public void superNaturalAware() {
        System.out.println("\n** Ghost Rider ** (possible abilities)" +
                "\nSuper Natural Aware: " +
                "\n  It allows him to detect any supernatural occurrences around him.");
    }

    @Override
    public void hellfireManipulation() {
        System.out.println("\nHellfire Manipulation: " +
                "\n  Ability to generate, control and protect mystical fire.");
    }

    @Override
    public void penanceStare() {
        System.out.println("\nPenance Stare: " +
                "\n  Any individual who stares to his eyes will feel every bit of pain they have inflicted on anyone for eternity.");
    }

    public static void main(String[] args) {
        showSpidermanGR();
    }
    public static void showSpidermanGR(){
        SpidermanGR spidermanGR = new SpidermanGR(
                "Peter Parker",
                "Ghost Spider",
                "Male",
                "White",
                "Black",
                "Web Shooters",
                11638,
                "Fired Skull Head"
        );
        System.out.println("--- Base Characteristics ---" +
                "\nName: " + spidermanGR.name +
                "\nAlias: " + spidermanGR.alias +
                "\nEarth: #" + spidermanGR.earth +
                "\nGender: " + spidermanGR.gender +
                "\n--- Suit ---" +
                "\nColors --> " + spidermanGR.suitColor01 + " / " + spidermanGR.suitColor02 +
                "\nGadgets --> " + spidermanGR.gadgets +
                "\nStyle --> " + spidermanGR.headStyle +
                "\n--- Moves ---");
        spidermanGR.spiderSense();
        spidermanGR.wallCrawling();
        spidermanGR.webThrow();
        spidermanGR.webSwing();
        spidermanGR.superSpeed();
        spidermanGR.superStrength();
        spidermanGR.demonicTransform();
        spidermanGR.superNaturalAware();
        spidermanGR.hellfireManipulation();
        spidermanGR.penanceStare();
    }
}
