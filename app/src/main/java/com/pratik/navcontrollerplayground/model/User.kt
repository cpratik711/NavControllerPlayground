package com.pratik.navcontrollerplayground.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val age: Int,
    val occupation: String
):Parcelable