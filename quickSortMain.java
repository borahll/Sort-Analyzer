package labs.lab6;

public class quickSortMain {
    public static void main(String[] args) {
        QuickSortAnalyzer qs = new QuickSortAnalyzer();
        GeneralizedQuickSortAnalyzer gqs = new GeneralizedQuickSortAnalyzer();

        DecreasingArrayGenerator dec = new DecreasingArrayGenerator();
        IncreasingArrayGenerator inc = new IncreasingArrayGenerator();
        RandomArrayGenerator rand = new RandomArrayGenerator();

        //Integer[] decArr = dec.generate(10);
        Integer[] incArr = inc.generate(10);
        Integer[] randArr = rand.generate(10);
        Integer[] decArr2 = dec.generate(10);

        
        System.out.println(qs.sort(decArr2));
        System.out.println(dec.toString());
        System.out.println(qs.isSorted(decArr2));

        System.out.println(qs.sort(incArr));
        System.out.println(inc.toString());
        System.out.println(qs.isSorted(incArr));


        System.out.println(qs.sort(randArr));
        System.out.println(rand.toString());
        System.out.println(qs.isSorted(randArr));

        

        System.out.println(inc.toString());
        System.out.println(gqs.sort(incArr));
        System.out.println(inc.toString());
        /*
        System.out.println(rand.toString());
        System.out.println(gqs.sort(randArr));
        System.out.println(rand.toString());

        System.out.println(dec.toString());
        System.out.println(gqs.sort(decArr2));
        System.out.println(dec.toString());
        */
    }
}
