package com.fetch.storage.data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fetch.storage.data.model.FolderItem
import com.fetch.storage.data.model.MediaItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        VideoLoader().loadDeviceVideos(this@MainActivity, "video", "DateNewToOld", object : VideoLoader.VideoLoadListener {
            override fun onVideoLoadStart() {
            }

            override fun onVideoLoadProgress() {
            }

            override fun onVideoLoaded(videoList: ArrayList<MediaItem>, folderList: ArrayList<FolderItem>) {
            }

            override fun onFailed(exc: String) {
            }

            override fun onVideoSorted() {
            }
        })
    }
}