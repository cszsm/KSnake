package ui.javafx

import game.static.Board
import game.dynamic.Snake
import javafx.scene.canvas.Canvas

class GameView(board: Board, snake: Snake) : Canvas(800.0, 450.0) {

    val gc = graphicsContext2D
    val boardView = BoardView(gc, board)
    val snakeView = SnakeView(gc, snake)

    fun draw() {
        boardView.draw()
        snakeView.draw()
    }
}