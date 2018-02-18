package ui.javafx

import game.static.Board
import game.static.Field
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color

val fieldSize = 20.0

class BoardView(val context: GraphicsContext, val board: Board) {
    fun draw() {
        val coordinates = board.fields.keys
        for (coordinate in coordinates) {
            val field = board.fields[coordinate]
            context.fill = when (field) {
                Field.WALL -> Color.FIREBRICK
                Field.FLOOR -> Color.BURLYWOOD
                null -> TODO()
            }
            context.fillRect(coordinate.column * fieldSize, coordinate.row * fieldSize, fieldSize - 1, fieldSize - 1)
        }
    }
}