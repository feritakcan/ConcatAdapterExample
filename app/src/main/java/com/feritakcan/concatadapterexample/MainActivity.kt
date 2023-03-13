package com.feritakcan.concatadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.feritakcan.concatadapterexample.adapters.BannerAdapter
import com.feritakcan.concatadapterexample.adapters.HeaderAdapter
import com.feritakcan.concatadapterexample.adapters.UserAdapter
import com.feritakcan.concatadapterexample.model.Header
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var concatAdapter: ConcatAdapter
    lateinit var headerAdapter: HeaderAdapter
    lateinit var userAdapter: UserAdapter
    lateinit var bannerAdapter: BannerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        headerAdapter = HeaderAdapter(DataSource.getHeader())
        userAdapter = UserAdapter(DataSource.getUser())
        bannerAdapter = BannerAdapter(DataSource.getBanner())
        concatAdapter = ConcatAdapter(headerAdapter, userAdapter, bannerAdapter)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView?.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = concatAdapter
        }
    }
}