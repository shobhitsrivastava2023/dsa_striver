import java.util.*;
class Solution {
   
    public void setZeroes(int[][] matrix){
        int row = matrix.length;
        int cols = matrix[0].length;
        
        int[] rowarry = new  int[row];
        int[] colarry = new  int[cols];

        for(int i =0 ; i<row; i++){
            for(int j= 0; j< cols; j++){
                if(matrix[i][j]==0){
                    rowarry[i] = 1;
                    colarry[j] = 1;

                }
            }
        }

        for(int i =0 ; i<row; i++){
            for(int j= 0; j< cols; j++){
                if(rowarry[i]==1 || colarry[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    }