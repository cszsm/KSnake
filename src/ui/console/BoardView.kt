package ui.console

import game.static.Board
import game.static.Field
import game.Coordinate
import game.dynamic.Snake

class BoardView(private val board: Board, private val snake: Snake) {

    fun print() {
        val output = StringBuilder()

        for (row in 0..20) {
            for (column in 0..30) {
                val current = Coordinate(row, column)
                if (board.fields[current] == Field.WALL) {
                    output.append('#')
                } else if (snake.body.contains(current)) {
                    output.append('O')
                } else {
                    output.append(' ')
                }
            }
            output.append('\n')
        }

        print(output.toString())
    }
}