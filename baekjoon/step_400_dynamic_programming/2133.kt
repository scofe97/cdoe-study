package com.example.baekjoon.step_400_dynamic_programming

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val count = br.readLine().toInt()
    val list = IntArray(count+1)

    list[1] = 1
    list[2] = 3

    for(i in 3..count){
        list[i] = list[i-1] + list[i-2]*3
    }

    println(list[count])

}