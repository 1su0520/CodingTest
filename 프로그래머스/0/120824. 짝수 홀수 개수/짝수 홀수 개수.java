class Solution {
    public int[] solution(int[] num_list) {
        int jak=0;
        int hol=0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2==0){
                jak++;
            }
            else
                hol++;
        }
        int[] answer={jak, hol};
        return answer;
    }
}