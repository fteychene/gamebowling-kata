package kata.gamebowling

fun main() {
    val game = Game()

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