fun main(args: Array<String>) {
    var myButton = MyButton()
    myButton.onTouch()
    myButton.onClick()
}

interface MyInterfaceListener {
    fun onTouch() // methods in interface are abstract by default

    fun onClick() { // normal methods are public and open by default but not final
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface {
    fun onTouch() {
        println("MySecondInterface: onTouch")
    }

    fun onClick() {
        println("MySecondInterface: onClick")
    }
}

class MyButton : MyInterfaceListener, MySecondInterface {
    override fun onTouch() {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onClick() {
        super.onTouch()
    }
}

