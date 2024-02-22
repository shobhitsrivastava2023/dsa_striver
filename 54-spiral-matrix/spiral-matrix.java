class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mpp = new ArrayList<>();
        //left to right
        // top to bottom
        // right left  
        // bottom top; 
        int row = matrix.length; 
        int col = matrix[0]. length; 
        int top=0;
        int left=0;
        int bottom = row-1; 
        int right= col - 1;

        while(top<=bottom && left<=right){
             for (int i = left; i <= right; i++)
                mpp.add(matrix[top][i]);

            top++;

            for (int i = top; i <= bottom; i++)
                mpp.add(matrix[i][right]);

            right--;

             if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    mpp.add(matrix[bottom][i]);

                bottom--;
            }

               if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    mpp.add(matrix[i][left]);

                left++;
            }

         
        }

           return mpp;


      
        
    }
}