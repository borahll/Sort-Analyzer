package labs.lab6;

public class GeneralizedQuickSortAnalyzer extends SortAnalyzer{


        public void quickSort(int a, Integer[] arr, int b, int c){
            if(a<b){
                int pivot = part(a, arr, b, c);
                quickSort(pivot+1, arr, b, c); 
                quickSort(a, arr, pivot-1,c); 
            }
        }

        public Comparable[] sort(Comparable[] a) {
            Integer[] arr = (Integer[]) a;
            quickSort(0, arr, arr.length-1, k);
            System.out.println(numberOfComperisons);
            return arr;
            //return (Comparable[])a;
        }
        public int part(int f, Integer[] arr, int l, int k){
            int pivot= arr[l];
            int i = f;
            int i2 = 0;
            while(i2 < k-1){ 
                i=f;
                pivot= arr[l];
                int i3 = f;
                while (i3 < l){
                    if(compare(arr[i3],pivot) < 0){
                        swap(i, arr, i3);
                        i++;
                    }
                    i3++;
                }
                i2++;
                swap(i, arr, l);
            }
            return i;
        }
    
        private static void swap(int i, Integer[] arr, int j){
            Integer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
