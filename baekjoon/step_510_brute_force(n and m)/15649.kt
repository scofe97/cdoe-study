package com.example.baekjoon.`step_510_brute_force(n and m)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val st = StringTokenizer(br.readLine())

    var count = st.nextToken().toInt()
    val space = st.nextToken().toInt()



    var result = 1

    for(i in 1..space){
        result *= count
        count--
    }

    println(result)
    bw.close()
    br.close()

}