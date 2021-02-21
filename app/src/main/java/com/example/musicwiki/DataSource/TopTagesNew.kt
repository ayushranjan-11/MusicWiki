package com.example.musicwiki.DataSource

data class Welcome (
    val toptags: Toptags
)

data class Toptags (
    val attr: Attr,
    val tag: List<Tag>
)

data class Attr (
    val offset: Long,
    val numRes: Long,
    val total: Long
)

data class Tag (
    val name: String,
    val count: Long,
    val reach: Long
)
