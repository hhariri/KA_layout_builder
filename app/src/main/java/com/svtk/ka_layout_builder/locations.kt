package com.svtk.ka_layout_builder

data class Location(
        val name: String,
        val timeZone: String,
        val id: Int
)

val locations = listOf(
        Location("Rome", TimeZone.ROME, R.id.rome),
        Location("Saint Petersburg", TimeZone.SPB, R.id.spb),
        Location("Kotlin (island)", TimeZone.SPB, R.id.kotlin)
)