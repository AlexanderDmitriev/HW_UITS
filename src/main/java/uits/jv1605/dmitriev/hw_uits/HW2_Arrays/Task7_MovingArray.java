package uits.jv1605.dmitriev.hw_uits.HW2_Arrays;
public class Task7_MovingArray {
    public static void arr(int [][]a, int n){
        // Влево
        int aTemp [][]=new int [a.length][a.length];
        int aTemp2 [][]=new int [a.length][a.length];
        for (int i=0 ;i<a.length; i++ ){
            System.arraycopy(a[i], 0, aTemp[i], 0, n);
            } 
       for (int i=0 ;i<a.length; i++ ){
            for (int j=0; j<a[i].length-n; j++){
                aTemp2[i][j]=a[i][j+n];
                }
       }
      for (int i=0 ;i<a.length; i++ ){
            System.arraycopy(aTemp2[i], 0, a[i], 0, n-1);
            } 

    for (int i=0 ;i<a.length; i++ ){
            for (int j=0; j<a[i].length-1; j++){
                  a[i][j+n-1]=aTemp[i][j];
                }
            }
        for (int[] arrayIterator : a) {
            System.out.println(java.util.Arrays.toString(arrayIterator));
        }
        System.out.println();
     
    }
    public static void main(String args[]){
        int [][] array={{1,2,3},{4,5,6},{7,8,9}};
        arr(array,2);}
}
