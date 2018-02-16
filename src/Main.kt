import game.BasicBoard
import ui.console.BoardView

fun main(args : Array<String>) {

    val board = BasicBoard()
    val view = BoardView(board)
    view.print()
}