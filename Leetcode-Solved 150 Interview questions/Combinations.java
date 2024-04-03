class Solution {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < 1 << n; i++) {
      // bit count should be k
      if (Integer.bitCount(i) == k) {
        List<Integer> comb = new ArrayList<>(k);
        for (int j = 0; j <= n; j++) {
          // collect bit with 1
          if (((i >> j) & 1) == 1) {
            comb.add(j + 1);
          }
        }
        result.add(comb);
      }
    }

    return result;
  }
}
