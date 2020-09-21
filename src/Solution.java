
class Solution {


    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int result = cal(x, 0, x);
        return result;
    }

    private int cal(int target, int start, int end) {
        int result = (start + end) / 2;
        if (result == start) {
            //46340*46340 越界
            if (target / end >= end) {
                return end;
            }
            if (start > 0) {
                return start;
            }
        }
//        //位数*2-1<= target的w位数
//        if (String.valueOf(result).length() * 2 - 1 > String.valueOf(target).length()) {
//            result = cal(target, 0, result);
//        }
        int divde = target / result;
        if (divde > result) {
            result = cal(target, result, end);
        } else if (divde < result) {
            result = cal(target, start, result);
        }
        return result;
    }

    /****************************/
    public boolean validUtf8(int[] data) {
        int head = data[0];

        return true;
    }
}
