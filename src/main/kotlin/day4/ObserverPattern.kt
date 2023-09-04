package day4

class ObserverPattern {
    /*
    이벤트를 감시하는 역활을 하는 패턴이기 때문에 옵저버 패턴이라고 함
    옵저버 패턴은 두개의 클래스가 필요한데
    class A는 이벤트 발생 및 전달, class B는 이벤트 수신 및 처리을 역활한다.
    자 그럼 A가 이벤트를 감지하면 B에게 전달하고 B는 A에게 class B에 있는 함수를 호출하라고 한다.
    이 방법에는 문제가 있는데 B는 A를 참조 함수 있지만 A는 B를 참조 할 수 없다.
    이 방법을 해결하기 위해 인터페이스를 만들어서 각 클레스가 구현체가 되면 각 클레스에서 다른 클래스의 함수를 참조 할 수 있다.
    이때 이 인터페이스를 옵저버(kotlin에서는 리스너) 라고 한다.
    */

}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter2(var listener: EventListener) {
    fun count() {
        for (i in 0..100) {
            if (i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }
}

/*class EventPrinter : EventListener{
    override fun onEvent(count: Int) {
        println(count)
    }
    fun start(){
        val counter = Counter2(this)
        counter.count()
    }
}*/

class EventPrinter {
    fun start() {
        val counter = Counter2(object : EventListener {
            override fun onEvent(count: Int) {
                println(":" + count + ":")
            }
        })
        counter.count()
    }
}


fun main() {
    EventPrinter().start()
}