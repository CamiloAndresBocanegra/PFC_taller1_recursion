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
    def maxIt_aux(l:List[Int], max_value:Int):Int = {
      if(l.isEmpty)
        max_value
      else
        if(max_value > l.head){
          maxIt_aux(l.tail, max_value)
        }else{
          maxIt_aux(l.tail, l.head)
        }
    }
    maxIt_aux(l,0)
  }

  def movsTorresHanoi(n: BigInt): BigInt = {
    def power_of_2(n:BigInt, result:BigInt):BigInt = {
      if(n == 0)
        result
      else
        power_of_2(n-1, result*2)
    }
    power_of_2(n, 1)-1
  }

  def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
    if (n == 1) {
      List((t1, t3))
    } else {
      torresHanoi(n-1, t1, t3, t2) ++ List((t1,t3)) ++ torresHanoi(n-1, t2, t1, t3)
    }
  }

}
