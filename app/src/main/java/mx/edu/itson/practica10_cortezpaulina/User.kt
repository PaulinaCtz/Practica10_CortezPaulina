package mx.edu.itson.practica10_cortezpaulina

class User (var name : String ?= null, var lastName : String ?= null, var age : String ?= null){
    override fun toString() = name + "\t" + lastName + "\t" + age
}
