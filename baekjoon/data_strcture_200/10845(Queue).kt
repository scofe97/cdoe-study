package com.example.baekjoon.data_strcture_200

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val sb = StringBuilder()

    val commandSize = br.readLine().toInt()
    val queue = ArrayListQueue<Int>()

    repeat(commandSize) {
        val st = StringTokenizer(br.readLine())
        when(st.nextToken()){
            "push" ->  queue.push(st.nextToken().toInt())

            "pop" ->   sb.append((queue.pop()?.toString() ?: "-1") +"\n")

            "size" ->  sb.append(queue.size().toString()+"\n")

            "empty" -> sb.append(queue.empty().toString() +"\n")

            "front" -> sb.append((queue.front()?.toString() ?:"-1") +"\n")

            "back" -> sb.append((queue.back()?.toString() ?:"-1") +"\n")
        }

    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}


