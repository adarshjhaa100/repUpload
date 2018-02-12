package comapp2.example.dell.repupload;


import java.io.File;

abstract class AlbumStorageDirFactory{
    public abstract File getAlbumStorageDir(String albumName);
}
