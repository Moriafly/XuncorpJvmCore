package com.xuncorp.xjc

object EmailKit {

    /**
     * 如果符合邮箱格式则返回格式化后的标准邮箱，否则返回 null
     *
     * @param value 待格式化的字符串，应该事先做好 trim 操作
     */
    fun formatIfEmail(value: String): String? {
        val emailRegex = Regex("[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}")
        return if (emailRegex.matches(value)) {
            // 就行小写处理
            value.lowercase()
        } else {
            null
        }
    }

}