public class Sorting_Main {
    static void Bubble_Sort(int a[]) {
        int i, j, temp;
        for (i = 0; i < a.length - 1; i++) // n=5 length=5 length-1--> 4 0,1,2,3 passes
        {
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void Selection_Sort(int a[]) {
        int i, j, min, pos;
        for (i = 0; i < a.length - 1; i++) // n=5 length=5 length-1--> 4 0,1,2,3 passes
        {
            min = a[i];
            pos = i;

            for (j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            } // min found
            a[pos] = a[i];
            a[i] = min;
        }
    }

    static void Insertion_Sort(int a[]) {
        int i, j, new_element;
        for (i = 0; i < a.length - 1; i++) {
            j = i + 1;
            new_element = a[j];
            while (j > 0 && a[j - 1] > new_element) {
                a[j] = a[j - 1];// come back
                j--;
            }
            a[j] = new_element;
        }
    }

    static void Merger(int a[], int start, int mid, int end) {
        int i, j, ti;
        int t_a[] = new int[a.length];
        i = start;
        j = mid + 1;
        ti = start;
        while (i <= mid && j <= end) {
            if (a[i] < a[j])
                t_a[ti++] = a[i++];
            else
                t_a[ti++] = a[j++];
        }
        while (i <= mid)// left from i
            t_a[ti++] = a[i++];
        while (j <= end)// left from j
            t_a[ti++] = a[j++];

        // swap back to a
        for (i = start; i <= end; i++)
            a[i] = t_a[i];
    }

    static void Merge_Sort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Merge_Sort(a, start, mid);
            Merge_Sort(a, mid + 1, end);
            Merger(a, start, mid, end);// conquer
        }
    }

    static void print_array(int a[]) {
        System.out.println("\nArray has");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ", ");
    }

    static void Heap_Sort(int a[])
    {
        int i, j, pointer;// pointer:child pointer/2:parent
        for (i = a.length - 1; i > 0; i--)
        {
            for (j = 0; j <= i; j++)
            {
                pointer = j;
                while (pointer > 0 && pointer / 2 >= 0)
                {
                    if (a[pointer / 2] < a[pointer])
                    // parent < child
                    {

                        int temp = a[pointer];

                        a[pointer] = a[pointer / 2];

                        a[pointer / 2] = temp;

                    } // if
                    pointer = pointer / 2;
                } // while
            } // for j
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
        } // for i
    }// code

    public static void main(String args[]) {
        //int a[] = { 88, 11, 33, 22, 66, 111, 55, 77, 44, 99 };
        int a[] = {20,5,15,10,9};
        print_array(a);
        // Bubble_Sort(a);
        // Selection_Sort(a);
        // Insertion_Sort(a);
        // Merge_Sort(a, 0, a.length - 1);
        // Quick_Sort();
        Heap_Sort(a);
        print_array(a);
    }

}