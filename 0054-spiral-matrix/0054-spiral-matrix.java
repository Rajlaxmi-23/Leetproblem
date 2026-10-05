class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length ==0){
            return new ArrayList<>();
        }
        List<Integer> order = new ArrayList<>();
        int top=0;
        int btm=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;
        while(top<=btm && left<=right){
            for(int i=left;i<=right;i++){
                order.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=btm;i++){
                order.add(matrix[i][right]);
            }
            right--;
            if(top<=btm){
                for(int i=right;i>=left;i--){
                    order.add(matrix[btm][i]);
                }
                btm--;
            }
            if(left<=right){
                for(int i=btm;i>=top;i--){
                    order.add(matrix[i][left]);
                }
                left++;
            }
        }
        return order;
    }
}