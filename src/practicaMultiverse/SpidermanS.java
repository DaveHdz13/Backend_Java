package practicaMultiverse;

public class SpidermanS extends SpiderMan implements BaseMoves, EnhanceSuit{
    SpidermanS(String name, String alias, String gender, String suitColor01, String suitColor02, String gadgets, int earth) {
        super(name, alias, gender, suitColor01, suitColor02, gadgets, earth);
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
    public void carbonadium() {
        System.out.println("\n** Enhance Suit **" +
                "\nCarbonadium:" +
                "\n  Material included at the interior of the mask in order to prevent mind-swaps.");
    }

    @Override
    public void talons() {
        System.out.println("\nTalons: " +
                "\n  Retractable talons for combat purposes and with capability to inject nano-spiders-tracers.");
    }

    @Override
    public void enhanceLenses() {
        System.out.println("\nEnhance Lenses: " +
                "\n  Octavius added a Heads-Up display to the mask's lenses with HUD and tracking capabilities.");
    }

    @Override
    public void spiderButton() {
        System.out.println("\nSpider Button: " +
                "\n  The spider symbol serves as a remote activation switch for his gadgets.");
    }

    public static void main(String[] args) {
        showSpidermanS();
    }
    public static void showSpidermanS(){
        SpidermanS spidermanS = new SpidermanS(
                "Otto Octavius",
                "Superior Spiderman",
                "Male",
                "Red",
                "Black",
                "Enhance Suit",
                616
        );
        System.out.println("--- Base Characteristics ---" +
                "\nName: " + spidermanS.name +
                "\nAlias: " + spidermanS.alias +
                "\nEarth: #" + spidermanS.earth +
                "\nGender: " + spidermanS.gender +
                "\n--- Suit ---" +
                "\nColors --> " + spidermanS.suitColor01 + " / " + spidermanS.suitColor02 +
                "\nGadgets --> " + spidermanS.gadgets +
                "\n--- Moves ---");
        spidermanS.spiderSense();
        spidermanS.wallCrawling();
        spidermanS.webThrow();
        spidermanS.webSwing();
        spidermanS.superSpeed();
        spidermanS.superStrength();
        spidermanS.carbonadium();
        spidermanS.talons();
        spidermanS.enhanceLenses();
        spidermanS.spiderButton();
    }
}
