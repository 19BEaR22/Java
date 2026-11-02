1. Каталог ID
   - Интерфейс: Map<K,V>
   - Реализация: HashMap<K,V>
   - Сложность: get/put/remove O(1)

2. Отсортированная таблица результатов
   - Интерфейс: NavigableMap<K,V>
   - Реализация: TreeMap<K,V>
   - Сложность: put/get/remove O(1)

3. Очередь ожидания
   - Интерфейс: Queue<E>
   - Реализация: ArrayDeque<E>
   - Сложность: offer(e)/poll()/peek() O(1)

4. Уникальные теги с сохранением порядка
   - Интерфейс: Set<E>
   - Реализация: LinkedHashSet<E>
   - Сложность: add(e)/contains(e)/remove(e): O(1)

5. Диапазонный поиск
   - Интерфейс: NavigableMap
   - Реализация: TreeMap
   - Сложность: Поиск границ: O(log n), Иттерация по элементам в диапозоне O(K)

6. Частый доступ по индексу
   - Интерфейс: List
   - Реализация: ArrayList
   - Сложность: get(index)/set(index, element)/add(element): O(1), Вставка удаление в середину O(n)