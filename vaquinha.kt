import java.util.Scanner
fun vaquinha (conta:Float, pessoas:Int):Float {
return conta/pessoas
}
 fun main (){
 val teclado = Scanner (System. `in`)
 print ("digite o valor da conta \t");
 var conta: Float= teclado.nextFloat()
 print ("digite a quantidade de pessoa :\t")
 var pessoas:Int = teclado.nextInt()
 print ("para cada pessoa:\t "  + vaquinha(conta,pessoas))
}
