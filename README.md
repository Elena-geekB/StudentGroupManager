# StudentGroupManager

## Описание
**StudentGroupManager** — это Java-приложение, демонстрирующее работу с коллекциями, итераторами, компараторами и сортировкой. Основные компоненты включают классы для студентов, учебных групп, потоков и сервисы для управления ими.

---

## Функционал

1. Итераторы
   Класс StudyGroupIterator:

Реализует интерфейс Iterator для перебора студентов в учебной группе.
Поддерживает удаление элементов.
Класс StudyGroup: Реализует интерфейс Iterable, предоставляя метод iterator(), который возвращает итератор для перебора студентов.
---

2. Comparable
   Класс Student:

Реализует интерфейс Comparable.
Сравнивает студентов по идентификатору (studentId).
Методы сортировки:

В классе StudyGroupService: сортировка студентов по ID.
В классе Controller: вызывает сортировку через сервис.

---

### 3. Comparator
Класс StudentComparator:

Реализует интерфейс Comparator.
Сравнивает студентов по комбинации "Имя + Фамилия".
Методы сортировки:

В классе StudyGroupService: сортировка студентов по ФИО.
В классе Controller: вызывает сортировку через сервис.

---

### 4. Потоки
Класс Stream:

Содержит список учебных групп.
Реализует интерфейс Iterable, позволяя перебирать группы с помощью итератора.
Класс StreamComparator:

Реализует интерфейс Comparator.
Сравнивает потоки по количеству учебных групп в потоке.
Класс StreamService:

Содержит метод для сортировки списка потоков с использованием StreamComparator.
Класс Controller:
Добавлен метод для сортировки потоков, который вызывает сервис сортировки StreamService.
---
```
StudentGroupManager/
│
├── pom.xml                     # Файл Maven проекта
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── groupmanager/
│   │   │   │   ├── model/
│   │   │   │   │   ├── Student.java
│   │   │   │   │   ├── StudyGroup.java
│   │   │   │   │   ├── StudyGroupIterator.java
│   │   │   │   │   ├── Stream.java
│   │   │   │   │   ├── StudentComparator.java
│   │   │   │   │   ├── StreamComparator.java
│   │   │   │   ├── service/
│   │   │   │   │   ├── StudyGroupService.java
│   │   │   │   │   ├── StreamService.java
│   │   │   │   ├── controller/
│   │   │   │   │   └── Controller.java
│   │   │   └── App.java
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── groupmanager/
│   │   │   └── AppTest.java
│
└── README.md
```

## Как запустить
1. Склонируйте репозиторий на вашу локальную машину.
2. Скомпилируйте проект с помощью Maven:
```
mvn install
```
3. Выполните команду Maven:
```
mvn test
```