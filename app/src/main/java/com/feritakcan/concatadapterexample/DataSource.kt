package com.feritakcan.concatadapterexample

import com.feritakcan.concatadapterexample.model.Banner
import com.feritakcan.concatadapterexample.model.Header
import com.feritakcan.concatadapterexample.model.User

object DataSource {

    fun getHeader() = Header(1, "Products", "Product descriptions")

    fun getUser() = ArrayList<User>().apply {
        val url = "https://media.istockphoto.com/id/1182614487/tr/foto%C4%9Fraf/bah%C3%A7ede-taze-organik-sebze-ve-meyve-%C3%A7e%C5%9Fitleri.jpg?s=1024x1024&w=is&k=20&c=uz1-tQMAMvvP-ViSb_xJ9IseQYA8WacuHpbNsQg8EJQ="
        add(User(1, "Ahmet", url))
        add(User(2, "Poyraz", url))
        add(User(3, "Mehmet", url))
        add(User(4, "Mustafa", url))
        add(User(5, "Hira", url))
        add(User(6, "Elif", url))
        add(User(7, "Neslihan", url))
        add(User(8, "Fatma", url))
        add(User(9, "Ali", url))
        add(User(10, "Veli", url))
        add(User(11, "Fatma", url))
    }

    fun getBanner() = Banner(R.drawable.banner)
}