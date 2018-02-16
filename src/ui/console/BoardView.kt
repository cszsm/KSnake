package ui.console

import game.Board
import game.Field
import game.Coordinate
import game.Snake

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