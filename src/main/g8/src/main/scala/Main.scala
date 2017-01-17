import org.nlogo.lite.InterfaceComponent
object Main {
  def main(args: Array[String]) {
    val frame = new javax.swing.JFrame
    val comp = new InterfaceComponent(frame)
    wait {
      frame.setSize(1000, 700)
      frame.add(comp)
      frame.setVisible(true)
      comp.open("Fire.nlogo")
    }
    comp.command("set density 62")
    comp.command("random-seed 0")
    comp.command("setup")
    comp.command("repeat 50 [ go ]")
    println(comp.report("burned-trees"))
  }
  def wait(block: => Unit) {
    java.awt.EventQueue.invokeAndWait(
      new Runnable() { def run() { block } } ) }
}