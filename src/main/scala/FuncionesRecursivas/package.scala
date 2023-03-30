package object FuncionesRecursivas {

  def maxLin(l:List[Int]):Int = {
    if(l.isEmpty)
      0
    else
      if(l.head > maxLin(l.tail))
        l.head
      else
        maxLin(l.tail)
  }

  def maxIt(l:List[Int]):Int = {
    var max_value = 0
    for (x <- l) {
      if (x > max_value) {
        max_value = x
      }
    }
    max_value
  }

  def movsTorresHanoi(n: BigInt): BigInt = {
    def potencia_de_2(n:BigInt, resultado:BigInt):BigInt = {
      if(n == 0)
        resultado
      else
        potencia_de_2(n-1, resultado*2)
    }
    potencia_de_2(n, 1)-1
  }

  def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
    if (n == 1) {
      List((t1, t3))
    } else {
      torresHanoi(n-1, t1, t3, t2) ++ List((t1,t3)) ++ torresHanoi(n-1, t2, t1, t3)
    }
  }

}
