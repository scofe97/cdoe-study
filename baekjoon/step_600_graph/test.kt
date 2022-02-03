package com.example.baekjoon.step_600_graph

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.`out`))
private val st = StringTokenizer(br.readLine())

private fun main(){
    val n1 = st.nextToken().toDouble()
    val n2 = st.nextToken().toDouble()
    bw.write("${n1/n2}")
    bw.flush()
    bw.close()
    br.close()
}