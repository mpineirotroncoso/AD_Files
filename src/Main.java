public class Main {
    public static void main(String[] args) {
        File file = new File();

        // 1
        String dirName = "/home/dam/IdeaProjects/archivos/arquivosdir/";
        if (!file.eDirectorio(dirName)) {
            file.creaDirectorio(dirName);
        }

        // 2
        String fileName = "Products1.txt";
        if (!file.eFicheiro(dirName + fileName)) {
            file.creaFicheiro(dirName, fileName);
        }

        // 3
        if (!file.eDirectorio(dirName + "subdir/")) {
            file.creaDirectorio(dirName + "subdir/");
        }
        if (!file.eFicheiro(dirName + "subdir/Products2.txt")) {
            file.creaFicheiro(dirName + "subdir/", "Products2.txt");
        }

        // 4
        file.mContido(dirName);

        // 5
        file.modoAcceso(dirName,"Products1.txt");
        file.longitudFicheiro(dirName,"Products1.txt");

        // 6
        file.mLectura(dirName,"Products1.txt");

        // 7
        file.mEscritura(dirName,"Products1.txt");

        // 8
        file.borraFicheiro(dirName,"Products1.txt");

        // 9
        file.borraFicheiro(dirName,"Products1.txt");
        file.borraFicheiro(dirName,"subdir/Products2.txt");
        file.borraDirectorio(dirName + "subdir/");
        file.borraDirectorio(dirName);

        // 10
        java.io.File fileRecur = new java.io.File (dirName);
        file.recur(fileRecur);
    }
}