fun main()
{
    //Dog
    val dog: Animal = Dog("Hachiko")
    dog.move("forward")
    dog.makeASound()

    //Cat
    val cat: Cat = Cat("Tom")
    cat.move("forward")
    cat.makeASound()
    moveAndMakeASound(dog)

    //Mouse testing
    val mouse: Mouse = Mouse("Jerry")
    mouse.move("ahead")
    mouse.makeASound()
    mouse.StealCheese(8)
    mouse.EatCheese()
    println("${mouse.CheeseAmount}")

}

fun moveAndMakeASound(animal: Animal)
{
    animal.move("forward")
    animal.makeASound()
}