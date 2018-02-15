package game

class BasicBoard : Board(generateFieldsWithWall(20, 30))

fun generateFieldsWithWall(rows: Int, columns: Int): Map<Position, Field> {
    val tmp: MutableMap<Position, Field> = HashMap()

    for (row in 0..rows) {
        for (column in 0..columns) {
            if (row == 0 || row == rows || column == 0 || column == columns) {
                tmp.put(Position(row, column), Field.WALL)
            } else {
                tmp.put(Position(row, column), Field.FLOOR)
            }
        }
    }

    return tmp
}