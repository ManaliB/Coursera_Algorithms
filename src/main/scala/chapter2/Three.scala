package chapter2

object Three extends App {

  def curry[A,B,C](f: (A,B) => C): A => (B => C) = a => (b => f(a, b))
}
