package fibonacci

object fibonacci {
  def get_nth_term(n: Int): Int = {
    var prev_term: Int = 0
    var i: Int = 0
    var nth_term = 1
    for (i <- 2 to n) {      
      nth_term += prev_term
      prev_term = nth_term - prev_term
    }
    nth_term
  }
  
  def rec_get_nth_term(n: Int): Int = {
    if (n <= 1) {
      n
    } else {
      rec_get_nth_term(n - 1) + rec_get_nth_term(n-2)
    }
  }
  
  def main(args: Array[String]) {
    println(get_nth_term(10));
    println(rec_get_nth_term(10));
  }
}