package game

import java.util.*

class Snake(head: Coordinate, length: Int, private var direction: Direction) {

    val body: Deque<Coordinate> = LinkedList()

    init {
        val directionVector: Coordinate = when (direction) {
            Direction.UP -> Coordinate(1, 0)
            Direction.DOWN -> Coordinate(-1, 0)
            Direction.LEFT -> Coordinate(0, 1)
            Direction.RIGHT -> Coordinate(0, -1)
        }

        (1..length)
                .map { head + directionVector * (length - it) }
                .forEach { body.addFirst(it) }
    }
}