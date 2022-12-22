package ru.lopata.madDiary.featureReminders.presentation.createAndEditEvent.adapters

import android.net.Uri
import ru.lopata.madDiary.featureReminders.presentation.createAndEditEvent.states.FileItemState
import ru.lopata.madDiary.featureReminders.presentation.createAndEditEvent.states.ImageItemState
import ru.lopata.madDiary.featureReminders.presentation.createAndEditEvent.states.VideoItemState

interface OnAttachmentChosenListener {

    fun onCoverChosen(uri: Uri)
    fun onImagesChosen(items: List<ImageItemState>)
    fun onVideosChosen(items: List<VideoItemState>)
    fun onAudioChosen(uri: Uri)
    fun onFileChosen(item: FileItemState)
}