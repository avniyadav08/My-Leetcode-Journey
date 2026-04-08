class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max=mat[0][0];
        int row=0,col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(max<mat[i][j]){
                    max=mat[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        return new int[]{row,col};
    }
}