object generateParenthesis {
  def generateAllParenthesis(n: Int): List[String] = {
    val result = scala.collection.mutable.ListBuffer[String]()
    helper("", 0, 0, n, result)
    result.toList
  }

  def helper(current: String, open: Int, close: Int, max: Int, result: scala.collection.mutable.ListBuffer[String]): Unit = {
    if (current.length == max * 2) {
      result += current
      return
    }

    if (open < max) {
      helper(current + "(", open + 1, close, max, result)
    }
    if (close < open) {
      helper(current + ")", open, close + 1, max, result)
    }
  }
}
