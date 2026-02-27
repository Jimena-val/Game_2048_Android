package com.example.moviles.lisas
import com.example.moviles.R
class ProductViewModel {
    fun getProducts() : List<ProductModel>{
        var productList = mutableListOf<ProductModel>()
        productList.add(ProductModel(R.drawable.alien, nombre= "Alienware 16 Aurora", calificacion = 4.4f, precio = 31299, descriptor = "Laptop AC16250", fecha = "Llega el viernes"))
        productList.add(ProductModel(R.drawable.alien, nombre= "Alienware 16 Aurora", calificacion = 4.4f, precio = 31299, descriptor = "Laptop AC16250", fecha = "Llega el viernes"))
        productList.add(ProductModel(R.drawable.alien, nombre= "Alienware 16 Aurora", calificacion = 4.4f, precio = 31299, descriptor = "Laptop AC16250", fecha = "Llega el viernes"))
        productList.add(ProductModel(R.drawable.alien, nombre= "Alienware 16 Aurora", calificacion = 4.4f, precio = 31299, descriptor = "Laptop AC16250", fecha = "Llega el viernes"))
        return productList
    }
}
