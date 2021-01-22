import Kotlin.Agenda
import Kotlin.Funcionario
import Kotlin.Pessoa
import java.time.LocalDate

fun main() {


    val p = Pessoa("alyson", LocalDate.of(1999,8,25,), 1.5f )
    val p1 = Pessoa("silva", LocalDate.of(1998,8,25,), 1.5f )
    val p2 = Pessoa("f", LocalDate.of(1998,8,25,), 1.5f )
    val p3 = Pessoa("g", LocalDate.of(1998,8,25,), 1.5f )
    val p4 = Pessoa("j", LocalDate.of(1998,8,25,), 1.5f )
    val p5 = Pessoa("k", LocalDate.of(1998,8,25,), 1.5f )
    val p6 = Pessoa("l", LocalDate.of(1998,8,25,), 1.5f )
    val p7 = Pessoa("rr", LocalDate.of(1998,8,25,), 1.5f )
    val p8 = Pessoa("tt", LocalDate.of(1998,8,25,), 1.5f )
    val p9 = Pessoa("alyyyson", LocalDate.of(1998,8,25,), 1.5f )
    val p10 = Pessoa("miguel", LocalDate.of(1998,8,25,), 1.5f )

    val  a = Agenda()
    a.armazenaPessoa(p)
    a.armazenaPessoa(p1)
    a.armazenaPessoa(p2)
    a.armazenaPessoa(p3)
    a.armazenaPessoa(p4)
    a.armazenaPessoa(p5)
    a.armazenaPessoa(p6)
    a.armazenaPessoa(p7)
    a.armazenaPessoa(p8)
    a.armazenaPessoa(p9)
    a.armazenaPessoa(p10)

    println("Agenda ${a.printAgenda()}")

    println(a.removePessoa("f"))

    a.armazenaPessoa(p10)

    println("Nova Agenda ${a.printAgenda()}")

    var busca = a.buscaPessoa("alyson")
    if (busca != null) {
        println("${busca.toString()} ")
    }

    a.printPessoa(0)

    var f = Funcionario("Alyson", 1.82f, 400.0);
    println("toString do funcionario =  ${f.toString()}")
}

