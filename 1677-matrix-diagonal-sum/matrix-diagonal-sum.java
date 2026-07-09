class Solution {
    public int diagonalSum(int[][] mat) {
        int p =0 ;
        int s = 0;
          for(int i =0 ; i< mat.length ; i++){
            
            for(int j =0 ; j< mat[i].length; j++){
                if(i == j ){
                    p = p +mat[i][j];
                }
                if(i + j == mat.length - 1){
                  s = s + mat[i][j];
                }
               
            }
          }
            if (mat.length % 2 == 1) {
            int mid = mat.length / 2;
            return p + s - mat[mid][mid];
        }
          return p+s;

    }
}