package repository_maktab25_HW6_3.src;

public class DemoTurners2 {

    public static void main(String[] args) {

        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        FigLeaf figLeaf = new FigLeaf();
        BayLeaf bayLeaf =  new BayLeaf();

        figLeaf.turn();
        bayLeaf.turn();

        leaf.turn();
        page.turn();
        pancake.turn();

    }

}
