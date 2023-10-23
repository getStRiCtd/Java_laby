# Lab2
```bash
└───registration
    ├───exceptions // Обработчики исключений
    ├───model // Классы
    ├───reader 
    ├───service 
    └───service_implements
```
## DataStorage
В дерикатории ./reader/ содержится класс DataStorage. Экземпляр класса DataStorage при инициализации записывает данные о студентах, курсах и
преподователях в соответсвующие поля.  
Данныt хрнятся в виде ```java Map<Integer, Model.object>```.  где Model.object - класс из дириктории model. Ключом является id элемента.

## service_implements
Интерфейсы реализованны классами **CourseInstructorPersonalAccount** и **StudentPersonalAccount**  
При создании экземпляра класса нужно передать ранее созданный объект класса DataStorage в конструктор.
