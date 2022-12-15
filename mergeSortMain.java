package labs.lab6;

public class mergeSortMain {
    public static void main(String[] args) {
        RandomArrayGenerator rand = new RandomArrayGenerator();
        IncreasingArrayGenerator incArr = new IncreasingArrayGenerator();
        DecreasingArrayGenerator deArr = new DecreasingArrayGenerator();
        MergeSortAnalyzer merg = new MergeSortAnalyzer();
        System.out.println("sorting decreasing array");
        Integer[] increasing = incArr.generate(8);
        Integer[] random = rand.generate(8);
        Integer[] decreasing = deArr.generate(8);


        System.out.println((merg.sort(increasing)));
        System.out.println(incArr.toString());
        System.out.println(merg.isSorted(increasing));


        System.out.println(merg.sort(random));
        System.out.println(rand.toString());
        System.out.println(merg.isSorted(random));


        System.out.println(merg.sort(decreasing));
        System.out.println(deArr.toString());
        System.out.println(merg.isSorted(decreasing));
    }
}
