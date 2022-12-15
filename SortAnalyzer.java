package labs.lab6;

public abstract class SortAnalyzer{
    public static int numberOfComperisons;
    protected static int k = 3;
    public int getNumberOfComporisons(){
        return numberOfComperisons;
    }
    protected static int compare(Comparable c1, Comparable c2){
        if(c1 instanceof Integer && c2 instanceof Integer){
            Integer c3 = (Integer) c1;
            Integer c4 = (Integer) c2;
            numberOfComperisons++;
            return c3.compareTo(c4);
        }
        else{
            return -2;
        }
    }
    public boolean isSorted(Comparable<Integer>[] arr){
        numberOfComperisons = 0;
        boolean decreasing = true;
        boolean increasing = true;
        if(compare(arr[0], arr[1]) < 0){increasing = false;}
        else if(compare(arr[0], arr[1]) > 0){decreasing = false;}
        for(int a = 0; a < arr.length - 1; a++){
            if(compare(arr[a], arr[a+1]) > 0 && decreasing){
                return false;
            }
            else if(compare(arr[a], arr[a+1]) < 0 && increasing){
                return false;
            }
        }
        return true;
    }
    public abstract Comparable<Integer>[] sort(Comparable<Integer>[] arr);
}
