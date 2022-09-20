interface Attachment {
    val type: String
}

data class Photo(
    val id: Int = 0,
    val ownerId: Int = 0,
    val photo130: String = "",
    val photo604: String = ""
)

data class PhotoAttachment(val photo: Photo = Photo()) : Attachment {
    override val type: String
        get() = "photo"
}
