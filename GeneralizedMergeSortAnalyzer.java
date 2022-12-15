package labs.lab6;

public class GeneralizedMergeSortAnalyzer extends SortAnalyzer {

    private static void sort(Integer[] arr, int start, int finish, int k){
        if(finish <= start + 1){ return;}
            if(finish - start + 1 <= k){
                for(int i = 0; i < arr.length - 1; i++){
                    Integer index = i;
                        for(int j = i + 1; j < arr.length; j++){
                            if(compare(arr[j] , arr[index]) < 0)
                                index = j;
                        }
                    Integer smaller = (Integer)arr[index];   
                    arr[index] = arr[i];  
                    arr[i] = smaller;
                }
                return;
            }
            sort(arr, start + k , finish, k);
            sort(arr, start, start + k - 1, k);
            Comparable[] temp = new Comparable[arr.length];
            MergeSortAnalyzer.merge((Comparable[])arr, start, temp ,start + k -1, finish);
        }
    public Comparable[] sort(Comparable[] arr){
        sort((Integer[])arr, 0, arr.length, SortAnalyzer.k);
        System.out.println(numberOfComperisons);
        return arr;
    }
}
