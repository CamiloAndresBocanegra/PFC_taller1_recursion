import FuncionesRecursivas._

object Main {
  def main(args: Array[String]): Unit = {
    val l = List(6,8,10,26,8,4,3)
    println(s"El valor máximo de la lista $l con maxLin es ${maxLin(l)}")
    println(s"El valor máximo de la lista $l con maxIt es ${maxIt(l)}")
    println(s"El número de movimientos para resolver el juego de Torres de Hanoi con 2 discos es ${movsTorresHanoi(2)}")
    println("Los movimientos para resolver el juego de Torres de Hanoi con 1, 2, 3 y 4 discos son:")
    println(torresHanoi(1, 1, 2, 3))
    println(torresHanoi(2, 1, 2, 3))
    println(torresHanoi(3, 1, 2, 3))
    println(torresHanoi(4, 1, 2, 3))
  }
}
