package com.example.baekjoon.step_610_BFS

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/*

5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6

*/

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.`out`))
private var st = StringTokenizer(br.readLine())
private val v = st.nextToken().toInt()
private val e = st.nextToken().toInt()
private val s = st.nextToken().toInt()

private val list = Array(v) { IntArray(v) }
private val dist = IntArray(v)
private val visited = BooleanArray(v)

private fun main(){
    repeat(e){
        st = StringTokenizer(br.readLine())

        val start = st.nextToken().toInt()-1
        val end = st.nextToken().toInt()-1
        val weight = st.nextToken().toInt()

        list[start][end] = weight
    }

}

private fun dijkstra(start:Int){
    val queue = LinkedList<Int>()
    queue.offer(start)
    visited[start-1] = true

    while(queue.isNotEmpty()){
        val temp = queue.poll()!!


    }
}
