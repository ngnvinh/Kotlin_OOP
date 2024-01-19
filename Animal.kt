abstract class Animal(_name: String = "The animal"): IAnimal
{
    val animalName = _name
    //Need to override the interface
    override fun move(direction: String)
    {
        println("$animalName moves $direction")
    }

    //Not all animals made the same sound
    abstract override fun makeASound()


}