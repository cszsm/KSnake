import game.BasicBoard
import game.Coordinate
import game.Direction
import game.Snake
import ui.console.BoardView

fun main(args : Array<String>) {

    val board = BasicBoard()
    val snake = Snake(Coordinate(10, 20), 3, Direction.LEFT)
    val view = BoardView(board, snake)
    view.print()
}