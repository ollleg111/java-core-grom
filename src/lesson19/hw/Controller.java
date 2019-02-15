package lesson19.hw;

public class Controller {

    public void put(Storage storage, File file) throws Exception {

        if (!checkFormat(storage, file)) {
            throw new Exception(" error format the file = ." + file.getFormat() + " , storage id = " +
                    storage.getId() + " for file with id = " + file.getId());
        }

//        try{
//            String[] strArr = storage.getFormatsSupported();
//            for (String str : strArr) {
//                if (!(file.getFormat().equals(str))){
//                    throw new Exception(" error format the file = ." + file.getFormat() + " , storage id = " +
//                            storage.getId() + " for file with id = " + file.getId());
//                }
//            }
//        }catch (Exception e){
////
//        }


        if ((storage.getStorageSize() - sumSizesFilesINStorage(storage)) < file.getSize()) {
            throw new Exception(" no free space in the storage " + storage.getId());
        }
//        if (!maxStorageSize(storage, file)) {
//            throw new Exception(" no free space in the storage " + storage.getId());
//        }

        File[] files = storage.getFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                storage.setFiles(files);
                break;
            }
        }
    }

    public void delete(Storage storage, File file) throws Exception {

        checkId(storage, file);

        File[] files = storage.getFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].equals(file) && files[i].hashCode() == file.hashCode()) {
                files[i] = null;
            }
        }
        storage.setFiles(files);
    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {

        File[] filesFrom = storageFrom.getFiles();

        for (File file : filesFrom) {
            if (file != null) {
                put(storageTo, file);
            }
        }
    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {

        put(storageTo, checkId(storageFrom, id));
    }

    private File checkId(Storage storage, File file) throws Exception {

        File[] files = storage.getFiles();
        for (File fileTest : files) {
            if (fileTest != null && fileTest.equals(file) && fileTest.hashCode() == file.hashCode())
                return fileTest;
        }
        throw new Exception(" in storage " + storage.getId() + " file with id " + file.getId() + " not found");
    }

    private File checkId(Storage storage, long id) throws Exception {

        for (File file : storage.getFiles()) {
            if (file != null && file.getId() == id)
                return file;
        }
        throw new Exception(" in storage " + storage.getId() + " file with id " + id + " not found");
    }

    /*
    проверка расширения
     */
    private boolean checkFormat(Storage storage, File file) {

        String[] strArr = storage.getFormatsSupported();
        for (String str : strArr) {
            if (file.getFormat().equals(str)) return true;
        }
        return false;
    }

    /*
    проверка максимального размера хранилища
     */
//    private boolean maxStorageSize(Storage storage, File file) {
//
//        if ((storage.getStorageSize() - sumSizesFilesINStorage(storage)) < file.getSize()) {
//            return false;
//        }
//        return true;
//    }

    private long sumSizesFilesINStorage(Storage storage) {

        long sum = 0;
        for (File file : storage.getFiles()) {
            if (file != null) {
                sum += file.getSize();
            }
        }
        return sum;
    }
}
