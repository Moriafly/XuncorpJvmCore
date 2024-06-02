package com.xuncorp.xjc

import org.junit.Test
import com.xuncorp.xjc.ex.toSizeFormat

class LongExTest {

    @Test
    fun test() {
        val longEx = 123L.toSizeFormat()
        println(longEx)
    }

}