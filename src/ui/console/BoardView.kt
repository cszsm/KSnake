package ui.console

import game.Board
import game.Field
import game.Position

class BoardView(board: Board) {

    val board = board

    fun print() {
        val output = StringBuilder()

        for (row in 0..20) {
            for (column in 0..30) {
                if (board.fields[Position(row, column)] == Field.WALL) {
                    output.append('#')
                } else {
                    output.append(' ')
                }
            }
            output.append('\n')
        }

        print(output.toString())
    }
}