package game

class BasicBoard : Board(generateFieldsWithWall(20, 30))

fun generateFieldsWithWall(rows: Int, columns: Int): Map<Coordinate, Field> {
    val tmp: MutableMap<Coordinate, Field> = HashMap()

    for (row in 0..rows) {
        for (column in 0..columns) {
            if (row == 0 || row == rows || column == 0 || column == columns) {
                tmp.put(Coordinate(row, column), Field.WALL)
            } else {
                tmp.put(Coordinate(row, column), Field.FLOOR)
            }
        }
    }

    return tmp
}