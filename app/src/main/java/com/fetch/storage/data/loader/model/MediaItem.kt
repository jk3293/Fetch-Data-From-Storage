/*
 * *
 *  *


 *
 */
package com.fetch.storage.data.loader.model

class MediaItem(
    var mediaId: String,
    var videoTitle: String,
    var path: String,
    val duration: Long,
    var folderName: String,
    var resolution: String,
    var fileSizeAs: Long,
    var date_added: String,
    var date: Long
)