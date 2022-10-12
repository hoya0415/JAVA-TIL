##### ArrayList
- 크기 지정하지 않고 배열 생성 가능. 
- 제네럴 사용해서 <> 안에 객체 자료형 설정.
- `ArrayList<new ArrayList<Integer>>` 이렇게도가능.
- 리스트.add(data)로 추가 / 리스트.add(원하는위치인덱스, 데이터) 이렇게 원하는 위치에 넣을 수도 있음
- 리스트.get(index)으로 접근
- 리스드.size()로 크기 체크
```
ArrayList<Integer> score = new ArrayList<> ();


```

+) 공간이 부족할 때마다 2배씩 공간을 늘리며 작업함. 시간 복잡도 O(1)이라 빠르고 좋음.

#### 리스트 정렬
```
List<Integer> list = new ArrayList<>();
list.sort(Comparator.naturalOrder());
list.sort(Comparator.reverseOrder());
```