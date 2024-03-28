# [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)

`Medium`, `Math`, `Map`

- 알고리즘 보다는 수학적 지식과 자바 프로그래밍 능력을 보는 문제 같습니다.
- 처음에는 나누기로 풀려다가 답이 안나와서 뺄셈으로 구해봤습니다.
- 예외케이스인 4, 9, 40, 90, 400, 900을 따로 Map에 추가하고 하나씩 조회합니다.
- key보다 낮아질때까지 빼기 연산을 수행해서 문자를 붙여주면 됩니다.
- 처음에 HashMap을 생각하고 정렬이 되야하니 TreeMap을 사용할 생각을 했는데 결과를 보니 속도적인 측면에서 우위를 가질려면 기본형 배열을 사용해서해도 될것같습니다.

```
class Solution {
    public String intToRoman(int num) {
        TreeMap<Integer, String> symbolMap = new TreeMap<>();
        symbolMap.put(1, "I");
        symbolMap.put(4, "IV");
        symbolMap.put(5, "V");
        symbolMap.put(9, "IX");
        symbolMap.put(10, "X");
        symbolMap.put(40, "XL");
        symbolMap.put(50, "L");
        symbolMap.put(90, "XC");
        symbolMap.put(100, "C");
        symbolMap.put(400, "CD");
        symbolMap.put(500, "D");
        symbolMap.put(900, "CM");
        symbolMap.put(1000, "M");

        StringBuilder sb = new StringBuilder();

        NavigableSet<Integer> keySet = symbolMap.navigableKeySet()
            .descendingSet();

        for (Integer key : keySet) {
            for (int i = num ; i >= key  ; i-=key) {
                String roman = symbolMap.get(key);
                sb.append(roman);
                num -= key;
            }
        }

        return sb.toString();
    }
}
```