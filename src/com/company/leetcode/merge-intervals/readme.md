# [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/)

```array``` , ```Sorting```

2차원 배열이 주어졌을 때 겹치는 부분을 병합하는 문제

ex)
intervals = [[1,3],[2,6],[8,10],[15,18]] 일 경우  
[1,3]이랑 [2,6]이 겹치기 때문에 병합한다.  
output = [[1,6],[8,10],[15,18]]  

1. intervals에 배열이 하나 이하로 들어있을 경우 해당 배열을 return 해준다.  
```
if(intervals.length < 2){
  return intervals;
}
```
2. intervals에 값들은 정렬되지 않은 값으로 들어오기 때문에 정렬시켜줘야한다.
```
Arrays.sort(intervals,(o1, o2) -> Integer.compare(o1[0],o2[0]));
```
3. 비교할 때에는 두 배열중 앞에있는 배열의 index 1의 값과 뒤에있는 배열의 index 0을 비교한다.
4. 앞 배열의 값이 클 경우 두 배열이 겹치는 배열이라 판단하여 두 배열의 최소값과 최대값으로 배열을 구성한다.
5. 앞 배열의 값이 작을 경우 겹치지 않으므로 만들어둔 배열(temp)을 output list에 담고 temp배열에 i번째 배열을 담는다.
```
for(int i = 1; i < size ; i++){
    if(temp[1] < intervals[i][0]){
        arrList.add(temp);
        temp = intervals[i];
    }else{
        temp[0] = Math.min(temp[0],intervals[i][0]);
        temp[1] = Math.max(temp[1],intervals[i][1]);
    }
}
```
6. 배열을 담고있는 list를 2차원 배열로 바꿔서 return한다.
```
return arrList.toArray(new int[arrList.size()][]);
```


![image](https://user-images.githubusercontent.com/38740455/130178846-fa3d2b40-5aeb-45cc-b13d-b4dae7b74a4e.png)

