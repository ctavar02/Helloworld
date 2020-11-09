
public class ProblemTwo {
	public static char removeDuplicateElements(char arr[], n){  
        if (n==0 || n==1){  
            return n;  
        }
        ichar[] temp = new char[n];
        char j = 0;  
        for (char i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        char arr[] = {a,p,p,q,q,e,r,r};  
        char length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (char i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
}
}