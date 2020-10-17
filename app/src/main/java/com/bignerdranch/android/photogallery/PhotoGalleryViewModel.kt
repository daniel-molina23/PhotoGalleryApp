package com.bignerdranch.android.photogallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import api.FlickrFetchr

class PhotoGalleryViewModel : ViewModel(){
    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init{
        //hardcoded temporarily for testing...
        galleryItemLiveData =
            FlickrFetchr().searchPhotos("bicycle")
    }
}