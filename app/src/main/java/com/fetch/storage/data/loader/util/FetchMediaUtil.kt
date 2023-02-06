package com.fetch.storage.data.loader.util

import android.content.Context
import android.media.MediaScannerConnection
import android.util.Log

class FetchMediaUtil {
    companion object {
        fun scanFile(context: Context, strFilePath: String) {
            try {
                MediaScannerConnection.scanFile(context, arrayOf(strFilePath), null) { _, _ -> }
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e(" jk ", "scanFile:Exception:  ${e.message} ")
            }
        }
    }

}