class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);
        return ans;
    }

    private void solve(String current, int open, int closed, int total, List<String> ans){
        if(current.length() == 2*total){
            ans.add(current);
            return;
        }
        if(open < total){
            solve(current+"(", open+1, closed, total, ans);
        }
        if(closed < open){
            solve(current+")", open, closed+1, total, ans);
        }
    }
}