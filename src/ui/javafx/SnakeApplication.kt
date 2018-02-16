package ui.javafx

import game.BasicBoard
import game.Coordinate
import game.Direction
import game.Snake
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.stage.Stage

class SnakeApplication : Application() {
    override fun start(stage: Stage) {
        val root = StackPane()

        val board = BasicBoard()
        val snake = Snake(Coordinate(10, 20), 3, Direction.LEFT)

        val view = GameView(board, snake)
        root.children.add(view)

        val scene = Scene(root, 800.0, 450.0, Color.BLACK)

        scene.onKeyPressed = EventHandler { event ->
            when (event.code) {
                KeyCode.UP -> snake.turn(Direction.UP)
                KeyCode.DOWN -> snake.turn(Direction.DOWN)
                KeyCode.LEFT -> snake.turn(Direction.LEFT)
                KeyCode.RIGHT -> snake.turn(Direction.RIGHT)
            }
            snake.step()
            println(event.code)
            view.draw()
        }

        stage.scene = scene
        stage.title = "SnaKe"
        stage.isResizable = false
        stage.show()
    }

    fun launchApplication() {
        launch("")
    }
}