# Threadrelay
This program demonstrates the relay race of starting streams using synchronization technology CountDownLatch.
### Задача:

#### Дан класс:

```java
public class Foo {
  public void first() { print("first"); }
  public void second() { print("second"); }
  public void third() { print("third"); }
}
```

Один и тот же экземпляр данного класса будет вызван 3мя разными потоками. 
Поток А - будет вызывать метод first(). Поток B - second(). Поток С - third(). 
Необходимо реализовать механизм и изменить программу таким образом, что методы класса Foo будут вызваны в правильном порядке.

#### Пример:
Вывод: "firstsecondthird"
Мы не знаем, в каком порядке будут вызваны методы, но должны гарантировать порядок.

### Чтобы воспользоваться приложением
Нужно скачать и распаковать в нужную Вам папку, а затем запустить.
Либо выполнить команду git clone (клонируемый_репозиторий).
