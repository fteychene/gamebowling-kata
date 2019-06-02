package kata.gamebowling;

public class GameFixture {
    
    public static void main(String[] args) {
        Game game = new Game();

        // Frame 1
        game.roll(4);
        game.roll(5);
        System.out.println(game.score());

        // Frame 2
        game.roll(10);
        System.out.println(game.score());

        // Frame 3
        game.roll(5);
        game.roll(3);
        System.out.println(game.score());

        // Frame 4
        game.roll(5);
        game.roll(5);
        System.out.println(game.score());

        // Frame 5
        game.roll(10);
        System.out.println(game.score());

        // Frame 6
        game.roll(2);
        game.roll(3);
        System.out.println(game.score());

        // Frame 7
        game.roll(5);
        game.roll(5);
        System.out.println(game.score());

        // Frame 8
        game.roll(2);
        game.roll(7);
        System.out.println(game.score());

        // Frame 9
        game.roll(4);
        game.roll(3);
        System.out.println(game.score());

        // Frame 10
        game.roll(10);
        game.roll(4);
        game.roll(5);
        System.out.println(game.score());
    }
}
