package Kotlin

class Agenda {
    var pessoas = ArrayList<Pessoa>(10)

    fun armazenaPessoa(p: Pessoa){
        if (pessoas.size < 10){
            pessoas.add(p)
        }else{
            println("Sinto muito ${p.nome}, mas a agenda está cheia );");
        }
    }

    fun printAgenda(){
        for ((index, pessoa) in pessoas.withIndex()){
            println("Agenda $index : ${pessoa.nome}")
        }
    }

    fun removePessoa(nome:String){
        var flag:Boolean = true
        for ((index,pessoa) in pessoas.withIndex()){
            if (nome == pessoa.nome){
                pessoas.removeAt(index)
                flag = false
                break;
            }
        }
        if (flag){
            println("Pessoa inexistente")
        }
    }

    fun buscaPessoa(nome:String):Pessoa?{
        for (pessoa in pessoas){
            if (nome == pessoa.nome){
                return pessoa
            }
        }
        return null
    }

    fun printPessoa(index:Int){
        println("PrintPesosa = ${pessoas[index]}")
    }

}