// tail recursion
import scala.annotation.tailrec

def fact(n: Int): Int = {
  if (n == 0) 1 else n * fact(n - 1)
}


def factRec(n: Int): Int = {
  @tailrec
  def h(n: Int, acc: Int): Int = {
    if (n == 0) acc else h(n - 1,n * acc)
  }
  h(n, 1)
}

val x = fact(3)
val y = factRec(3)