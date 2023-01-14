// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

 class Usuario(vararg nome: String) {

    }

class ConteudoEducacional(vararg nome: String, var duracao: Any)


data class Formacao(var nome: Usuario, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>(nome)

    fun matricular(usuario: Usuario) {

        inscritos.add(usuario)
    }

    fun mostrarinscritos() {
        inscritos.forEach { println(nome) }
    }
}

fun main() {
    val content = listOf(ConteudoEducacional("Curso de Kotlin", duracao = "40 Horas"))

    val users = Usuario("Joao")


    val formacao = Formacao(users, content)
    formacao.matricular(users)
    val inscr = (formacao.inscritos)

    formacao.mostrarinscritos()


}
