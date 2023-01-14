// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASIC, INTERMEDIARIO, AVANCADO }

 class Usuario(val nome: String, val email: String, val telefone: String ) {

    }

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)


data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {

        inscritos.add(usuario)
    }



    fun mostrarinscritos() {
        for (usuarios in inscritos) { 
            println("Nome: ${usuarios.nome}" + "Email: ${usuarios.email}" + "Telefone: ${usuarios.telefone}" ) }

    }
}

fun main() {
    // Simulações com objetos
    val usuarioTest = Usuario(nome = "Gil Pina, " , email = "gilpina@gmail.com, " , telefone = "21999663322")
    val segundoUsuarioTest = Usuario(nome = "Nanda Pina, ", email = "nandapina@gmail.com, ", telefone = "28911224455")
    val terceiroUsuarioTest = Usuario(nome = "Cola Pina, ", email = "colapina@gmail.com, ", telefone = "11922778800")

    val conteudosTest: List<ConteudoEducacional> = listOf(
        ConteudoEducacional(
        nome = "Java",
        duracao = 340),
        ConteudoEducacional(
            nome = "Kotlin",
            duracao = 120),
        ConteudoEducacional(
            nome = "Python",
            duracao = 224
        )
    )

    val formacaoTest = Formacao(
        nome = "Linguagem de programacao Java, Kotlin e Python",
        conteudos = conteudosTest,
        nivel =  Nivel.AVANCADO
    )

    println("Quantidade de conteúdos: ${conteudosTest.size}")
    println("Conteúdos: $conteudosTest")
    println("Formação: ${formacaoTest.nome} (${formacaoTest.nivel})")
    println("Inscritos: ${formacaoTest.inscritos.size}")
    formacaoTest.matricular(usuarioTest)
    formacaoTest.matricular(segundoUsuarioTest)
    formacaoTest.matricular(terceiroUsuarioTest)
    formacaoTest.mostrarinscritos()
    println("Inscritos: ${formacaoTest.inscritos.size}")
}
