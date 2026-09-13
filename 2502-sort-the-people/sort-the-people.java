class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         int n = names.length;
        int maxindex = 0;
        for (int i = 0; i < n; i++) {
            maxindex = i;
            for (int j = i + 1; j < n; j++) {
                if (heights[j] > heights[maxindex]) {
                    maxindex = j;
                }
            }
                int temp = heights[i];
                heights[i] = heights[maxindex];
                heights[maxindex] = temp;

                String tempname = names[i];
                names[i] = names[maxindex];
                names[maxindex] = tempname;
        }
        return names;
    }
}