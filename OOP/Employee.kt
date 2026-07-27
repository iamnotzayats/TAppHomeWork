package com.example.kotlinclasshomework.kotlinClass

open class Employee {

    fun work() {
        println("Усердно работаю")
    }

    open fun haveLunch() {
        println("Иду на обед в 13.00")
    }

    open fun goHome() {
        println("Иду домой в 19.00")
    }
}


class Programmer() : Employee() {
    override fun haveLunch() {
        super.haveLunch()
        println("А потом еще и за кофеечком")
    }
}


class Designer : Employee() {

    override fun haveLunch() {
        println("Иду на обед в 15.00")
    }
}


class Teamlead : Employee() {

    override fun haveLunch() {
        println("Сегодня пропущу обед")
    }
}

class StoreKeeper: Employee()
{

    override fun haveLunch()
    {
        println("Скорее всего, может быть, не пойду на обед, скоро приедет машина из Москвы")
    }

    override fun goHome()
    {
        println("Хотел уйти в 19:00, но уйду в 20:00")
    }
}

// TODO здесь можно создать новый класс, который будет наследоваться от класса Employee. Не забудьте переопределить методы haveLunch() и goHome()