//code for the second largest no in the array

public class secondLargestNoInArray {
        int print2largest(int arr[], int n) {
            // code here
            int first, second;
            first = second = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>first){
                    second=first;
                    first = arr[i];
                }
                if(arr[i]>second ){
                    if(arr[i]<first){
                        second=arr[i];                                                                                  
                    }
                }
            }
             if(arr.length<2)
                return -1;
              
               else if (second == Integer.MIN_VALUE)
                return -1;
        
                else{return second;}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        }
    }

    // second method
    int print2largest(int arr[], int n) {
        // code here
        int f = arr[0];
        int s = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > f) {
                s = f;
                f = arr[i];
            } else if(arr[i] > s && arr[i] < f) {
                s = arr[i];
            } else if(f==s && arr[i] < s) {
                s = arr[i];
            }
        }
        
        if(f == s) {
            return -1;
        } else {
            return s;
        }
}

