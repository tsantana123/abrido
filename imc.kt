import java.util.Scanner
fun imc (peso:float, altura:float):float {
return peso / (altura * peso )
}
fun main (){
    val teclado = Scanner (System. `in`)
    print ("digite o peso \t");
    var peso: float.nextFloat()
    print ("digite a altura :\t")
    var altura: float = teclado.nextFloat()
    if (imc(peso,altura)<18)
    print ("sobpeso")
    else if (imc (peso,altura)>18 && imc(peso,altura)<25)
    print ("ok")
    else
    print ("sobpeso")
}