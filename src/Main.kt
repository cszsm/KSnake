import ui.javafx.SnakeApplication

fun main(args: Array<String>) {

//    val board = BasicBoard()
//    val snake = Snake(Coordinate(10, 20), 3, Direction.LEFT)
//    val view = BoardView(board, snake)
//    view.print()
//
//    while (true) {
//        Thread.sleep(1000)
//        snake.step()
//        view.print()
//    }

    val application = SnakeApplication()
    application.launchApplication()
}