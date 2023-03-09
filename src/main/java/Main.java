import java.io.IOException;

/**
 * Clase Main donde instanciaremos el cliente FTP con sus credenciales
 * @author AlexRG
 */
public class Main {

    public static void main(String[] args) throws IOException {

        FTP ftp = new FTP("android", "android", "192.168.1.251", 2221);

        /**
         * Conectamos el cliente al servidor
         *
         * @method conectar
         */
        ftp.conectar();

        /**
         * Lista todos los ficheros del directorio introducido.
         * Ejemplo: /Download
         *
         * @method listFiles
         */
        ftp.listFiles("/opsu/Songs/758101 Co shu Nie - asphyxia (TV edit)");

        /**
         * Descarga un fichero de un directorio.
         * Ejemplo: /Downloads/songs  -  /home/alex/DOWNLOADS_ANDROID/
         *
         * @method descargarFile
         */
        ftp.descargarFile("/path/to/file/file.extension", "/path/to/save/file");

        /**
         * Descarga todas las carpetas y subcarpetas con sus respectivos
         * ficheros de un directorio
         * Ejemplo: Downloads
         *
         * @method descargarDir
         */
        ftp.descargarDir("/path/to/dir", "/home/alex/DOWNLOADS_ANDROID");

        /**
         * Sube un archivo desde el cliente al servidor FTP, en mi caso el
         * teléfono.
         *
         * @method subirFile
         */
        ftp.subirFile("/path/to/file/file.extension", "/file.extension");

        /**
         * Desconectamos el cliente
         *
         * @method desconectar
         */
        ftp.desconectar();

    }

}
