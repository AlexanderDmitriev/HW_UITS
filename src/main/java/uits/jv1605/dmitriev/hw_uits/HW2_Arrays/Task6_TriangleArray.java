package uits.jv1605.dmitriev.hw_uits.HW2_Arrays;
public class Task6_TriangleArray {
    public static void triangleArray(){
        String[][]x=new String[5][];
        for (int i=0; i<x.length; i++){
            x[i]=new String[i+1];}
        for (String[] arrayIterator : x) {
            for (int j = 0; j < arrayIterator.length; j++) {
                arrayIterator[j] = "X";
            }
        }
        for (String[] arrayIterator : x) {
            System.out.println(java.util.Arrays.toString(arrayIterator));
        }
        System.out.println();
    // Отражаем по горизонтали 
        String [][]xInvGor=new String[x.length][x.length];
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x.length; j++){
                xInvGor[i][j]=" "; }}
        for (int i=0; i<x.length; i++){
            System.arraycopy(x[i], 0, xInvGor[i], 0, x[i].length);
}
        
        for (int i=0; i<xInvGor.length; i++){
            for (int j=0; j<xInvGor[i].length/2; j++){
                String tmp=xInvGor[i][j];
              xInvGor[i][j]=xInvGor[i][xInvGor.length-j-1];
                xInvGor[i][xInvGor.length-j-1]=tmp;}}  
        for (String[] arrayIterator : xInvGor) {
            System.out.println(java.util.Arrays.toString(arrayIterator));
        }
         System.out.println();
         //Отражаем по вертикали
         String [][]xInvVer=new String[x.length][x.length];
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x.length; j++){
                xInvVer[i][j]=" "; }}
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i].length; j++){
                xInvVer[i][j]=x[i][j]; }}
        String [][]xx=new String[xInvVer.length][xInvVer.length];
        for (int i=0; i<xInvVer.length; i++){
            for (int j=0; j<xInvVer[i].length; j++){
                xx[i][j]=xInvVer[xInvVer.length-i-1][j];
            }}  
         for (int i=0; i<xInvVer.length; i++ ){
        System.out.println(java.util.Arrays.toString(xx[i]));}
      // Отражаем одновременно  по горизонтали и по вертикали
         String [][] xInv2=new String[xInvGor.length][xInvGor.length];
         
         for (int i=0; i<xx.length; i++){
            for (int j=0; j<xx[i].length/2; j++){
                String tmp=xx[i][j];
              xx[i][j]=xx[i][xx.length-j-1];
                xx[i][xx.length-j-1]=tmp;}}  
        for (String[] arrayIterator : xx) {
            System.out.println(java.util.Arrays.toString(arrayIterator));
        }
         System.out.println();
    }
    
    public static void main(String args[]){
        triangleArray();}
}
