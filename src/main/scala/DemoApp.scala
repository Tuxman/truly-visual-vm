import akka.actor.{Actor, ActorRef, ActorSystem}

object DemoApp extends App {

  val system = ActorSystem("demo")

  class printerActor extends Actor {
    override def receive = {
      case msg: String => println(msg)
    }
  }

  val actors: Seq[ActorRef] = for(i <- 0 to 8) {

  }
}
