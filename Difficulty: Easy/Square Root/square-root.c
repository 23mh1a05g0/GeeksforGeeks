int floorSqrt(int n) {
    // Your code goes here
    int left = 0;
    int right = n;
    int res = 0;
    while( left <= right){
        int mid = left + (right - left) / 2;
        if((long) mid * mid > n){
            right = mid - 1;
        }else if((long) mid * mid < n){
            left = mid + 1;
            res = mid;
        }else{
            return mid;
        }
    }
    return res;
}