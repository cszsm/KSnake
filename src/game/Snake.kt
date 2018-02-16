package game

import kotlin.collections.ArrayList

class Snake(head: Coordinate, length: Int, private var direction: Direction) {

    val body: ArrayList<Coordinate> = ArrayList()

    init {
        (1..length)
                .map { head + direction.getVector() * (it - length) }
                .forEach { body.add(it) }
    }

    fun step() {
        val newHead = body[0] + direction.getVector()
        body.add(0, newHead)
        body.removeAt(body.size - 1)
    }

    fun turn(direction: Direction) {
        this.direction = direction
    }
}