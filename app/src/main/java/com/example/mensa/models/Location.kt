package com.example.mensa.models


data class Location(val title: String, val mensas: List<Mensa>) {
    override fun toString(): String = title
}