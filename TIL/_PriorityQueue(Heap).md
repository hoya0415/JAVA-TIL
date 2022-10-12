**| 우선순위 큐 (PriorityQueue)**

-   사이즈가 가변적이고, 쉽게 늘어납니다.
-   가장 가중치가 낮은 순서로 poll, peek()을 할 수 있는 자료구조
-   Min Heap으로 데이터를 sort 시켜놓고 데이터를 출력하는 자료구조
-   해당 자료구조를 통해서 데이터를 집어 넣게 되면 가중치에 따라서 데이터를 사용해야 하는 경우에 편하게 사용할 수 있는 것이 가장 큰 특징

**| add()**

Inserts the specified element into this priority queue.

우선순위큐에 특정한 요소를 삽입합니다.

**| clear()**

Removes all of the elements from this priority queue.

우선순위 큐에서 모든 요소를 삭제합니다.

**| comparator**

Returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the [natural ordering](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html) of its elements.

이 큐의 요소를 정렬하는 데 사용되는 비교값을 반환합니다.

이 큐가 요소의 자연스러운 순서에 따라 정렬 된 경우에는 null을 반환합니다.

**| contains(Object o)**

Returns true if this queue contains the specified element.

이 큐에 지정된 요소가 포함 된 경우 true를 반환합니다.

**| iterator()**

Returns an iterator over the elements in this queue.

이 큐의 요소에 대한 반복자를 리턴합니다.

**| offer()**

Inserts the specified element into this priority queue.

이 우선 순위 큐에 지정된 요소를 삽입합니다.

**| peek()**

Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

이 큐의 헤드를 검색하지만 제거하지는 않습니다. 이 큐가 비어 있으면 null을 반환합니다.

*Retrieves : 되찾아오다, 회수하다

**| poll()**

Retrieves and removes the head of this queue, or returns null if this queue is empty.

이 큐의 헤드를 검색 및 제거하거나이 큐가 비어있는 경우 null을 반환합니다.

**| remove(Object o)**

Removes a single instance of the specified element from this queue, if it is present.

이 큐에서 지정된 요소의 단일 인스턴스가 있는 경우, 단일 인스턴스의 특정 요소를 제거합니다.

**| size()**

Returns the number of elements in this collection.

이 컬렉션의 요소 수를 반환합니다.

**| toArray()**

Returns an array containing all of the elements in this queue.

이 큐의 모든 요소를 포함하는 배열을 반환합니다.

**| toArray(T[] a)**

Returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array.

이 큐의 모든 요소를 포함하는 배열을 리턴합니다. 반환 된 배열의 런타임 유형은 지정된 배열의 유형입니다.