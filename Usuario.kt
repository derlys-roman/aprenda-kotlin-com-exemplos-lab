

data class Usuario(val nome: String, val cpf: String, val nivel: Nivel) {
    val formacoes = mutableListOf<Formacao>()

    override fun toString(): String {
        return "Usuario(nome='$nome' \n cpf='$cpf'\n nivel=$nivel)"
    }

}