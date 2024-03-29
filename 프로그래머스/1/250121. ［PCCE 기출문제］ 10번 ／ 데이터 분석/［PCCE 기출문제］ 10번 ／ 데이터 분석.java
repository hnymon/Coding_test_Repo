import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> list = new ArrayList<>();
        Map<String, Integer> indexMap = new HashMap<>();
        indexMap.put("code", 0);
        indexMap.put("date", 1);
        indexMap.put("maximum", 2);
        indexMap.put("remain", 3);

        int extIdx = indexMap.get(ext);
        int sortIdx = indexMap.get(sort_by);

        for(int i = 0; i < data.length; i++){
            if(data[i][extIdx] < val_ext) list.add(data[i]);
        }

        Collections.sort(list, Comparator.comparingInt(arr -> arr[sortIdx]));

        return list;
    }
}
