package classwork_34.ait.album.dao;

import classwork_34.ait.album.model.Photo;

import java.time.LocalDate;

public class AlbumImpl implements Album{

    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {  // изменили
        this.photos = new Photo[capacity]; // изменили
        // this size = 0
    }

    @Override
    public boolean addPhoto(Photo photo) {
        return false;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId) {
        return false;
    }

    @Override
    public boolean updatePhoto(int albumId, int photoId, String url) {
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId) {
        return null;
    }

    @Override
    public Photo[] getAllPhotoFrom(int albumId) {
        return new Photo[0];
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
