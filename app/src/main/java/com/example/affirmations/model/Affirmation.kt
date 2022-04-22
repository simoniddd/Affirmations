package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*StringRes - аннотация для айдишки текста
* DrawableRes - аннотация для айдишки картинки*/

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
