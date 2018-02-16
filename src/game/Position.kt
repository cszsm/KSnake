package game

data class Position(val row: Int, val column: Int) {
    operator fun plus(other: Position): Position {
        return Position(row + other.row, column + other.column)
    }

    operator fun times(multiplier: Int): Position {
        return Position(row * multiplier, column * multiplier)
    }
}