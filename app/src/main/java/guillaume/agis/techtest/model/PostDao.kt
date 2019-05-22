package guillaume.agis.techtest.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class PostDao(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
)


@Parcelize
data class Post(
    val user: User,
    val id: Int,
    val title: String,
    val body: String
) : Parcelable