
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(f(a+1), acc+a)
  }
  loop(a, 0)
}

sum( x=> x)(3, 5)