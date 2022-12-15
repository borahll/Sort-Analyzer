package labs.lab6;


public class genMergeSort{
    public static void main(String[] args) {
        GeneralizedMergeSortAnalyzer genMerg = new GeneralizedMergeSortAnalyzer();
        RandomArrayGenerator rand = new RandomArrayGenerator();
        DecreasingArrayGenerator dec = new DecreasingArrayGenerator();
        IncreasingArrayGenerator inc = new IncreasingArrayGenerator();
        Integer[] randArr = rand.generate(16);
        Integer[] decArr = dec.generate(16);
        Integer[] inArr = inc.generate(16);
        System.out.println(dec.toString());
        genMerg.isSorted(decArr);
        genMerg.sort(decArr);
        System.out.println(dec.toString());
        System.out.println(genMerg.isSorted(decArr));
    }
}
