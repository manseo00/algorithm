class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public int combination(int balls, int share) {
        if (share == 0 || balls == share) {
            return 1;
        }
        return combination((balls - 1), (share - 1)) + combination((balls - 1), share);
    }
}