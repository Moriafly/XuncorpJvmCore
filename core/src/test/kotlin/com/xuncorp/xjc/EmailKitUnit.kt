package com.xuncorp.xjc

import com.xuncorp.xjc.EmailKit.formatIfEmail
import org.junit.Test

class EmailKitUnitTest {

    @Test
    fun testFormatIfEmail() {
        val emails = listOf(
            "test@example.com",
            "111@wwww.ww.c",
            "111@wwww.ww.c",
            "111@wwww.ww.c",
            "111@ww",
            "Wssd",
            "wQQ@qq.com",
            "wQQ@qq.com ",
            "wQQ@qq.com    ",
            "wQQ@qq.co m",
            "   wQQ@qq.com",
        )
        emails.forEach {
            val result = formatIfEmail(it)
            println("[$it] -> [$result]")
        }
    }

}