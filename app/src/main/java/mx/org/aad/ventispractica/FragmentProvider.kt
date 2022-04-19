package mx.org.aad.ventis

class FragmentProvider {
    companion object {
        fun random(): FragmentsModel {
            val position = (0..10).random()
            return quotes[position]
        }
        private val quotes = listOf(
            FragmentsModel(
                titulo = "It’s not a bug. It’s an undocumented feature!",
                descripcion = "Anonymous"
            )
        )
    }
}