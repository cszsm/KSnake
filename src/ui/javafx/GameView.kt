package ui.javafx

import game.Board
import game.Snake
import javafx.scene.canvas.Canvas
import javafx.scene.paint.Color

class GameView(board: Board, snake: Snake) : Canvas(800.0, 450.0) {

    val gc = graphicsContext2D
    val boardView = BoardView(gc, board)
    val snakeView = SnakeView(gc, snake)

    fun draw() {
        boardView.draw()
        snakeView.draw()
    }
}