package game.dynamic

import game.Coordinate
import game.static.Board
import game.static.Field
import java.util.*

class FoodFactory(val board: Board, val snake: Snake) {
    val random = Random()

    fun getFood(): Food {
        var coordinate: Coordinate
        do {
            coordinate = generateRandomCoordinate(board.rows, board.columns)
        } while (isValidCoordinate(coordinate))

        return Food(coordinate)
    }

    private fun generateRandomCoordinate(rows: Int, columns: Int): Coordinate {
        val row = random.nextInt(rows)
        val column = random.nextInt(columns)

        return Coordinate(row, column)
    }

    private fun isValidCoordinate(coordinate: Coordinate): Boolean {
        if (board.fields[coordinate] == Field.WALL) {
            return false
        }

        if (snake.body.contains(coordinate)) {
            return false
        }

        return true
    }
}