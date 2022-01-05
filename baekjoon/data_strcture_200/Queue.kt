package com.example.baekjoon.data_strcture_200

interface Queue<T> {

    fun push(element: T)

    fun pop(): T?

    fun front(): T?

    fun back(): T?

    fun empty(): Int
}