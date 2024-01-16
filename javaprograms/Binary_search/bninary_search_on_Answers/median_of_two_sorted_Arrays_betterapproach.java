package Binary_search.bninary_search_on_Answers;

public class median_of_two_sorted_Arrays_betterapproach {
    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]={2};
        System.out.println(median(arr1, arr2));
    }
    public static double median(int []arr1,int []arr2){
        int n1 = arr1.length;
        int n2 =arr2.length;
        int n=n1+n2;
        int index1 = n/2;
        int index2 = (n/2)-1;
        int i = 0;
        int j = 0;
        int count = 0;
        int ele1 = -1;
        int ele2 = -1;
        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(count==index1) ele1 = arr1[i];
                if(count==index2) ele2 = arr1[i];
                count++;
                i++;
             }else{
                if(count==index1) ele1 = arr2[j];
                if(count==index2) ele2 = arr2[j];
                count++;
                j++;
             }
        }
        while(i<n1){
            if(count==index1) ele1 = arr1[i];
            if(count==index2) ele2 = arr1[i];
            count++;
            i++;
        }
        while(j<n2){
            if(count==index1) ele1 = arr2[j];
            if(count==index2) ele2 = arr2[j];
            count++;
            j++;
        }
        if(n%2!=0) return (double)ele1;
        else return (double)(ele1+ele2)/2.0;
    }
}
