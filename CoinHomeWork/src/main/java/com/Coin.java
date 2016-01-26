package com;

//смотри, так как мы максимально хотим абстрагироваться - перенести логику в др. более базовый класс(для нас это Money). то по факту
//в классАХ наследниках нам ничего не надо делать - кроме того, что "пробрасывать" value родителю
public class Coin extends Money {

    public Coin(float value) {
        super(value);//т.к дефолтивный конструктор у родителя отсутсвует,
        // то необходимо ручками вызвать напрямую конструктор родителя с параметрами -> "пробросить")
    }
}

//делаем аналогичные экшны - т.к все уже есть у родителя(Money), для чего создаем наших "детей",
// для того, чтобы дифференцировать на уровне логики/семантики
//по сути у нас все готово для того, чтобы теперь реализовать функционал оплаты для нашего автомата с газ. водой
//есть общий класс Money -> есть возможность сетить значения денег(номинал) через конструктор
// + забирать значения через гетер ->  public float getValue() {return value;}