package labs.lab6;

public class QuickSortAnalyzer extends SortAnalyzer{

    void sort(Comparable[] b, int low, int high)
    {
        if (low < high)
        {
            int pi = part(b, low, high);
            sort(b, low, pi-1);
            sort(b, pi+1, high);
        }
    }

    int part(Comparable[] b, int low, int high)
    {
        Integer p = (Integer)b[high]; 
        int i = (low-1);
        int j = low;
        while (j<high)
        {
            if (compare(b[j], p) <= 0)
            {
                i++;
                Integer temp = (Integer)b[i];
                b[i] = b[j];
                b[j] = temp;
            }
            j++;
        }
        Integer temp = (Integer)b[i+1];
        b[i+1] = b[high];
        b[high] = temp;
  
        return i+1;
    }
    public Comparable[] sort(Comparable[] a){
        sort(a, 0, a.length - 1);
        System.out.println(numberOfComperisons);
        return a;
    }
}
