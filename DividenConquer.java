public class DividenConquer {
 

  public static int search(int arr[] , int si , int tar , int ei){
 if (si>ei) {//base case
     return -1;
 }
 


 //kaam
 int mid  = si + (ei-si)/2;
 
 if(arr[mid]==tar){
     return mid;
 }

 //mid lies on L1
 if(arr[si]<=arr[mid]){
      //case a;
       if(arr[si]<=tar && tar<=arr[mid]){
            return search(arr, si, tar, mid-1);
       } else{
         return search(arr, mid+1, tar, ei);
       }
 } else{ //lies on L2
       // case c:
        if(arr[mid]<=tar && tar<=arr[ei]){
          return search(arr, mid+1, tar, ei); 
        } else{
            return search(arr, si, tar, mid-1);
        }
 }
  }

      
      
   public static void main(String args[]) {
      int arr[] = { 4,5,6,7,0,1,2};
    int tarIdx = search(arr, 0, 0, arr.length-1); 
    System.out.println(tarIdx);
    }
}