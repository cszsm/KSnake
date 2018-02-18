package game.static

import game.Coordinate

class BoardFactory(private val rows: Int, private val columns: Int) {
    fun createEmptyBoardWithWalls(): Board {
        val fields: MutableMap<Coordinate, Field> = HashMap()

        for (row in 0..rows) {
            for (column in 0..columns) {
                if (row == 0 || row == rows || column == 0 || column == columns) {
                    fields.put(Coordinate(row, column), Field.WALL)
                } else {
                    fields.put(Coordinate(row, column), Field.FLOOR)
                }
            }
        }

        return Board(rows, columns, fields)
    }
}