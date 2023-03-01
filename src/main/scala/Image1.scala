import doodle.core._
import doodle.image._
import doodle.image.syntax.all._
import doodle.image.syntax.core._
import doodle.java2d._
import doodle.reactor._
import scala.concurrent.duration._
import cats.effect.unsafe.implicits.global

object Image1 extends App{
  val image = Image.circle(20).
    on(Image.circle(40)).
    on(Image.circle(60)).
    on(Image.circle(80)).
    on(Image.circle(100)).
    on(Image.circle(120))

  image.draw()
}

