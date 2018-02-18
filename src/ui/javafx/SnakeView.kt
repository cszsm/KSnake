package ui.javafx

import game.dynamic.Snake
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

class SnakeView(val context: GraphicsContext, val snake: Snake) {
    fun draw() {
        val body = snake.body
        context.fill = Color.LAWNGREEN
        for (coordinate in body) {
            context.fillRect(coordinate.column * fieldSize, coordinate.row * fieldSize, fieldSize - 1, fieldSize - 1)
        }

        val head = body[0]
        context.fill = Color.gray(0.0, 0.5)
        context.fillRect(head.column * fieldSize, head.row * fieldSize, fieldSize - 1, fieldSize - 1)
    }
}