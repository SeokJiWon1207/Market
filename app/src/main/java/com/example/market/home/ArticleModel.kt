package com.example.market.home

data class ArticleModel(
    val sellerId: String, // 판매자 id
    val title: String, // 판매 제목
    val createdAt: Long, // 생성시간
    val price: String, // 가격
    val imageUrl: String // 상품 이미지
) {

    constructor(): this("", "", 0, "", "")

}
