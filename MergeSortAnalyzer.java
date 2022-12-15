package labs.lab6;

class MergeSortAnalyzer extends SortAnalyzer{

        public static void sort(Comparable[] a, int l, Comparable[] b, int r)
        {
            if (r <= l + 1) return;
            int m = l + (r - l) / 2;
            sort(a, l, b, m);
            sort(a, m, b, r);
            merge(a, l, b, m, r);
        }
        
        public static void merge(Comparable[] a, int l, Comparable[] b, int m, int r)
        {
            //int r=ri-1;
            int k1 = l;
            while(k1 < r){ 
            b[k1] = a[k1]; k1++;
            }
            int i = l, j = m;
            int c = l;
            while (c < r){
                if (i >= m){
                    a[c] = b[j++];
                }
                else if (j >= r){ 
                    a[c] = b[i++];
                }
                else if (SortAnalyzer.compare(b[j], b[i]) < 0){ 
                    a[c] = b[j++];
                }
                else{ 
                    a[c] = b[i++];
                }
                c++;
            }
        }
        public Comparable[] sort(Comparable[] a)
        {
            Comparable[] b = new Comparable[a.length];
            sort(a,0, b, a.length);
            System.out.println(getNumberOfComporisons());
            return a;
        }
        
}