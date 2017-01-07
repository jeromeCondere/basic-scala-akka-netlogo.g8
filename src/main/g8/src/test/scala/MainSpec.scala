import org.scalatest._

class MainSpec extends FlatSpec {
"A true" should "be true" in {
val t =true;
val f= false;

assertResult(false){
  t&f
}

}

}
