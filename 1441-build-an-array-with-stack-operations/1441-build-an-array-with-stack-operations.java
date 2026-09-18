class Solution {
    boolean check(int n, int[] nums){
        for(int x:nums){
            if(n==x){
                return false;
            }
        }
        return true;
    }
    public List<String> buildArray(int[] target, int n) {
        List<String> list =  new ArrayList<>();
        int len = target.length, top=0,  i=1;;
        while(top<len&&i<=n){
            list.add("Push");
            top++;
            if(check(i,target)){
                top--;
                list.add("Pop");
            }
            i++;
        }
        return list;
    }
}