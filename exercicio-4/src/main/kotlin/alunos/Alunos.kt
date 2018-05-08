package alunos

import kotlinx.serialization.Serializable

@Serializable
data class ListaAlunos(val listaAlunos: List<Aluno>)

@Serializable
data class Aluno(val primeiroNome: String, val ultimoNome: String, val nota: Int)

@Serializable
data class EstatisticasAlunos(
    val numeroAprovados: Int,
    val numeroReprovados: Int,
    val alguemGabaritou: Boolean,
    val alguemZerou: Boolean,
    val notasAbaixoCinco: Int,
    val mediaTurma: Double
)
