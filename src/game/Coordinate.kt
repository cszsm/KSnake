package game

data class Coordinate(val row: Int, val column: Int) {
    operator fun plus(other: Coordinate): Coordinate {
        return Coordinate(row + other.row, column + other.column)
    }

    operator fun times(multiplier: Int): Coordinate {
        return Coordinate(row * multiplier, column * multiplier)
    }
}