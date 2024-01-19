class Mouse(_name: String = "Jerry"): Animal(_name)
{
    var CheeseAmount: Int = 0
    
    override fun makeASound()
    {
        squek()
    }

    private fun squek()
    {
        println("$animalName squeks!!!")
    }
    
    fun StealCheese(num: Int)
    {
        CheeseAmount += num
    }
    
    fun EatCheese()
    {
        CheeseAmount -= 1
    }
    
}
