public class MergeSort {


    public static void mergeSort(int[] arr,int s, int e){

        if(s>= e)
            return;

        int mid = s + (e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);

    }

    public static void merge(int[] arr,int s,int mid, int e){

        int[] temp = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j <= e){
            if(arr[i] <= arr[j]){
                temp[k]=arr[i++];
            }else{
                temp[k]=arr[j++];
            }
            k++;
        }

        while(i<= mid){
            temp[k]=arr[i++];
            k++;
        }
        while(j<= e){
            temp[k]=arr[j++];
            k++;
        }

        for (k = 0,i=s; k < temp.length; i++,k++) {
            arr[i] = temp[k];
        }
    }

    public static void print(int[]arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {7,5,9,4,2,89,1};
        mergeSort(arr,0,arr.length-1);
        print(arr);
    }
}
