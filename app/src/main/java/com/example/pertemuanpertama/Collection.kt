package com.example.pertemuanpertama

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan list0f
// List Mutable menggunakan mutableList0f

fun ContohList(){
    println("==List==")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> =
        mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam list Mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list Mutable
    shape.remove(element = "Triangle")
    println(shape)

    //Mengubah data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan set0f
// Set Mutable menggunakan mutableSet0f

fun ContohSet() {
    println()
    println (" === Set == ")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println (shape)

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println (shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan map0f
// Map Mutable menggunakan mutab leMap0f

fun ContohMap() {

    println()
    println (" === Map === ")
    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println (readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println (shape)

    // Menambahkan data ke dalam Map Mutable
    shape ["Rectangle"] = 4
    println (shape)

    // Menghapus data dari Map Mutable
    shape. remove("Circle")
    println (shape)

    // Mengubah data di dalam Map Mutable
    shape ["Square"] = 5
    println (shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println (shapesLocked)
}

fun main() {
    ContohList()
    ContohSet ()
    ContohMap ()
}
//