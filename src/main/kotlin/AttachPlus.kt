interface Attachment {
    val type: String
}

data class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = ""
)

data class Video(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val duration: Int = 0
)

data class PhotoAttachment(val photo: Photo = Photo()) : Attachment {
    override val type: String
        get() = "photo"
}

data class VideoAttachment(val video: Video = Video()) : Attachment {
    override val type: String
        get() = "video"
}