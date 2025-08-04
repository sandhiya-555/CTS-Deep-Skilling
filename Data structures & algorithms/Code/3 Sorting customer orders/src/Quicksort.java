public class Quicksort {
    public static void quicksort(Order[] order, int low, int high){
        if(low>=high) return;

        int mid=order[low+(high-low)/2].totalPrice;
        int start=low;
        int end=high;
        while(start<=end){
            while(order[start].totalPrice<mid){
                start++;
            }
            while(order[end].totalPrice>mid){
                end--;
            }

            if(start<=end){
                swap(order,start,end);
                start++;
                end--;
            }
        }
        quicksort(order,low,end);
        quicksort(order,start,high);
    }

    public static void swap(Order []order,int a,int b){
        Order temp=order[a];
        order[a]=order[b];
        order[b]=temp;
    }
}
