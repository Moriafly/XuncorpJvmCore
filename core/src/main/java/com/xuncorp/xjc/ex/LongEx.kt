package com.xuncorp.xjc.ex

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