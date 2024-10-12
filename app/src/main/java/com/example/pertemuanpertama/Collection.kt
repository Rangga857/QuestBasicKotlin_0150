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

