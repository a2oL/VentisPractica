package mx.org.aad.ventis

class FragmentProvider {
    companion object {
        fun random(): FragmentsModel {
            val position = (0..10).random()
            return quotes[position]
        }
        //TODO: Cambiar por los resources de los strings
        private val quotes = listOf(
            FragmentsModel(
                titulo = "Titulo de prueba 1",
                descripcion = "Descripcion de prueba 1",
                imagen = "res1"
            ),
            FragmentsModel(
                titulo = "Titulo de prueba 2",
                descripcion = "Descripcion de prueba 2",
                imagen = "res2"
            )
        )
    }
}