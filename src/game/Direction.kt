package game

enum class Direction {
    UP {
        override fun getVector(): Coordinate {
            return Coordinate(-1, 0)
        }
    },
    DOWN {
        override fun getVector(): Coordinate {
            return Coordinate(1, 0)
        }
    },
    LEFT {
        override fun getVector(): Coordinate {
            return Coordinate(0, -1)
        }
    },
    RIGHT {
        override fun getVector(): Coordinate {
            return Coordinate(0, 1)
        }
    };

    abstract fun getVector(): Coordinate
}