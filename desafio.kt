

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
        private set
    fun matricular(vararg usuario: Usuario) {
        for (u in usuario) {
            inscritos.add(u)
            u.formacoes.add(this)
        }
    }
}

fun main() {
    val usuario = Usuario("João", "123456789", Nivel.BASICO)
    val usuario2 = Usuario("Maria", "987654321", Nivel.AVANCADO)
    val kotlinBasic = ConteudoEducacional("Kotlin Basic", 3)
    val kotlinIntermediate = ConteudoEducacional("Kotlin Intermediate", 4)
    val kotlinAdvanced = ConteudoEducacional("Kotlin Advanced", 5)
    val formacaoKotlin = Formacao("Kotlin", listOf(kotlinBasic, kotlinIntermediate, kotlinAdvanced))
    formacaoKotlin.matricular(usuario, usuario2)
    println(usuario.formacoes.toString())
    println(usuario2.formacoes.toString())
    println(formacaoKotlin.conteudos.toString())
    println(formacaoKotlin.inscritos)
}
