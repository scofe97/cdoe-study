package com.example.baekjoon.step_510_brute_force_back_tracking

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val st = StringTokenizer(br.readLine())

    var m = st.nextToken().toInt()
    val n = st.nextToken().toInt()

    val graph = Array<Int>(m) { 0 }
    // val visit = Array<Boolean>(m) { false }

    fun dfs15651(m: Int, n: Int, depth: Int) {

        if (depth == n) {
            for (i in graph) {
                if (i != 0) bw.write("$i ")
            }
            bw.write("\n")
            return
        }

        for (i in 0 until m) {
            graph[depth] = i + 1
            dfs15651(m, n, depth + 1)
        }
    }

    dfs15651(m, n, 0)

    bw.flush()
    bw.close()
    br.close()

}