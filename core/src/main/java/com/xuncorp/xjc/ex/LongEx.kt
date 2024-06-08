@file:Suppress("UNUSED")

package com.xuncorp.xjc.ex

import java.text.SimpleDateFormat
import java.util.Date

/**
 * 将字节转换成大小格式
 */
fun Long.toSizeFormat(): String {
    val size = this.toDouble()
    return when {
        this < 1_000 -> "$this B"
        this < 1_000_000 -> "${String.format("%.2f", size / 1_000)} KB"
        this < 1_000_000_000 -> "${String.format("%.2f", size / 1_000_000)} MB"
        else -> "${String.format("%.2f", size / 1_000_000_000)} GB"
    }
}

/**
 * 将字节转换成大小格式（二进制），单位如 GiB
 */
fun Long.toBinarySizeFormat(): String {
    val size = this.toDouble()
    return when {
        this < 1_000 -> "$this B"
        this < 1_000_000 -> "${String.format("%.2f", size / 1_024)} KiB"
        this < 1_000_000_000 -> "${String.format("%.2f", size / 1_048_576)} MiB"
        else -> "${String.format("%.2f", size / 1_073_741_824)} GiB"
    }
}

/**
 * 转换成时间格式
 */
fun Long.toTimeFormat(): String {
    // 时，分，秒
    val hour = this / (60 * 60 * 1000)
    val min = this % (60 * 60 * 1000) / (60 * 1000)
    val sec = this % (60 * 1000) / 1000
    return if (hour == 0L) {
        String.format("%02d:%02d", min, sec)
    } else {
        String.format("%02d:%02d:%02d", hour, min, sec)
    }
}

/**
 * 转换成日期格式
 */
fun Long.toDateTimeFormat(): String {
    val date = Date().apply {
        time = this@toDateTimeFormat
    }
    return SimpleDateFormat().format(date)
}