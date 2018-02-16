package game

import java.util.*

class Snake(head: Coordinate, length: Int, private var direction: Direction) {

    val body: Deque<Coordinate> = LinkedList()

    init {
        (1..length)
                .map { head + direction.getVector() * (it - length) }
                .forEach { body.addFirst(it) }
    }

    fun step() {

    }
}