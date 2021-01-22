package Kotlin

class Funcionario(nome:String, altura:Float, var salario:Double): Pessoa(nome, altura){
    override fun toString(): String {
        return "$nome $salario"
    }
}