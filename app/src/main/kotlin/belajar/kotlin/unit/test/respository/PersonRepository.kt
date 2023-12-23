package belajar.kotlin.unit.test.respository

import belajar.kotlin.unit.test.model.Person

interface PersonRepository {
    fun selectById(id: String): Person?
}