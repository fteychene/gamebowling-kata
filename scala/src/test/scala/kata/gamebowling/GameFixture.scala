package kata.gamebowling

object GameFixture {
  def main(args: Array[String]): Unit = {
    val game = new Game()

    game.randomKnock _ // Int => Int
    game.roll _ // Int => Unit
    val asItsAFunction = game.randomKnock _ andThen game.roll _ // Int => Unit
    println(asItsAFunction)
    // Frame 1
    game.roll(4)
    game.roll(5)
    println(game.score())

    // Frame 2
    game.roll(10)
    println(game.score())

    // Frame 3
    game.roll(5)
    game.roll(3)
    println(game.score())

    // Frame 4
    game.roll(5)
    game.roll(5)
    println(game.score())

    // Frame 5
    game.roll(10)
    println(game.score())

    // Frame 6
    game.roll(2)
    game.roll(3)
    println(game.score())

    // Frame 7
    game.roll(5)
    game.roll(5)
    println(game.score())

    // Frame 8
    game.roll(2)
    game.roll(7)
    println(game.score())

    // Frame 9
    game.roll(4)
    game.roll(3)
    println(game.score())

    // Frame 10
    game.roll(10)
    game.roll(4)
    game.roll(5)
    println(game.score())
  }

}
