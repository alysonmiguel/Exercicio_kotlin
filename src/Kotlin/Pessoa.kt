package Kotlin

import java.time.LocalDate
import java.time.Period

open class Pessoa(var nome:String, var altura:Float){

    var dataNascimento:LocalDate? = null
    var dataAtual: LocalDate = LocalDate.now()
    var idade:Int = 0
        private set

    constructor(nome:String, dataNascimento:LocalDate, altura:Float) : this(nome,  altura) {
        this.dataNascimento = dataNascimento
        this.idade = Idade()
    }

    fun Idade(): Int {
        var i = Period.between( dataNascimento, dataAtual)
        return i.years
    }

    override fun toString(): String {
        return  "nome='$nome', ( dataNascimento=$dataNascimento, altura=$altura)"
    }
}
